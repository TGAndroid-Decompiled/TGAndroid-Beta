package org.telegram.messenger;

import android.os.Looper;
import android.util.LongSparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.ui.Storage.CacheModel;

public class FilePathDatabase {
    private static final String DATABASE_BACKUP_NAME = "file_to_path_backup";
    private static final String DATABASE_NAME = "file_to_path";
    public static final int FLAG_LOCALLY_CREATED = 1;
    private static final int LAST_DB_VERSION = 7;
    public static final int MESSAGE_TYPE_VIDEO_MESSAGE = 0;
    private File cacheFile;
    private final int currentAccount;
    private SQLiteDatabase database;
    boolean databaseCreated;
    private DispatchQueue dispatchQueue;
    private File shmCacheFile;
    private final String NULL_PATH = "~null~";
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();
    private final FileMeta metaTmp = new FileMeta();

    public static class FileMeta {
        public long dialogId;
        public int messageId;
        public long messageSize;
        public int messageType;
    }

    public FilePathDatabase(int i) {
        this.currentAccount = i;
    }

    public void createDatabase(int i, boolean z) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, "account" + this.currentAccount + "/");
            file.mkdirs();
            filesDirFixed = file;
        }
        this.cacheFile = new File(filesDirFixed, "file_to_path.db");
        this.shmCacheFile = new File(filesDirFixed, "file_to_path.db-shm");
        boolean zExists = this.cacheFile.exists();
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
            this.database = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            if (!zExists) {
                this.database.executeFast("CREATE TABLE paths(document_id INTEGER, dc_id INTEGER, type INTEGER, path TEXT, flags INTEGER, PRIMARY KEY(document_id, dc_id, type));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER, message_id INTEGER, message_type INTEGER);").stepThis().dispose();
                this.database.executeFast("PRAGMA user_version = 7").stepThis().dispose();
            } else {
                int iIntValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current files db version = " + iIntValue);
                }
                if (iIntValue == 0) {
                    throw new Exception("malformed");
                }
                migrateDatabase(iIntValue);
            }
            if (!z) {
                createBackup();
            }
            FileLog.d("files db created from_backup= " + z);
        } catch (Exception e) {
            if (i < 4) {
                if (!z && restoreBackup()) {
                    createDatabase(i + 1, true);
                    return;
                } else {
                    this.cacheFile.delete();
                    this.shmCacheFile.delete();
                    createDatabase(i + 1, false);
                }
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(e);
            }
        }
    }

    private void migrateDatabase(int i) {
        if (i == 1) {
            this.database.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
            this.database.executeFast("PRAGMA user_version = 2").stepThis().dispose();
            i = 2;
        }
        if (i == 2) {
            this.database.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);").stepThis().dispose();
            this.database.executeFast("PRAGMA user_version = 3").stepThis().dispose();
            i = 3;
        }
        if (i == 3) {
            this.database.executeFast("ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0").stepThis().dispose();
            this.database.executeFast("ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0").stepThis().dispose();
            this.database.executeFast("PRAGMA user_version = 4").stepThis().dispose();
            i = 4;
        }
        if (i == 4 || i == 5 || i == 6) {
            try {
                this.database.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            } catch (Throwable th) {
                FileLog.e(th);
            }
            this.database.executeFast("PRAGMA user_version = 7").stepThis().dispose();
        }
    }

    private void createBackup() {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, "account" + this.currentAccount + "/");
            file.mkdirs();
            filesDirFixed = file;
        }
        File file2 = new File(filesDirFixed, "file_to_path_backup.db");
        try {
            AndroidUtilities.copyFile(this.cacheFile, file2);
            FileLog.d("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean restoreBackup() {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, "account" + this.currentAccount + "/");
            file.mkdirs();
            filesDirFixed = file;
        }
        File file2 = new File(filesDirFixed, "file_to_path_backup.db");
        if (!file2.exists()) {
            return false;
        }
        try {
            return AndroidUtilities.copyFile(file2, this.cacheFile);
        } catch (IOException e) {
            FileLog.e(e);
            return false;
        }
    }

    public String getPath(final long j, final int i, final int i2, boolean z) {
        String str;
        String str2;
        SQLiteCursor sQLiteCursor;
        String str3;
        String strStringValue;
        SQLiteCursor sQLiteCursorQueryFinalized;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String str4 = j + "_" + i + "_" + i2;
        String str5 = this.cache.get(str4);
        if (str5 == "~null~") {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("get file path cached null id=" + j + " dc=" + i + " type=" + i2 + " path=" + ((Object) null) + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            return null;
        }
        if (str5 != null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("get file path cached id=" + j + " dc=" + i + " type=" + i2 + " path=" + str5 + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            return str5;
        }
        DispatchQueue dispatchQueue = this.dispatchQueue;
        if ((dispatchQueue == null || dispatchQueue.getHandler() == null || Thread.currentThread() != this.dispatchQueue.getHandler().getLooper().getThread()) ? z : false) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final String[] strArr = new String[1];
            postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getPath$0(j, i, i2, strArr, jCurrentTimeMillis, countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (Exception unused) {
            }
            String str6 = strArr[0];
            if (str6 != null) {
                this.cache.put(str4, str6);
            } else {
                this.cache.put(str4, "~null~");
            }
            return strArr[0];
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            try {
                StringBuilder sb = new StringBuilder();
                str2 = "~null~";
                try {
                    sb.append("SELECT path FROM paths WHERE document_id = ");
                    sb.append(j);
                    sb.append(" AND dc_id = ");
                    sb.append(i);
                    sb.append(" AND type = ");
                    sb.append(i2);
                    str = str4;
                    try {
                        sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                        try {
                            try {
                                if (sQLiteCursorQueryFinalized.next()) {
                                    strStringValue = sQLiteCursorQueryFinalized.stringValue(0);
                                    try {
                                        if (BuildVars.DEBUG_VERSION) {
                                            FileLog.d("get file path id=" + j + " dc=" + i + " type=" + i2 + " path=" + strStringValue + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                                        }
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str3 = strStringValue;
                                        sQLiteCursor = sQLiteCursorQueryFinalized;
                                        try {
                                            FileLog.e(e);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursorQueryFinalized = sQLiteCursor;
                                                strStringValue = str3;
                                            } else {
                                                strStringValue = str3;
                                            }
                                            if (strStringValue != null) {
                                                this.cache.put(str, strStringValue);
                                            } else {
                                                this.cache.put(str, str2);
                                            }
                                            return strStringValue;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    strStringValue = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            str3 = null;
                            FileLog.e(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursorQueryFinalized = sQLiteCursor;
                                strStringValue = str3;
                                sQLiteCursorQueryFinalized.dispose();
                            } else {
                                strStringValue = str3;
                            }
                            if (strStringValue != null) {
                                this.cache.put(str, strStringValue);
                            } else {
                                this.cache.put(str, str2);
                            }
                            return strStringValue;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        sQLiteCursor = null;
                        str3 = null;
                        FileLog.e(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursorQueryFinalized = sQLiteCursor;
                            strStringValue = str3;
                            sQLiteCursorQueryFinalized.dispose();
                        } else {
                            strStringValue = str3;
                        }
                        if (strStringValue != null) {
                            this.cache.put(str, strStringValue);
                        } else {
                            this.cache.put(str, str2);
                        }
                        return strStringValue;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str = str4;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = null;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str = str4;
            str2 = "~null~";
        }
        sQLiteCursorQueryFinalized.dispose();
        if (strStringValue != null) {
            this.cache.put(str, strStringValue);
        } else {
            this.cache.put(str, str2);
        }
        return strStringValue;
    }

    public void lambda$getPath$0(long j, int i, int i2, String[] strArr, long j2, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            SQLiteCursor sQLiteCursorQueryFinalized = null;
            try {
                sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j + " AND dc_id = " + i + " AND type = " + i2, new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    strArr[0] = sQLiteCursorQueryFinalized.stringValue(0);
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("get file path id=" + j + " dc=" + i + " type=" + i2 + " path=" + strArr[0] + " in " + (System.currentTimeMillis() - j2) + "ms");
                    }
                }
            } catch (Throwable th) {
                try {
                    FileLog.e(th);
                    if (sQLiteCursorQueryFinalized != null) {
                    }
                    countDownLatch.countDown();
                } catch (Throwable th2) {
                    if (sQLiteCursorQueryFinalized != null) {
                        sQLiteCursorQueryFinalized.dispose();
                    }
                    throw th2;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        }
        countDownLatch.countDown();
    }

    public void ensureDatabaseCreated() {
        if (this.databaseCreated) {
            return;
        }
        if (!NativeLoader.loaded()) {
            int i = 0;
            while (!NativeLoader.loaded()) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i > 5) {
                    break;
                }
            }
        }
        createDatabase(0, false);
        this.databaseCreated = true;
    }

    public void putPath(final long j, final int i, final int i2, final int i3, final String str) {
        postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$putPath$1(j, i, i2, str, i3);
            }
        });
    }

    public void lambda$putPath$1(long j, int i, int i2, String str, int i3) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("put file path id=" + j + " dc=" + i + " type=" + i2 + " path=" + str);
        }
        ensureDatabaseCreated();
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            return;
        }
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            if (str != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = sQLiteDatabase.executeFast("DELETE FROM paths WHERE path = ?");
                try {
                    sQLitePreparedStatementExecuteFast2.bindString(1, str);
                    sQLitePreparedStatementExecuteFast2.step();
                    sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO paths VALUES(?, ?, ?, ?, ?)");
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, j);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                    sQLitePreparedStatementExecuteFast.bindInteger(3, i2);
                    sQLitePreparedStatementExecuteFast.bindString(4, str);
                    sQLitePreparedStatementExecuteFast.bindInteger(5, i3);
                    sQLitePreparedStatementExecuteFast.step();
                    sQLitePreparedStatementExecuteFast.dispose();
                    this.cache.put(j + "_" + i + "_" + i2, str);
                    sQLitePreparedStatement2 = sQLitePreparedStatementExecuteFast;
                    sQLitePreparedStatementExecuteFast = sQLitePreparedStatementExecuteFast2;
                } catch (SQLiteException e) {
                    e = e;
                    sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                    sQLitePreparedStatementExecuteFast = sQLitePreparedStatementExecuteFast2;
                    try {
                        FileLog.e(e);
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        } else {
                            sQLitePreparedStatement2 = sQLitePreparedStatement;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                    sQLitePreparedStatementExecuteFast = sQLitePreparedStatementExecuteFast2;
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            } else {
                sQLiteDatabase.executeFast("DELETE FROM paths WHERE document_id = " + j + " AND dc_id = " + i + " AND type = " + i2).stepThis().dispose();
                this.cache.put(j + "_" + i + "_" + i2, "~null~");
                sQLitePreparedStatement2 = null;
            }
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            if (sQLitePreparedStatement2 == null) {
                return;
            }
        } catch (SQLiteException e2) {
            e = e2;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
        }
        sQLitePreparedStatement2.dispose();
    }

    public void checkMediaExistance(ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(arrayList);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        final long[] jArr = new long[1];
        postToFrontRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkMediaExistance$2(arrayList2, jArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.e(e);
        }
        FileLog.d("checkMediaExistance size=" + arrayList.size() + " time=" + (System.currentTimeMillis() - jCurrentTimeMillis) + " thread_time=" + jArr[0]);
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            FileLog.e(new Exception("warning, not allowed in main thread"));
        }
    }

    public void lambda$checkMediaExistance$2(ArrayList arrayList, long[] jArr, CountDownLatch countDownLatch) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ensureDatabaseCreated();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                ((MessageObject) arrayList.get(i)).checkMediaExistance(false);
            } catch (Throwable th) {
                try {
                    FileLog.e(th);
                } finally {
                    countDownLatch.countDown();
                }
            }
        }
        jArr[0] = System.currentTimeMillis() - jCurrentTimeMillis;
    }

    public void clear() {
        this.cache.clear();
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$clear$3();
            }
        });
    }

    public void lambda$clear$3() {
        ensureDatabaseCreated();
        try {
            this.database.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
            this.database.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean hasAnotherRefOnFile(final String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$hasAnotherRefOnFile$4(str, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public void lambda$hasAnotherRefOnFile$4(String str, boolean[] zArr, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        try {
            try {
                if (this.database.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str + "'", new Object[0]).next()) {
                    zArr[0] = true;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public void saveFileDialogId(final File file, final FileMeta fileMeta) {
        if (file == null || fileMeta == null) {
            return;
        }
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveFileDialogId$5(file, fileMeta);
            }
        });
    }

    public void lambda$saveFileDialogId$5(File file, FileMeta fileMeta) {
        ensureDatabaseCreated();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                sQLitePreparedStatementExecuteFast = this.database.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindString(1, shield(file.getPath()));
                sQLitePreparedStatementExecuteFast.bindLong(2, fileMeta.dialogId);
                sQLitePreparedStatementExecuteFast.bindInteger(3, fileMeta.messageId);
                sQLitePreparedStatementExecuteFast.bindInteger(4, fileMeta.messageType);
                sQLitePreparedStatementExecuteFast.step();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public FileMeta getFileDialogId(File file, FileMeta fileMeta) {
        int iIntValue;
        int iIntValue2;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        if (file == null) {
            return null;
        }
        if (fileMeta == null) {
            fileMeta = this.metaTmp;
        }
        int i = 0;
        long jLongValue = 0;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT dialog_id, message_id, message_type FROM paths_by_dialog_id WHERE path = '" + shield(file.getPath()) + "'", new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                    iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                    try {
                        i = iIntValue;
                        iIntValue2 = sQLiteCursorQueryFinalized.intValue(2);
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        if (sQLiteCursorQueryFinalized != null) {
                            i = iIntValue;
                            iIntValue2 = 0;
                        }
                        fileMeta.dialogId = jLongValue;
                        fileMeta.messageId = iIntValue;
                        fileMeta.messageType = i;
                        return fileMeta;
                    }
                } else {
                    iIntValue2 = 0;
                }
            } catch (Exception e2) {
                e = e2;
                iIntValue = 0;
            }
            sQLiteCursorQueryFinalized.dispose();
            int i2 = i;
            i = iIntValue2;
            iIntValue = i2;
            fileMeta.dialogId = jLongValue;
            fileMeta.messageId = iIntValue;
            fileMeta.messageType = i;
            return fileMeta;
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    private String shield(String str) {
        return str.replace("'", "").replace("\"", "");
    }

    public DispatchQueue getQueue() {
        ensureQueueExist();
        return this.dispatchQueue;
    }

    public void removeFiles(final List<CacheModel.FileInfo> list) {
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeFiles$6(list);
            }
        });
    }

    public void lambda$removeFiles$6(List list) {
        try {
            ensureDatabaseCreated();
            this.database.beginTransaction();
            for (int i = 0; i < list.size(); i++) {
                this.database.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + shield(((CacheModel.FileInfo) list.get(i)).file.getPath()) + "'").stepThis().dispose();
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } finally {
                this.database.commitTransaction();
            }
        }
    }

    public LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> lookupFiles(final ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> longSparseArray = new LongSparseArray<>();
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$lookupFiles$7(arrayList, longSparseArray, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.e(e);
        }
        return longSparseArray;
    }

    public void lambda$lookupFiles$7(ArrayList arrayList, LongSparseArray longSparseArray, CountDownLatch countDownLatch) {
        try {
            ensureDatabaseCreated();
            FileMeta fileMeta = new FileMeta();
            for (int i = 0; i < arrayList.size(); i++) {
                FileMeta fileDialogId = getFileDialogId(((CacheByChatsController.KeepMediaFile) arrayList.get(i)).file, fileMeta);
                if (fileDialogId != null) {
                    long j = fileDialogId.dialogId;
                    if (j != 0) {
                        ArrayList arrayList2 = (ArrayList) longSparseArray.get(j);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            longSparseArray.put(fileDialogId.dialogId, arrayList2);
                        }
                        ((CacheByChatsController.KeepMediaFile) arrayList.get(i)).isStory = fileDialogId.messageType == 23;
                        arrayList2.add((CacheByChatsController.KeepMediaFile) arrayList.get(i));
                    }
                }
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    private void postRunnable(Runnable runnable) {
        ensureQueueExist();
        this.dispatchQueue.postRunnable(runnable);
    }

    private void postToFrontRunnable(Runnable runnable) {
        ensureQueueExist();
        this.dispatchQueue.postToFrontRunnable(runnable);
    }

    private void ensureQueueExist() {
        if (this.dispatchQueue == null) {
            synchronized (this) {
                try {
                    if (this.dispatchQueue == null) {
                        DispatchQueue dispatchQueue = new DispatchQueue("files_database_queue_" + this.currentAccount);
                        this.dispatchQueue = dispatchQueue;
                        dispatchQueue.setPriority(10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean isLocallyCreated(final String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$isLocallyCreated$8(str, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public void lambda$isLocallyCreated$8(String str, boolean[] zArr, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        try {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT flags FROM paths WHERE path = '" + str + "'", new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    boolean z = true;
                    if ((sQLiteCursorQueryFinalized.intValue(0) & 1) == 0) {
                        z = false;
                    }
                    zArr[0] = z;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    public static class PathData {
        public final int dc;
        public final long id;
        public final int type;

        public PathData(long j, int i, int i2) {
            this.id = j;
            this.dc = i;
            this.type = i2;
        }
    }
}
