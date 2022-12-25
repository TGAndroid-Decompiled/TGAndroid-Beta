package org.telegram.messenger;

import android.os.Looper;
import android.util.LongSparseArray;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.p009ui.Storage.CacheModel;

public class FilePathDatabase {
    private static final String DATABASE_BACKUP_NAME = "file_to_path_backup";
    private static final String DATABASE_NAME = "file_to_path";
    private static final int LAST_DB_VERSION = 3;
    private File cacheFile;
    private final int currentAccount;
    private SQLiteDatabase database;
    private final DispatchQueue dispatchQueue;
    private File shmCacheFile;

    public FilePathDatabase(int i) {
        this.currentAccount = i;
        DispatchQueue dispatchQueue = new DispatchQueue("files_database_queue_" + i);
        this.dispatchQueue = dispatchQueue;
        dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
        createDatabase(0, false);
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
        boolean z2 = !this.cacheFile.exists();
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
            this.database = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            if (z2) {
                this.database.executeFast("CREATE TABLE paths(document_id INTEGER, dc_id INTEGER, type INTEGER, path TEXT, PRIMARY KEY(document_id, dc_id, type));").stepThis().dispose();
                this.database.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
                this.database.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);").stepThis().dispose();
                this.database.executeFast("PRAGMA user_version = 3").stepThis().dispose();
            } else {
                int intValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m34d("current files db version = " + intValue);
                }
                if (intValue == 0) {
                    throw new Exception("malformed");
                }
                migrateDatabase(intValue);
            }
            if (!z) {
                createBackup();
            }
            FileLog.m34d("files db created from_backup= " + z);
        } catch (Exception e) {
            if (i < 4) {
                if (!z && restoreBackup()) {
                    createDatabase(i + 1, true);
                    return;
                }
                this.cacheFile.delete();
                this.shmCacheFile.delete();
                createDatabase(i + 1, false);
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.m31e(e);
            }
        }
    }

    private void migrateDatabase(int i) throws SQLiteException {
        if (i == 1) {
            this.database.executeFast("CREATE INDEX IF NOT EXISTS path_in_paths ON paths(path);").stepThis().dispose();
            this.database.executeFast("PRAGMA user_version = 2").stepThis().dispose();
            i = 2;
        }
        if (i == 2) {
            this.database.executeFast("CREATE TABLE paths_by_dialog_id(path TEXT PRIMARY KEY, dialog_id INTEGER);").stepThis().dispose();
            this.database.executeFast("PRAGMA user_version = 3").stepThis().dispose();
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
            FileLog.m34d("file db backup created " + file2.getAbsolutePath());
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
        if (file2.exists()) {
            try {
                return AndroidUtilities.copyFile(file2, this.cacheFile);
            } catch (IOException e) {
                FileLog.m31e(e);
                return false;
            }
        }
        return false;
    }

    public String getPath(final long j, final int i, final int i2, boolean z) {
        SQLiteException sQLiteException;
        String str;
        if (z) {
            if (BuildVars.DEBUG_VERSION && this.dispatchQueue.getHandler() != null && Thread.currentThread() == this.dispatchQueue.getHandler().getLooper().getThread()) {
                throw new RuntimeException("Error, lead to infinity loop");
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final String[] strArr = new String[1];
            this.dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FilePathDatabase.this.lambda$getPath$1(j, i, i2, strArr, countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (Exception unused) {
            }
            return strArr[0];
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        SQLiteCursor sQLiteCursor = null;
        r2 = null;
        String str2 = null;
        sQLiteCursor = null;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            try {
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j + " AND dc_id = " + i + " AND type = " + i2, new Object[0]);
                try {
                    if (queryFinalized.next()) {
                        str2 = queryFinalized.stringValue(0);
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.m34d("get file path id=" + j + " dc=" + i + " type=" + i2 + " path=" + str2);
                        }
                    }
                    queryFinalized.dispose();
                    return str2;
                } catch (SQLiteException e) {
                    sQLiteException = e;
                    str = str2;
                    sQLiteCursor = queryFinalized;
                    FileLog.m31e(sQLiteException);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e2) {
            sQLiteException = e2;
            str = null;
        }
    }

    public void lambda$getPath$1(long r6, int r8, int r9, java.lang.String[] r10, java.util.concurrent.CountDownLatch r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FilePathDatabase.lambda$getPath$1(long, int, int, java.lang.String[], java.util.concurrent.CountDownLatch):void");
    }

    public void putPath(final long j, final int i, final int i2, final String str) {
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$putPath$2(j, i, i2, str);
            }
        });
    }

    public void lambda$putPath$2(long r6, int r8, int r9, java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FilePathDatabase.lambda$putPath$2(long, int, int, java.lang.String):void");
    }

    public void checkMediaExistance(ArrayList<MessageObject> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(arrayList);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        long currentTimeMillis = System.currentTimeMillis();
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.lambda$checkMediaExistance$3(arrayList2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.m31e(e);
        }
        FileLog.m34d("checkMediaExistance size=" + arrayList.size() + " time=" + (System.currentTimeMillis() - currentTimeMillis));
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            FileLog.m31e(new Exception("warning, not allowed in main thread"));
        }
    }

    public static void lambda$checkMediaExistance$3(ArrayList arrayList, CountDownLatch countDownLatch) {
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                ((MessageObject) arrayList.get(i)).checkMediaExistance(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        countDownLatch.countDown();
    }

    public void clear() {
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$clear$4();
            }
        });
    }

    public void lambda$clear$4() {
        try {
            this.database.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
            this.database.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public boolean hasAnotherRefOnFile(final String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$hasAnotherRefOnFile$5(str, zArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.m31e(e);
        }
        return zArr[0];
    }

    public void lambda$hasAnotherRefOnFile$5(String str, boolean[] zArr, CountDownLatch countDownLatch) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase.queryFinalized("SELECT document_id FROM paths WHERE path = '" + str + "'", new Object[0]).next()) {
                zArr[0] = true;
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        countDownLatch.countDown();
    }

    public void saveFileDialogId(final File file, final long j) {
        if (file == null) {
            return;
        }
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$saveFileDialogId$6(file, j);
            }
        });
    }

    public void lambda$saveFileDialogId$6(File file, long j) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath());
                sQLitePreparedStatement.bindLong(2, j);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                FileLog.m31e(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public long getFileDialogId(java.io.File r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FilePathDatabase.getFileDialogId(java.io.File):long");
    }

    public DispatchQueue getQueue() {
        return this.dispatchQueue;
    }

    public void removeFiles(final List<CacheModel.FileInfo> list) {
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$removeFiles$7(list);
            }
        });
    }

    public void lambda$removeFiles$7(List list) {
        try {
            try {
                this.database.beginTransaction();
                for (int i = 0; i < list.size(); i++) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    sQLiteDatabase.executeFast("DELETE FROM paths_by_dialog_id WHERE path = '" + ((CacheModel.FileInfo) list.get(i)).file.getPath() + "'").stepThis().dispose();
                }
            } catch (Exception e) {
                FileLog.m31e(e);
            }
        } finally {
            this.database.commitTransaction();
        }
    }

    public LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> lookupFiles(final ArrayList<CacheByChatsController.KeepMediaFile> arrayList) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final LongSparseArray<ArrayList<CacheByChatsController.KeepMediaFile>> longSparseArray = new LongSparseArray<>();
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$lookupFiles$8(arrayList, longSparseArray, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            FileLog.m31e(e);
        }
        return longSparseArray;
    }

    public void lambda$lookupFiles$8(ArrayList arrayList, LongSparseArray longSparseArray, CountDownLatch countDownLatch) {
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                long fileDialogId = getFileDialogId(((CacheByChatsController.KeepMediaFile) arrayList.get(i)).file);
                if (fileDialogId != 0) {
                    ArrayList arrayList2 = (ArrayList) longSparseArray.get(fileDialogId);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        longSparseArray.put(fileDialogId, arrayList2);
                    }
                    arrayList2.add((CacheByChatsController.KeepMediaFile) arrayList.get(i));
                }
            } catch (Exception e) {
                FileLog.m31e(e);
            }
        }
        countDownLatch.countDown();
    }

    public static class PathData {
        public final int f808dc;
        public final long f809id;
        public final int type;

        public PathData(long j, int i, int i2) {
            this.f809id = j;
            this.f808dc = i;
            this.type = i2;
        }
    }
}
