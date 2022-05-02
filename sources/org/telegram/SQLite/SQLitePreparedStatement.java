package org.telegram.SQLite;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.NativeByteBuffer;

public class SQLitePreparedStatement {
    private boolean isFinalized = false;
    private String query;
    private long sqliteStatementHandle;
    private long startTime;

    native void bindByteBuffer(long j, int i, ByteBuffer byteBuffer, int i2) throws SQLiteException;

    native void bindDouble(long j, int i, double d) throws SQLiteException;

    native void bindInt(long j, int i, int i2) throws SQLiteException;

    native void bindLong(long j, int i, long j2) throws SQLiteException;

    native void bindNull(long j, int i) throws SQLiteException;

    native void bindString(long j, int i, String str) throws SQLiteException;

    native void finalize(long j) throws SQLiteException;

    native long prepare(long j, String str) throws SQLiteException;

    native void reset(long j) throws SQLiteException;

    public native int step(long j) throws SQLiteException;

    public long getStatementHandle() {
        return this.sqliteStatementHandle;
    }

    public SQLitePreparedStatement(SQLiteDatabase sQLiteDatabase, String str) throws SQLiteException {
        this.sqliteStatementHandle = prepare(sQLiteDatabase.getSQLiteHandle(), str);
        if (BuildVars.LOGS_ENABLED) {
            this.query = str;
            this.startTime = SystemClock.elapsedRealtime();
        }
    }

    public SQLiteCursor query(Object[] objArr) throws SQLiteException {
        if (objArr != null) {
            checkFinalized();
            reset(this.sqliteStatementHandle);
            int i = 1;
            for (Object obj : objArr) {
                if (obj == null) {
                    bindNull(this.sqliteStatementHandle, i);
                } else if (obj instanceof Integer) {
                    bindInt(this.sqliteStatementHandle, i, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    bindDouble(this.sqliteStatementHandle, i, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    bindString(this.sqliteStatementHandle, i, (String) obj);
                } else if (obj instanceof Long) {
                    bindLong(this.sqliteStatementHandle, i, ((Long) obj).longValue());
                } else {
                    throw new IllegalArgumentException();
                }
                i++;
            }
            return new SQLiteCursor(this);
        }
        throw new IllegalArgumentException();
    }

    public int step() throws SQLiteException {
        return step(this.sqliteStatementHandle);
    }

    public SQLitePreparedStatement stepThis() throws SQLiteException {
        step(this.sqliteStatementHandle);
        return this;
    }

    public void requery() throws SQLiteException {
        checkFinalized();
        reset(this.sqliteStatementHandle);
    }

    public void dispose() {
        finalizeQuery();
    }

    void checkFinalized() throws SQLiteException {
        if (this.isFinalized) {
            throw new SQLiteException("Prepared query finalized");
        }
    }

    public void finalizeQuery() {
        if (!this.isFinalized) {
            if (BuildVars.LOGS_ENABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
                if (elapsedRealtime > 500) {
                    FileLog.d("sqlite query " + this.query + " took " + elapsedRealtime + "ms");
                }
            }
            try {
                this.isFinalized = true;
                finalize(this.sqliteStatementHandle);
            } catch (SQLiteException e) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(e.getMessage(), e);
                }
            }
        }
    }

    public void bindInteger(int i, int i2) throws SQLiteException {
        bindInt(this.sqliteStatementHandle, i, i2);
    }

    public void bindDouble(int i, double d) throws SQLiteException {
        bindDouble(this.sqliteStatementHandle, i, d);
    }

    public void bindByteBuffer(int i, ByteBuffer byteBuffer) throws SQLiteException {
        bindByteBuffer(this.sqliteStatementHandle, i, byteBuffer, byteBuffer.limit());
    }

    public void bindByteBuffer(int i, NativeByteBuffer nativeByteBuffer) throws SQLiteException {
        bindByteBuffer(this.sqliteStatementHandle, i, nativeByteBuffer.buffer, nativeByteBuffer.limit());
    }

    public void bindString(int i, String str) throws SQLiteException {
        bindString(this.sqliteStatementHandle, i, str);
    }

    public void bindLong(int i, long j) throws SQLiteException {
        bindLong(this.sqliteStatementHandle, i, j);
    }

    public void bindNull(int i) throws SQLiteException {
        bindNull(this.sqliteStatementHandle, i);
    }
}
