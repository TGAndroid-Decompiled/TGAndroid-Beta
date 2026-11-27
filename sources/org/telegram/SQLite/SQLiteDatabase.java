package org.telegram.SQLite;

import org.telegram.messenger.a;
public class SQLiteDatabase {
    private boolean inTransaction;
    private boolean isOpen = true;
    private final long sqliteHandle;

    public SQLiteDatabase(String str) {
        this.sqliteHandle = opendb(str, a.h().getPath());
    }

    public void beginTransaction() {
        if (this.inTransaction) {
            boolean z = f11.a;
            commitTransaction();
        }
        this.inTransaction = true;
        beginTransaction(this.sqliteHandle);
    }

    public native void beginTransaction(long j);

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
            } catch (SQLiteException e) {
                if (f11.a) {
                    cc4.e(e.getMessage(), e);
                }
            }
            this.isOpen = false;
        }
    }

    public native void closedb(long j);

    public void commitTransaction() {
        if (!this.inTransaction) {
            return;
        }
        this.inTransaction = false;
        commitTransaction(this.sqliteHandle);
    }

    public native void commitTransaction(long j);

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
        SQLiteCursor query = new SQLitePreparedStatement(this, c00.i("EXPLAIN QUERY PLAN ", str)).query(objArr);
        while (query.next()) {
            int columnCount = query.getColumnCount();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < columnCount; i++) {
                sb.append(query.stringValue(i));
                sb.append(", ");
            }
            cc4.b("EXPLAIN QUERY PLAN ".concat(sb.toString()));
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
