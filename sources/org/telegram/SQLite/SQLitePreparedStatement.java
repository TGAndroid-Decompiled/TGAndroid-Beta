package org.telegram.SQLite;

import android.os.SystemClock;
import j3.r0;
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

    public void bindByteBuffer(int i9, ByteBuffer byteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i9, byteBuffer, byteBuffer.limit());
    }

    public native void bindByteBuffer(long j10, int i9, ByteBuffer byteBuffer, int i10);

    public void bindDouble(int i9, double d) {
        bindDouble(this.sqliteStatementHandle, i9, d);
    }

    public native void bindDouble(long j10, int i9, double d);

    public native void bindInt(long j10, int i9, int i10);

    public void bindInteger(int i9, int i10) {
        bindInt(this.sqliteStatementHandle, i9, i10);
    }

    public void bindLong(int i9, long j10) {
        bindLong(this.sqliteStatementHandle, i9, j10);
    }

    public native void bindLong(long j10, int i9, long j11);

    public void bindNull(int i9) {
        bindNull(this.sqliteStatementHandle, i9);
    }

    public native void bindNull(long j10, int i9);

    public void bindString(int i9, String str) {
        bindString(this.sqliteStatementHandle, i9, str);
    }

    public native void bindString(long j10, int i9, String str);

    public void bindTlObject(int i9, TLObject tLObject) {
        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
        try {
            tLObject.serializeToStream(nativeByteBuffer);
            bindByteBuffer(i9, nativeByteBuffer);
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    public void checkFinalized() {
        if (!this.isFinalized) {
            return;
        }
        throw new SQLiteException("Prepared query finalized");
    }

    public void dispose() {
        finalizeQuery();
    }

    public native void finalize(long j10);

    public void finalizeQuery() {
        if (!this.isFinalized) {
            if (BuildVars.LOGS_ENABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
                if (elapsedRealtime > 500) {
                    StringBuilder sb2 = new StringBuilder("sqlite query ");
                    sb2.append(this.query);
                    sb2.append(" took ");
                    sb2.append(elapsedRealtime);
                    r0.x("ms", sb2);
                }
            }
            try {
                this.isFinalized = true;
                finalize(this.sqliteStatementHandle);
            } catch (SQLiteException e10) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(e10.getMessage(), e10);
                }
            }
        }
    }

    public long getStatementHandle() {
        return this.sqliteStatementHandle;
    }

    public native long prepare(long j10, String str);

    public SQLiteCursor query(Object[] objArr) {
        if (objArr != null) {
            checkFinalized();
            reset(this.sqliteStatementHandle);
            int i9 = 1;
            for (Object obj : objArr) {
                if (obj == null) {
                    bindNull(this.sqliteStatementHandle, i9);
                } else if (obj instanceof Integer) {
                    bindInt(this.sqliteStatementHandle, i9, ((Integer) obj).intValue());
                } else {
                    if (obj instanceof Double) {
                        bindDouble(this.sqliteStatementHandle, i9, ((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        bindString(this.sqliteStatementHandle, i9, (String) obj);
                    } else if (obj instanceof Long) {
                        bindLong(this.sqliteStatementHandle, i9, ((Long) obj).longValue());
                    } else {
                        throw new IllegalArgumentException();
                    }
                    i9++;
                }
                i9++;
            }
            return new SQLiteCursor(this);
        }
        throw new IllegalArgumentException();
    }

    public void requery() {
        checkFinalized();
        reset(this.sqliteStatementHandle);
    }

    public native void reset(long j10);

    public int step() {
        return step(this.sqliteStatementHandle);
    }

    public native int step(long j10);

    public SQLitePreparedStatement stepThis() {
        step(this.sqliteStatementHandle);
        return this;
    }

    public void bindByteBuffer(int i9, NativeByteBuffer nativeByteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i9, nativeByteBuffer.buffer, nativeByteBuffer.limit());
    }
}
