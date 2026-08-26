package org.telegram.SQLite;

import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public class SQLiteDatabase {
    private boolean inTransaction;
    private boolean isOpen = true;
    private final long sqliteHandle;

    public SQLiteDatabase(String str) {
        this.sqliteHandle = opendb(str, ApplicationLoader.getFilesDirFixed().getPath());
    }

    public void beginTransaction() {
        if (this.inTransaction) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new SQLiteException("database already in transaction");
            }
            commitTransaction();
        }
        this.inTransaction = true;
        beginTransaction(this.sqliteHandle);
    }

    public native void beginTransaction(long j);

    public void checkOpened() throws SQLiteException {
        if (!this.isOpen) {
            throw new SQLiteException("Database closed");
        }
    }

    public void close() {
        if (this.isOpen) {
            try {
                commitTransaction();
                closedb(this.sqliteHandle);
            } catch (SQLiteException e) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(e.getMessage(), e);
                }
            }
            this.isOpen = false;
        }
    }

    public native void closedb(long j);

    public void commitTransaction() {
        if (this.inTransaction) {
            this.inTransaction = false;
            commitTransaction(this.sqliteHandle);
        }
    }

    public native void commitTransaction(long j);

    public SQLitePreparedStatement executeFast(String str) {
        return new SQLitePreparedStatement(this, str);
    }

    public Integer executeInt(String str, Object... objArr) {
        checkOpened();
        SQLiteCursor sQLiteCursorQueryFinalized = queryFinalized(str, objArr);
        try {
            if (sQLiteCursorQueryFinalized.next()) {
                return Integer.valueOf(sQLiteCursorQueryFinalized.intValue(0));
            }
            return null;
        } finally {
            sQLiteCursorQueryFinalized.dispose();
        }
    }

    public void explainQuery(String str, Object... objArr) throws SQLiteException {
        checkOpened();
        SQLiteCursor sQLiteCursorQuery = new SQLitePreparedStatement(this, zzil.m("EXPLAIN QUERY PLAN ", str)).query(objArr);
        while (sQLiteCursorQuery.next()) {
            int columnCount = sQLiteCursorQuery.getColumnCount();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < columnCount; i++) {
                sb.append(sQLiteCursorQuery.stringValue(i));
                sb.append(", ");
            }
            FileLog.d("EXPLAIN QUERY PLAN " + sb.toString());
        }
        sQLiteCursorQuery.dispose();
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    public long getSQLiteHandle() {
        return this.sqliteHandle;
    }

    public native long opendb(String str, String str2);

    public SQLiteCursor queryFinalized(String str, Object... objArr) {
        checkOpened();
        return new SQLitePreparedStatement(this, str).query(objArr);
    }

    public boolean tableExists(String str) throws SQLiteException {
        checkOpened();
        return executeInt("SELECT rowid FROM sqlite_master WHERE type='table' AND name=?;", str) != null;
    }
}
