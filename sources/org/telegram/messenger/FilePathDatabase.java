package org.telegram.messenger;

import android.os.Looper;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;

public class FilePathDatabase {
    private static final String DATABASE_NAME = "file_to_path";
    private static final int LAST_DB_VERSION = 1;
    private File cacheFile;
    private final int currentAccount;
    private SQLiteDatabase database;
    private final DispatchQueue dispatchQueue;
    private File shmCacheFile;
    private File walCacheFile;

    public FilePathDatabase(int i) {
        DispatchQueue dispatchQueue = new DispatchQueue("files_database");
        this.dispatchQueue = dispatchQueue;
        this.currentAccount = i;
        dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, "account" + this.currentAccount + "/");
            file.mkdirs();
            filesDirFixed = file;
        }
        this.cacheFile = new File(filesDirFixed, "file_to_path.db");
        this.shmCacheFile = new File(filesDirFixed, "file_to_path.db-shm");
        boolean z = !this.cacheFile.exists();
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
            this.database = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            if (z) {
                this.database.executeFast("CREATE TABLE paths(document_id INTEGER, dc_id INTEGER, type INTEGER, path TEXT, PRIMARY KEY(document_id, dc_id, type));").stepThis().dispose();
                this.database.executeFast("PRAGMA user_version = 1").stepThis().dispose();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getPath(final long j, final int i, final int i2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        long currentTimeMillis = System.currentTimeMillis();
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$getPath$1(j, i, i2, strArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                new Exception("warning in main thread").printStackTrace();
            }
            Log.d("kek", "time=" + (System.currentTimeMillis() - currentTimeMillis) + "   " + Thread.currentThread());
            return strArr[0];
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void lambda$getPath$1(long j, int i, int i2, String[] strArr, CountDownLatch countDownLatch) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j + " AND dc_id = " + i + " AND type = " + i2, new Object[0]);
            if (queryFinalized.next()) {
                strArr[0] = queryFinalized.stringValue(0);
            }
            queryFinalized.dispose();
            countDownLatch.countDown();
        } catch (SQLiteException e) {
            throw new RuntimeException(e);
        }
    }

    public void putPath(final long j, final int i, final int i2, final String str) {
        Log.d("kek", "put file " + j + "_" + i + "     " + str);
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FilePathDatabase.this.lambda$putPath$2(str, j, i, i2);
            }
        });
    }

    public void lambda$putPath$2(String str, long j, int i, int i2) {
        try {
            if (str != null) {
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO paths VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, i);
                executeFast.bindInteger(3, i2);
                executeFast.bindString(4, str);
                executeFast.step();
                return;
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM paths WHERE document_id = " + j + " AND dc_id = " + i + " AND type = " + i2).stepThis().dispose();
        } catch (SQLiteException e) {
            throw new RuntimeException(e);
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
