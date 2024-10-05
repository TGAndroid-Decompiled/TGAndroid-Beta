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

    public SQLitePreparedStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.sqliteStatementHandle = prepare(sQLiteDatabase.getSQLiteHandle(), str);
        if (BuildVars.LOGS_ENABLED) {
            this.query = str;
            this.startTime = SystemClock.elapsedRealtime();
        }
    }

    public void bindByteBuffer(int i, ByteBuffer byteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i, byteBuffer, byteBuffer.limit());
    }

    public void bindByteBuffer(int i, NativeByteBuffer nativeByteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i, nativeByteBuffer.buffer, nativeByteBuffer.limit());
    }

    native void bindByteBuffer(long j, int i, ByteBuffer byteBuffer, int i2);

    public void bindDouble(int i, double d) {
        bindDouble(this.sqliteStatementHandle, i, d);
    }

    native void bindDouble(long j, int i, double d);

    native void bindInt(long j, int i, int i2);

    public void bindInteger(int i, int i2) {
        bindInt(this.sqliteStatementHandle, i, i2);
    }

    public void bindLong(int i, long j) {
        bindLong(this.sqliteStatementHandle, i, j);
    }

    native void bindLong(long j, int i, long j2);

    public void bindNull(int i) {
        bindNull(this.sqliteStatementHandle, i);
    }

    native void bindNull(long j, int i);

    public void bindString(int i, String str) {
        bindString(this.sqliteStatementHandle, i, str);
    }

    native void bindString(long j, int i, String str);

    void checkFinalized() {
        if (this.isFinalized) {
            throw new SQLiteException("Prepared query finalized");
        }
    }

    public void dispose() {
        finalizeQuery();
    }

    native void finalize(long j);

    public void finalizeQuery() {
        if (this.isFinalized) {
            return;
        }
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

    public long getStatementHandle() {
        return this.sqliteStatementHandle;
    }

    native long prepare(long j, String str);

    public SQLiteCursor query(Object[] objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException();
        }
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
            } else {
                if (!(obj instanceof Long)) {
                    throw new IllegalArgumentException();
                }
                bindLong(this.sqliteStatementHandle, i, ((Long) obj).longValue());
            }
            i++;
        }
        return new SQLiteCursor(this);
    }

    public void requery() {
        checkFinalized();
        reset(this.sqliteStatementHandle);
    }

    native void reset(long j);

    public int step() {
        return step(this.sqliteStatementHandle);
    }

    public native int step(long j);

    public SQLitePreparedStatement stepThis() {
        step(this.sqliteStatementHandle);
        return this;
    }
}
