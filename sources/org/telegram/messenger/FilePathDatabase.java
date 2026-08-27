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

    public static class PathData {

        public final int f19612dc;

        public final long f19613id;
        public final int type;

        public PathData(long j10, int i10, int i11) {
            this.f19613id = j10;
            this.f19612dc = i10;
            this.type = i11;
        }
    }

    public FilePathDatabase(int i10) {
        this.currentAccount = i10;
    }

    private void createBackup() {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, a9.p.k(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            filesDirFixed = file;
        }
        File file2 = new File(filesDirFixed, "file_to_path_backup.db");
        try {
            AndroidUtilities.copyFile(this.cacheFile, file2);
            FileLog.d("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e9) {
            e9.printStackTrace();
        }
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

    public void lambda$checkMediaExistance$2(ArrayList arrayList, long[] jArr, CountDownLatch countDownLatch) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ensureDatabaseCreated();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                ((MessageObject) arrayList.get(i10)).checkMediaExistance(false);
            } catch (Throwable th) {
                try {
                    FileLog.e(th);
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            }
        }
        jArr[0] = System.currentTimeMillis() - jCurrentTimeMillis;
        countDownLatch.countDown();
    }

    public void lambda$clear$3() {
        ensureDatabaseCreated();
        try {
            this.database.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
            this.database.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$getPath$0(long j10, int i10, int i11, String[] strArr, long j11, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            SQLiteCursor sQLiteCursorQueryFinalized = null;
            try {
                sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j10 + " AND dc_id = " + i10 + " AND type = " + i11, new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    strArr[0] = sQLiteCursorQueryFinalized.stringValue(0);
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("get file path id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=" + strArr[0] + " in " + (System.currentTimeMillis() - j11) + "ms");
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

    public void lambda$hasAnotherRefOnFile$4(String str, boolean[] zArr, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        try {
            if (this.database.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str + "'", new Object[0]).next()) {
                zArr[0] = true;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        } finally {
            countDownLatch.countDown();
        }
    }

    public void lambda$isLocallyCreated$8(String str, boolean[] zArr, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT flags FROM paths WHERE path = '" + str + "'", new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                boolean z10 = true;
                if ((sQLiteCursorQueryFinalized.intValue(0) & 1) == 0) {
                    z10 = false;
                }
                zArr[0] = z10;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        } finally {
            countDownLatch.countDown();
        }
    }

    public void lambda$lookupFiles$7(ArrayList arrayList, LongSparseArray longSparseArray, CountDownLatch countDownLatch) {
        try {
            ensureDatabaseCreated();
            FileMeta fileMeta = new FileMeta();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                FileMeta fileDialogId = getFileDialogId(((CacheByChatsController.KeepMediaFile) arrayList.get(i10)).file, fileMeta);
                if (fileDialogId != null) {
                    long j10 = fileDialogId.dialogId;
                    if (j10 != 0) {
                        ArrayList arrayList2 = (ArrayList) longSparseArray.get(j10);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            longSparseArray.put(fileDialogId.dialogId, arrayList2);
                        }
                        ((CacheByChatsController.KeepMediaFile) arrayList.get(i10)).isStory = fileDialogId.messageType == 23;
                        arrayList2.add((CacheByChatsController.KeepMediaFile) arrayList.get(i10));
                    }
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public void lambda$putPath$1(long j10, int i10, int i11, String str, int i12) throws Throwable {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("put file path id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=" + str);
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
                    sQLitePreparedStatementExecuteFast.bindLong(1, j10);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, i10);
                    sQLitePreparedStatementExecuteFast.bindInteger(3, i11);
                    sQLitePreparedStatementExecuteFast.bindString(4, str);
                    sQLitePreparedStatementExecuteFast.bindInteger(5, i12);
                    sQLitePreparedStatementExecuteFast.step();
                    sQLitePreparedStatementExecuteFast.dispose();
                    this.cache.put(j10 + "_" + i10 + "_" + i11, str);
                    sQLitePreparedStatement2 = sQLitePreparedStatementExecuteFast;
                    sQLitePreparedStatementExecuteFast = sQLitePreparedStatementExecuteFast2;
                } catch (SQLiteException e9) {
                    e = e9;
                    sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
                    sQLitePreparedStatementExecuteFast = sQLitePreparedStatementExecuteFast2;
                    try {
                        FileLog.e(e);
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
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
                sQLiteDatabase.executeFast("DELETE FROM paths WHERE document_id = " + j10 + " AND dc_id = " + i10 + " AND type = " + i11).stepThis().dispose();
                this.cache.put(j10 + "_" + i10 + "_" + i11, "~null~");
                sQLitePreparedStatement2 = null;
            }
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            if (sQLitePreparedStatement2 != null) {
                sQLitePreparedStatement2.dispose();
            }
        } catch (SQLiteException e10) {
            e = e10;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = sQLitePreparedStatementExecuteFast;
        }
    }

    public void lambda$removeFiles$6(List list) {
        try {
            ensureDatabaseCreated();
            this.database.beginTransaction();
            for (int i10 = 0; i10 < list.size(); i10++) {
                this.database.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + shield(((ih.a) list.get(i10)).f11476a.getPath()) + "'").stepThis().dispose();
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } finally {
                this.database.commitTransaction();
            }
        }
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
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e9) {
                FileLog.e(e9);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    private void migrateDatabase(int i10) {
        if (i10 == 1) {
            i0.a.A(this.database, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            i0.a.A(this.database, "PRAGMA user_version = 2");
            i10 = 2;
        }
        if (i10 == 2) {
            i0.a.A(this.database, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            i0.a.A(this.database, "PRAGMA user_version = 3");
            i10 = 3;
        }
        if (i10 == 3) {
            i0.a.A(this.database, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            i0.a.A(this.database, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            i0.a.A(this.database, "PRAGMA user_version = 4");
            i10 = 4;
        }
        if (i10 == 4 || i10 == 5 || i10 == 6) {
            try {
                this.database.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
            } catch (Throwable th) {
                FileLog.e(th);
            }
            i0.a.A(this.database, "PRAGMA user_version = 7");
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

    private boolean restoreBackup() {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, a9.p.k(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            filesDirFixed = file;
        }
        File file2 = new File(filesDirFixed, "file_to_path_backup.db");
        if (!file2.exists()) {
            return false;
        }
        try {
            return AndroidUtilities.copyFile(file2, this.cacheFile);
        } catch (IOException e9) {
            FileLog.e(e9);
            return false;
        }
    }

    private String shield(String str) {
        return str.replace("'", "").replace("\"", "");
    }

    public void checkMediaExistance(ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[1];
        postToFrontRunnable(new lk(this, arrayList2, jArr, countDownLatch, 6));
        try {
            countDownLatch.await();
        } catch (InterruptedException e9) {
            FileLog.e(e9);
        }
        StringBuilder sb2 = new StringBuilder("checkMediaExistance size=");
        sb2.append(arrayList.size());
        sb2.append(" time=");
        sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb2.append(" thread_time=");
        i0.a.y(sb2, jArr[0]);
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            FileLog.e(new Exception("warning, not allowed in main thread"));
        }
    }

    public void clear() {
        this.cache.clear();
        postRunnable(new d1(this, 21));
    }

    public void createDatabase(int i10, boolean z10) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, a9.p.k(this.currentAccount, "/", new StringBuilder("account")));
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
            if (zExists) {
                int iIntValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current files db version = " + iIntValue);
                }
                if (iIntValue == 0) {
                    throw new Exception("malformed");
                }
                migrateDatabase(iIntValue);
            } else {
                this.database.executeFast("CREATE TABLE paths(document_id INTEGER, dc_id INTEGER, type INTEGER, path TEXT, flags INTEGER, PRIMARY KEY(document_id, dc_id, type));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER, message_id INTEGER, message_type INTEGER);").stepThis().dispose();
                this.database.executeFast("PRAGMA user_version = 7").stepThis().dispose();
            }
            if (!z10) {
                createBackup();
            }
            FileLog.d("files db created from_backup= " + z10);
        } catch (Exception e9) {
            if (i10 < 4) {
                if (!z10 && restoreBackup()) {
                    createDatabase(i10 + 1, true);
                    return;
                } else {
                    this.cacheFile.delete();
                    this.shmCacheFile.delete();
                    createDatabase(i10 + 1, false);
                }
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(e9);
            }
        }
    }

    public void ensureDatabaseCreated() {
        if (this.databaseCreated) {
            return;
        }
        if (!NativeLoader.loaded()) {
            int i10 = 0;
            while (!NativeLoader.loaded()) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e9) {
                    e9.printStackTrace();
                }
                i10++;
                if (i10 > 5) {
                    break;
                }
            }
        }
        createDatabase(0, false);
        this.databaseCreated = true;
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
        int i10 = 0;
        long jLongValue = 0;
        try {
            try {
                sQLiteCursorQueryFinalized = this.database.queryFinalized("SELECT dialog_id, message_id, message_type FROM paths_by_dialog_id WHERE path = '" + shield(file.getPath()) + "'", new Object[0]);
                if (sQLiteCursorQueryFinalized.next()) {
                    jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                    iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                    try {
                        i10 = iIntValue;
                        iIntValue2 = sQLiteCursorQueryFinalized.intValue(2);
                    } catch (Exception e9) {
                        e = e9;
                        FileLog.e(e);
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        i10 = iIntValue;
                        iIntValue2 = 0;
                    }
                } else {
                    iIntValue2 = 0;
                }
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e10) {
                e = e10;
                iIntValue = 0;
            }
            fileMeta.dialogId = jLongValue;
            fileMeta.messageId = i10;
            fileMeta.messageType = iIntValue2;
            return fileMeta;
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public String getPath(final long j10, final int i10, final int i11, boolean z10) throws Throwable {
        String str;
        SQLiteCursor sQLiteCursor;
        String strStringValue;
        String str2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = j10 + "_" + i10 + "_" + i11;
        String str4 = this.cache.get(str3);
        if (str4 == "~null~") {
            if (!BuildVars.DEBUG_VERSION) {
                return null;
            }
            FileLog.d("get file path cached null id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=null in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            return null;
        }
        if (str4 != null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("get file path cached id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=" + str4 + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
            return str4;
        }
        DispatchQueue dispatchQueue = this.dispatchQueue;
        if ((dispatchQueue == null || dispatchQueue.getHandler() == null || Thread.currentThread() != this.dispatchQueue.getHandler().getLooper().getThread()) ? z10 : false) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final String[] strArr = new String[1];
            postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f20630a.lambda$getPath$0(j10, i10, i11, strArr, jCurrentTimeMillis, countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (Exception unused) {
            }
            String str5 = strArr[0];
            if (str5 != null) {
                this.cache.put(str3, str5);
            } else {
                this.cache.put(str3, "~null~");
            }
            return strArr[0];
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            try {
                str = "~null~";
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j10 + " AND dc_id = " + i10 + " AND type = " + i11, new Object[0]);
                    try {
                        try {
                            if (sQLiteCursorQueryFinalized.next()) {
                                strStringValue = sQLiteCursorQueryFinalized.stringValue(0);
                                try {
                                    if (BuildVars.DEBUG_VERSION) {
                                        FileLog.d("get file path id=" + j10 + " dc=" + i10 + " type=" + i11 + " path=" + strStringValue + " in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                                    }
                                    str2 = strStringValue;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    sQLiteCursor = sQLiteCursorQueryFinalized;
                                    try {
                                        FileLog.e(e);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        str2 = strStringValue;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                str2 = null;
                            }
                            sQLiteCursorQueryFinalized.dispose();
                        } catch (SQLiteException e10) {
                            e = e10;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            strStringValue = null;
                        }
                        if (str2 != null) {
                            this.cache.put(str3, str2);
                        } else {
                            this.cache.put(str3, str);
                        }
                        return str2;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    strStringValue = null;
                    sQLiteCursor = null;
                    FileLog.e(e);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    str2 = strStringValue;
                    if (str2 != null) {
                        this.cache.put(str3, str2);
                    } else {
                        this.cache.put(str3, str);
                    }
                    return str2;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor = null;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str = "~null~";
        }
    }

    public DispatchQueue getQueue() {
        ensureQueueExist();
        return this.dispatchQueue;
    }

    public boolean hasAnotherRefOnFile(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = {false};
        postRunnable(new h3(this, str, zArr, countDownLatch, 1));
        try {
            countDownLatch.await();
        } catch (InterruptedException e9) {
            FileLog.e(e9);
        }
        return zArr[0];
    }

    public boolean isLocallyCreated(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = {false};
        postRunnable(new h3(this, str, zArr, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (InterruptedException e9) {
            FileLog.e(e9);
        }
        return zArr[0];
    }

    public LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> lookupFiles(ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> longSparseArray = new LongSparseArray<>();
        postRunnable(new lk(this, arrayList, longSparseArray, countDownLatch, 5));
        try {
            countDownLatch.await();
            return longSparseArray;
        } catch (InterruptedException e9) {
            FileLog.e(e9);
            return longSparseArray;
        }
    }

    public void putPath(long j10, int i10, int i11, int i12, String str) {
        postRunnable(new i3(this, j10, i10, i11, str, i12));
    }

    public void removeFiles(List<ih.a> list) {
        postRunnable(new d2(8, this, list));
    }

    public void saveFileDialogId(File file, FileMeta fileMeta) {
        if (file == null || fileMeta == null) {
            return;
        }
        postRunnable(new f0(this, file, fileMeta, 23));
    }
}
