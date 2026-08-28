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
        public final int f19639dc;
        public final long f19640id;
        public final int type;

        public PathData(long j10, int i9, int i10) {
            this.f19640id = j10;
            this.f19639dc = i9;
            this.type = i10;
        }
    }

    public FilePathDatabase(int i9) {
        this.currentAccount = i9;
    }

    private void createBackup() {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, aa.d.l(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            filesDirFixed = file;
        }
        File file2 = new File(filesDirFixed, "file_to_path_backup.db");
        try {
            AndroidUtilities.copyFile(this.cacheFile, file2);
            FileLog.d("file db backup created " + file2.getAbsolutePath());
        } catch (IOException e10) {
            e10.printStackTrace();
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
        long currentTimeMillis = System.currentTimeMillis();
        ensureDatabaseCreated();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                ((MessageObject) arrayList.get(i9)).checkMediaExistance(false);
            } catch (Throwable th) {
                try {
                    FileLog.e(th);
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
        } catch (Exception e10) {
            FileLog.e(e10);
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
        } catch (Exception e10) {
            FileLog.e(e10);
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
                boolean z10 = true;
                if ((queryFinalized.intValue(0) & 1) == 0) {
                    z10 = false;
                }
                zArr[0] = z10;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        } finally {
            countDownLatch.countDown();
        }
    }

    public void lambda$lookupFiles$7(ArrayList arrayList, LongSparseArray longSparseArray, CountDownLatch countDownLatch) {
        boolean z10;
        try {
            ensureDatabaseCreated();
            FileMeta fileMeta = new FileMeta();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                FileMeta fileDialogId = getFileDialogId(((CacheByChatsController.KeepMediaFile) arrayList.get(i9)).file, fileMeta);
                if (fileDialogId != null) {
                    long j10 = fileDialogId.dialogId;
                    if (j10 != 0) {
                        ArrayList arrayList2 = (ArrayList) longSparseArray.get(j10);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            longSparseArray.put(fileDialogId.dialogId, arrayList2);
                        }
                        CacheByChatsController.KeepMediaFile keepMediaFile = (CacheByChatsController.KeepMediaFile) arrayList.get(i9);
                        if (fileDialogId.messageType == 23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        keepMediaFile.isStory = z10;
                        arrayList2.add((CacheByChatsController.KeepMediaFile) arrayList.get(i9));
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

    public void lambda$putPath$1(long r7, int r9, int r10, java.lang.String r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FilePathDatabase.lambda$putPath$1(long, int, int, java.lang.String, int):void");
    }

    public void lambda$removeFiles$6(List list) {
        try {
            ensureDatabaseCreated();
            this.database.beginTransaction();
            for (int i9 = 0; i9 < list.size(); i9++) {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteDatabase.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + shield(((hh.a) list.get(i9)).f10780a.getPath()) + "'").stepThis().dispose();
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
            } catch (Exception e10) {
                FileLog.e(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private void migrateDatabase(int i9) {
        if (i9 == 1) {
            l0.r(this.database, "CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);");
            l0.r(this.database, "PRAGMA user_version = 2");
            i9 = 2;
        }
        if (i9 == 2) {
            l0.r(this.database, "CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);");
            l0.r(this.database, "PRAGMA user_version = 3");
            i9 = 3;
        }
        if (i9 == 3) {
            l0.r(this.database, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_id INTEGER default 0");
            l0.r(this.database, "ALTER TABLE paths_by_dialog_id ADD COLUMN message_type INTEGER default 0");
            l0.r(this.database, "PRAGMA user_version = 4");
            i9 = 4;
        }
        if (i9 != 4 && i9 != 5 && i9 != 6) {
            return;
        }
        try {
            this.database.executeFast("ALTER TABLE paths ADD COLUMN flags INTEGER default 0").stepThis().dispose();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        l0.r(this.database, "PRAGMA user_version = 7");
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
            File file = new File(filesDirFixed, aa.d.l(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            filesDirFixed = file;
        }
        File file2 = new File(filesDirFixed, "file_to_path_backup.db");
        if (!file2.exists()) {
            return false;
        }
        try {
            return AndroidUtilities.copyFile(file2, this.cacheFile);
        } catch (IOException e10) {
            FileLog.e(e10);
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
            postToFrontRunnable(new gk(this, arrayList2, jArr, countDownLatch, 6));
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                FileLog.e(e10);
            }
            StringBuilder sb2 = new StringBuilder("checkMediaExistance size=");
            sb2.append(arrayList.size());
            sb2.append(" time=");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" thread_time=");
            j3.r0.z(sb2, jArr[0]);
            if (BuildVars.DEBUG_VERSION && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                FileLog.e(new Exception("warning, not allowed in main thread"));
            }
        }
    }

    public void clear() {
        this.cache.clear();
        postRunnable(new e1(this, 21));
    }

    public void createDatabase(int i9, boolean z10) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, aa.d.l(this.currentAccount, "/", new StringBuilder("account")));
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
            if (!z10) {
                createBackup();
            }
            FileLog.d("files db created from_backup= " + z10);
        } catch (Exception e10) {
            if (i9 < 4) {
                if (!z10 && restoreBackup()) {
                    createDatabase(i9 + 1, true);
                    return;
                }
                this.cacheFile.delete();
                this.shmCacheFile.delete();
                createDatabase(i9 + 1, false);
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(e10);
            }
        }
    }

    public void ensureDatabaseCreated() {
        if (!this.databaseCreated) {
            if (!NativeLoader.loaded()) {
                int i9 = 0;
                while (!NativeLoader.loaded()) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                    i9++;
                    if (i9 > 5) {
                        break;
                    }
                }
            }
            createDatabase(0, false);
            this.databaseCreated = true;
        }
    }

    public FileMeta getFileDialogId(File file, FileMeta fileMeta) {
        int i9;
        int i10;
        SQLiteCursor sQLiteCursor = null;
        if (file == null) {
            return null;
        }
        if (fileMeta == null) {
            fileMeta = this.metaTmp;
        }
        int i11 = 0;
        long j10 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT dialog_id, message_id, message_type FROM paths_by_dialog_id WHERE path = '" + shield(file.getPath()) + "'", new Object[0]);
                if (sQLiteCursor.next()) {
                    j10 = sQLiteCursor.longValue(0);
                    i9 = sQLiteCursor.intValue(1);
                    try {
                        i11 = i9;
                        i10 = sQLiteCursor.intValue(2);
                    } catch (Exception e10) {
                        e = e10;
                        FileLog.e(e);
                        i11 = i9;
                        i10 = 0;
                        fileMeta.dialogId = j10;
                        fileMeta.messageId = i11;
                        fileMeta.messageType = i10;
                        return fileMeta;
                    }
                } else {
                    i10 = 0;
                }
                sQLiteCursor.dispose();
            } catch (Exception e11) {
                e = e11;
                i9 = 0;
            }
            fileMeta.dialogId = j10;
            fileMeta.messageId = i11;
            fileMeta.messageType = i10;
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
        postRunnable(new f3(this, str, zArr, countDownLatch, 1));
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            FileLog.e(e10);
        }
        return zArr[0];
    }

    public boolean isLocallyCreated(String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = {false};
        postRunnable(new f3(this, str, zArr, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            FileLog.e(e10);
        }
        return zArr[0];
    }

    public LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> lookupFiles(ArrayList<? extends CacheByChatsController.KeepMediaFile> arrayList) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> longSparseArray = new LongSparseArray<>();
        postRunnable(new gk(this, arrayList, longSparseArray, countDownLatch, 5));
        try {
            countDownLatch.await();
            return longSparseArray;
        } catch (InterruptedException e10) {
            FileLog.e(e10);
            return longSparseArray;
        }
    }

    public void putPath(long j10, int i9, int i10, int i11, String str) {
        postRunnable(new g3(this, j10, i9, i10, str, i11));
    }

    public void removeFiles(List<hh.a> list) {
        postRunnable(new c2(8, this, list));
    }

    public void saveFileDialogId(File file, FileMeta fileMeta) {
        if (file != null && fileMeta != null) {
            postRunnable(new f0(this, file, fileMeta, 23));
        }
    }
}
