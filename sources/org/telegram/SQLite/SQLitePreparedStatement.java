package org.telegram.SQLite;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;

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

    public native void bindByteBuffer(long j, int i, ByteBuffer byteBuffer, int i2);

    public void bindDouble(int i, double d) {
        bindDouble(this.sqliteStatementHandle, i, d);
    }

    public native void bindDouble(long j, int i, double d);

    public native void bindInt(long j, int i, int i2);

    public void bindInteger(int i, int i2) {
        bindInt(this.sqliteStatementHandle, i, i2);
    }

    public void bindLong(int i, long j) {
        bindLong(this.sqliteStatementHandle, i, j);
    }

    public native void bindLong(long j, int i, long j2);

    public void bindNull(int i) {
        bindNull(this.sqliteStatementHandle, i);
    }

    public native void bindNull(long j, int i);

    public void bindString(int i, String str) {
        bindString(this.sqliteStatementHandle, i, str);
    }

    public native void bindString(long j, int i, String str);

    public void bindTlObject(int i, TLObject tLObject) {
        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
        try {
            tLObject.serializeToStream(nativeByteBuffer);
            bindByteBuffer(i, nativeByteBuffer);
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    public void checkFinalized() throws SQLiteException {
        if (this.isFinalized) {
            throw new SQLiteException("Prepared query finalized");
        }
    }

    public void dispose() {
        finalizeQuery();
    }

    public native void finalize(long j);

    public void finalizeQuery() {
        if (this.isFinalized) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
            if (jElapsedRealtime > 500) {
                StringBuilder sb = new StringBuilder("sqlite query ");
                sb.append(this.query);
                sb.append(" took ");
                sb.append(jElapsedRealtime);
                SQLitePreparedStatement$$ExternalSyntheticOutline0.m("ms", sb);
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

    public native long prepare(long j, String str);

    public SQLiteCursor query(Object[] objArr) throws SQLiteException {
        if (objArr == null) {
            throw new IllegalArgumentException();
        }
        checkFinalized();
        reset(this.sqliteStatementHandle);
        int i = 1;
        for (Object obj : objArr) {
            if (obj == null) {
                bindNull(this.sqliteStatementHandle, i);
            } else {
                if (obj instanceof Integer) {
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
            i++;
        }
        return new SQLiteCursor(this);
    }

    public void requery() {
        checkFinalized();
        reset(this.sqliteStatementHandle);
    }

    public native void reset(long j);

    public int step() {
        return step(this.sqliteStatementHandle);
    }

    public native int step(long j);

    public SQLitePreparedStatement stepThis() {
        step(this.sqliteStatementHandle);
        return this;
    }

    public void bindByteBuffer(int i, NativeByteBuffer nativeByteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i, nativeByteBuffer.buffer, nativeByteBuffer.limit());
    }
}
