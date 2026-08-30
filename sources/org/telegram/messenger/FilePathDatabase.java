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
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.CacheByChatsController;
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
        public final int f16659dc;
        public final long f16660id;
        public final int type;

        public PathData(long j10, int i10, int i11) {
            this.f16660id = j10;
            this.f16659dc = i10;
            this.type = i11;
        }
    }

    public FilePathDatabase(int i10) {
        this.currentAccount = i10;
    }

    private void createBackup() {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, android.support.v4.media.a.m(this.currentAccount, "/", new StringBuilder("account")));
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

    private void ensureQueueExist() {
        if (this.dispatchQueue == null) {
            synchronized (this) {
                try {
                    if (this.dispatchQueue == null) {
                        DispatchQueue dispatchQueue = new DispatchQueue("files_database_queue_" + this.currentAccount);
                        this.dispatchQueue = dispatchQueue;
                        dispatchQueue.setPriority(10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void lambda$checkMediaExistance$2(ArrayList arrayList, long[] jArr, CountDownLatch countDownLatch) {
        long currentTimeMillis = System.currentTimeMillis();
        ensureDatabaseCreated();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                ((MessageObject) arrayList.get(i10)).checkMediaExistance(false);
            } catch (Throwable th2) {
                try {
                    FileLog.e(th2);
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            }
        }
        jArr[0] = System.currentTimeMillis() - currentTimeMillis;
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

    public void lambda$getPath$0(long r7, int r9, int r10, java.lang.String[] r11, long r12, java.util.concurrent.CountDownLatch r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FilePathDatabase.lambda$getPath$0(long, int, int, java.lang.String[], long, java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$hasAnotherRefOnFile$4(String str, boolean[] zArr, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str + "'", new Object[0]).next()) {
                zArr[0] = true;
            }
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            countDownLatch.countDown();
        }
    }

    public void lambda$isLocallyCreated$8(String str, boolean[] zArr, CountDownLatch countDownLatch) {
        ensureDatabaseCreated();
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT flags FROM paths WHERE path = '" + str + "'", new Object[0]);
            if (queryFinalized.next()) {
                boolean z4 = true;
                if ((queryFinalized.intValue(0) & 1) == 0) {
                    z4 = false;
                }
                zArr[0] = z4;
            }
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            countDownLatch.countDown();
        }
    }

    public void lambda$lookupFiles$7(ArrayList arrayList, LongSparseArray longSparseArray, CountDownLatch countDownLatch) {
        boolean z4;
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
                        CacheByChatsController.KeepMediaFile keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList.get(i10);
                        if (fileDialogId.messageType == 23) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        keepMediaFile.isStory = z4;
                        arrayList2.add((CacheByChatsController.KeepMediaFile) arrayList.get(i10));
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                FileLog.e(th2);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public void lambda$putPath$1(long r7, int r9, int r10, java.lang.String r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FilePathDatabase.lambda$putPath$1(long, int, int, java.lang.String, int):void");
    }

    public void lambda$removeFiles$6(List list) {
        try {
            ensureDatabaseCreated();
            this.database.beginTransaction();
            for (int i10 = 0; i10 < list.size(); i10++) {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteDatabase.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + shield(((mh.a) list.get(i10)).f14169a.getPath()) + "'").stepThis().dispose();
            }
        } catch (Throwable th2) {
            try {
                FileLog.e(th2);
            } finally {
                this.database.commitTransaction();
            }
        }
    }

    public void lambda$saveFileDialogId$5(File file, FileMeta fileMeta) {
        ensureDatabaseCreated();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, shield(file.getPath()));
                sQLitePreparedStatement.bindLong(2, fileMeta.dialogId);
                sQLitePreparedStatement.bindInteger(3, fileMeta.messageId);
                sQLitePreparedStatement.bindInteger(4, fileMeta.messageType);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private void migrateDatabase(int i10) {
        if (i10 == 1) {
            kh.a2.y(this.database, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            kh.a2.y(this.database, "PRAGMA user_version = 2");
            i10 = 2;
        }
        if (i10 == 2) {
            kh.a2.y(this.database, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            kh.a2.y(this.database, "PRAGMA user_version = 3");
            i10 = 3;
        }
        if (i10 == 3) {
            kh.a2.y(this.database, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            kh.a2.y(this.database, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            kh.a2.y(this.database, "PRAGMA user_version = 4");
            i10 = 4;
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            return;
        }
        try {
            this.database.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        kh.a2.y(this.database, "PRAGMA user_version = 7");
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
            File file = new File(filesDirFixed, android.support.v4.media.a.m(this.currentAccount, "/", new StringBuilder("account")));
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

    private String shield(String str) {
        return str.replace("'", "").replace("\"", "");
    }

    public void checkMediaExistance(ArrayList<MessageObject> arrayList) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = new long[1];
            postToFrontRunnable(new sk(this, arrayList2, jArr, countDownLatch, 6));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                FileLog.e(e);
            }
            StringBuilder sb = new StringBuilder("checkMediaExistance size=");
            sb.append(arrayList.size());
            sb.append(" time=");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" thread_time=");
            kh.a2.x(sb, jArr[0]);
            if (BuildVars.DEBUG_VERSION && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                FileLog.e(new Exception("warning, not allowed in main thread"));
            }
        }
    }

    public void clear() {
        this.cache.clear();
        postRunnable(new e1(this, 21));
    }

    public void createDatabase(int i10, boolean z4) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, android.support.v4.media.a.m(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            filesDirFixed = file;
        }
        this.cacheFile = new File(filesDirFixed, "file_to_path.db");
        this.shmCacheFile = new File(filesDirFixed, "file_to_path.db-shm");
        boolean exists = this.cacheFile.exists();
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
            this.database = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            if (!exists) {
                this.database.executeFast("CREATE TABLE paths(document_id INTEGER, dc_id INTEGER, type INTEGER, path TEXT, flags INTEGER, PRIMARY KEY(document_id, dc_id, type));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER, message_id INTEGER, message_type INTEGER);").stepThis().dispose();
                this.database.executeFast("PRAGMA user_version = 7").stepThis().dispose();
            } else {
                int intValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current files db version = " + intValue);
                }
                if (intValue != 0) {
                    migrateDatabase(intValue);
                } else {
                    throw new Exception("malformed");
                }
            }
            if (!z4) {
                createBackup();
            }
            FileLog.d("files db created from_backup= " + z4);
        } catch (Exception e) {
            if (i10 < 4) {
                if (!z4 && restoreBackup()) {
                    createDatabase(i10 + 1, true);
                    return;
                }
                this.cacheFile.delete();
                this.shmCacheFile.delete();
                createDatabase(i10 + 1, false);
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(e);
            }
        }
    }

    public void ensureDatabaseCreated() {
        if (!this.databaseCreated) {
            if (!NativeLoader.loaded()) {
                int i10 = 0;
                while (!NativeLoader.loaded()) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
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
    }

    public FileMeta getFileDialogId(File file, FileMeta fileMeta) {
        int i10;
        int i11;
        SQLiteCursor sQLiteCursor = null;
        if (file == null) {
            return null;
        }
        if (fileMeta == null) {
            fileMeta = this.metaTmp;
        }
        int i12 = 0;
        long j10 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT dialog_id, message_id, message_type FROM paths_by_dialog_id WHERE path = '" + shield(file.getPath()) + "'", new Object[0]);
                if (sQLiteCursor.next()) {
                    j10 = sQLiteCursor.longValue(0);
                    i10 = sQLiteCursor.intValue(1);
                    try {
                        i12 = i10;
                        i11 = sQLiteCursor.intValue(2);
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        i12 = i10;
                        i11 = 0;
                        fileMeta.dialogId = j10;
                        fileMeta.messageId = i12;
                        fileMeta.messageType = i11;
                        return fileMeta;
                    }
                } else {
                    i11 = 0;
                }
                sQLiteCursor.dispose();
            } catch (Exception e6) {
                e = e6;
                i10 = 0;
            }
            fileMeta.dialogId = j10;
            fileMeta.messageId = i12;
            fileMeta.messageType = i11;
            return fileMeta;
        } finally {
            if (0 != 0) {
                sQLiteCursor.dispose();
            }
        }
    }

    public java.lang.String getPath(final long r21, final int r23, final int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FilePathDatabase.getPath(long, int, int, boolean):java.lang.String");
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
        } catch (InterruptedException e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public boolean isLocallyCreated(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = {false};
        postRunnable(new h3(this, str, zArr, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.e(e);
        }
        return zArr[0];
    }

    public LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> lookupFiles(ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> longSparseArray = new LongSparseArray<>();
        postRunnable(new sk(this, arrayList, longSparseArray, countDownLatch, 5));
        try {
            countDownLatch.await();
            return longSparseArray;
        } catch (InterruptedException e) {
            FileLog.e(e);
            return longSparseArray;
        }
    }

    public void putPath(long j10, int i10, int i11, int i12, String str) {
        postRunnable(new i3(this, j10, i10, i11, str, i12));
    }

    public void removeFiles(List<mh.a> list) {
        postRunnable(new d2(9, this, list));
    }

    public void saveFileDialogId(File file, FileMeta fileMeta) {
        if (file != null && fileMeta != null) {
            postRunnable(new g0(this, file, fileMeta, 23));
        }
    }
}
