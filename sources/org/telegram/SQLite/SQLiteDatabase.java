package org.telegram.SQLite;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import u3.c;
public class SQLiteDatabase {
    private boolean inTransaction;
    private boolean isOpen = true;
    private final long sqliteHandle;

    public SQLiteDatabase(String str) {
        this.sqliteHandle = opendb(str, ApplicationLoader.getFilesDirFixed().getPath());
    }

    public void beginTransaction() {
        if (this.inTransaction) {
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                commitTransaction();
            } else {
                throw new SQLiteException("database already in transaction");
            }
        }
        this.inTransaction = true;
        beginTransaction(this.sqliteHandle);
    }

    public native void beginTransaction(long j10);

    public void checkOpened() {
        if (this.isOpen) {
            return;
        }
        throw new SQLiteException("Database closed");
    }

    public void close() {
        if (this.isOpen) {
            try {
                commitTransaction();
                closedb(this.sqliteHandle);
            } catch (SQLiteException e10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(e10.getMessage(), e10);
                }
            }
            this.isOpen = false;
        }
    }

    public native void closedb(long j10);

    public void commitTransaction() {
        if (this.inTransaction) {
            this.inTransaction = false;
            commitTransaction(this.sqliteHandle);
        }
    }

    public native void commitTransaction(long j10);

    public SQLitePreparedStatement executeFast(String str) {
        return new SQLitePreparedStatement(this, str);
    }

    public Integer executeInt(String str, Object... objArr) {
        checkOpened();
        SQLiteCursor queryFinalized = queryFinalized(str, objArr);
        try {
            if (!queryFinalized.next()) {
                queryFinalized.dispose();
                return null;
            }
            return Integer.valueOf(queryFinalized.intValue(0));
        } finally {
            queryFinalized.dispose();
        }
    }

    public void explainQuery(String str, Object... objArr) {
        checkOpened();
        SQLiteCursor query = new SQLitePreparedStatement(this, c.e("EXPLAIN QUERY PLAN ", str)).query(objArr);
        while (query.next()) {
            int columnCount = query.getColumnCount();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < columnCount; i10++) {
                sb2.append(query.stringValue(i10));
                sb2.append(", ");
            }
            FileLog.d("EXPLAIN QUERY PLAN " + sb2.toString());
        }
        query.dispose();
    }

    public void finalize() {
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

    public boolean tableExists(String str) {
        checkOpened();
        if (executeInt("SELECT rowid FROM sqlite_master WHERE type='table' AND name=?;", str) != null) {
            return true;
        }
        return false;
    }
}
