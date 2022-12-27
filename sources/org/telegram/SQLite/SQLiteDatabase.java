package org.telegram.SQLite;

import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public class SQLiteDatabase {
    private boolean inTransaction;
    private boolean isOpen = true;
    private final long sqliteHandle;

    native void beginTransaction(long j);

    native void closedb(long j) throws SQLiteException;

    native void commitTransaction(long j);

    native long opendb(String str, String str2) throws SQLiteException;

    public long getSQLiteHandle() {
        return this.sqliteHandle;
    }

    public SQLiteDatabase(String str) throws SQLiteException {
        this.sqliteHandle = opendb(str, ApplicationLoader.getFilesDirFixed().getPath());
    }

    public boolean tableExists(String str) throws SQLiteException {
        checkOpened();
        return executeInt("SELECT rowid FROM sqlite_master WHERE type='table' AND name=?;", str) != null;
    }

    public SQLitePreparedStatement executeFast(String str) throws SQLiteException {
        return new SQLitePreparedStatement(this, str);
    }

    public Integer executeInt(String str, Object... objArr) throws SQLiteException {
        checkOpened();
        SQLiteCursor queryFinalized = queryFinalized(str, objArr);
        try {
            if (queryFinalized.next()) {
                return Integer.valueOf(queryFinalized.intValue(0));
            }
            return null;
        } finally {
            queryFinalized.dispose();
        }
    }

    public void explainQuery(String str, Object... objArr) throws SQLiteException {
        checkOpened();
        SQLiteCursor query = new SQLitePreparedStatement(this, "EXPLAIN QUERY PLAN " + str).query(objArr);
        while (query.next()) {
            int columnCount = query.getColumnCount();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < columnCount; i++) {
                sb.append(query.stringValue(i));
                sb.append(", ");
            }
            FileLog.m35d("EXPLAIN QUERY PLAN " + sb.toString());
        }
        query.dispose();
    }

    public SQLiteCursor queryFinalized(String str, Object... objArr) throws SQLiteException {
        checkOpened();
        return new SQLitePreparedStatement(this, str).query(objArr);
    }

    public void close() {
        if (this.isOpen) {
            try {
                commitTransaction();
                closedb(this.sqliteHandle);
            } catch (SQLiteException e) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.m33e(e.getMessage(), e);
                }
            }
            this.isOpen = false;
        }
    }

    void checkOpened() throws SQLiteException {
        if (!this.isOpen) {
            throw new SQLiteException("Database closed");
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    public void beginTransaction() throws SQLiteException {
        if (this.inTransaction) {
            throw new SQLiteException("database already in transaction");
        }
        this.inTransaction = true;
        beginTransaction(this.sqliteHandle);
    }

    public void commitTransaction() {
        if (this.inTransaction) {
            this.inTransaction = false;
            commitTransaction(this.sqliteHandle);
        }
    }
}
