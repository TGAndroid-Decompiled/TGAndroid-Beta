package org.telegram.SQLite;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
public class SQLitePreparedStatement {
    private boolean isFinalized = false;
    private String query;
    private long sqliteStatementHandle;
    private long startTime;

    public SQLitePreparedStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.sqliteStatementHandle = prepare(sQLiteDatabase.getSQLiteHandle(), str);
        if (r2.f25040a) {
            this.query = str;
            this.startTime = SystemClock.elapsedRealtime();
        }
    }

    public void bindByteBuffer(int i3, ByteBuffer byteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i3, byteBuffer, byteBuffer.limit());
    }

    public native void bindByteBuffer(long j10, int i3, ByteBuffer byteBuffer, int i10);

    public void bindDouble(int i3, double d) {
        bindDouble(this.sqliteStatementHandle, i3, d);
    }

    public native void bindDouble(long j10, int i3, double d);

    public native void bindInt(long j10, int i3, int i10);

    public void bindInteger(int i3, int i10) {
        bindInt(this.sqliteStatementHandle, i3, i10);
    }

    public void bindLong(int i3, long j10) {
        bindLong(this.sqliteStatementHandle, i3, j10);
    }

    public native void bindLong(long j10, int i3, long j11);

    public void bindNull(int i3) {
        bindNull(this.sqliteStatementHandle, i3);
    }

    public native void bindNull(long j10, int i3);

    public void bindString(int i3, String str) {
        bindString(this.sqliteStatementHandle, i3, str);
    }

    public native void bindString(long j10, int i3, String str);

    public void bindTlObject(int i3, TLObject tLObject) {
        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
        try {
            tLObject.serializeToStream(nativeByteBuffer);
            bindByteBuffer(i3, nativeByteBuffer);
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
            if (r2.f25040a) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
                if (elapsedRealtime > 500) {
                    StringBuilder sb2 = new StringBuilder("sqlite query ");
                    sb2.append(this.query);
                    sb2.append(" took ");
                    sb2.append(elapsedRealtime);
                    p1.w("ms", sb2);
                }
            }
            try {
                this.isFinalized = true;
                finalize(this.sqliteStatementHandle);
            } catch (SQLiteException e10) {
                if (r2.f25040a) {
                    a8.e(e10.getMessage(), e10);
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
            int i3 = 1;
            for (Object obj : objArr) {
                if (obj == null) {
                    bindNull(this.sqliteStatementHandle, i3);
                } else if (obj instanceof Integer) {
                    bindInt(this.sqliteStatementHandle, i3, ((Integer) obj).intValue());
                } else {
                    if (obj instanceof Double) {
                        bindDouble(this.sqliteStatementHandle, i3, ((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        bindString(this.sqliteStatementHandle, i3, (String) obj);
                    } else if (obj instanceof Long) {
                        bindLong(this.sqliteStatementHandle, i3, ((Long) obj).longValue());
                    } else {
                        throw new IllegalArgumentException();
                    }
                    i3++;
                }
                i3++;
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

    public void bindByteBuffer(int i3, NativeByteBuffer nativeByteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i3, nativeByteBuffer.buffer, nativeByteBuffer.limit());
    }
}
