package org.telegram.SQLite;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
public class SQLitePreparedStatement {
    private boolean isFinalized = false;
    private String query;
    private long sqliteStatementHandle;
    private long startTime;

    public SQLitePreparedStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.sqliteStatementHandle = prepare(sQLiteDatabase.getSQLiteHandle(), str);
        if (r2.f25199a) {
            this.query = str;
            this.startTime = SystemClock.elapsedRealtime();
        }
    }

    public void bindByteBuffer(int i7, ByteBuffer byteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i7, byteBuffer, byteBuffer.limit());
    }

    public native void bindByteBuffer(long j3, int i7, ByteBuffer byteBuffer, int i10);

    public void bindDouble(int i7, double d) {
        bindDouble(this.sqliteStatementHandle, i7, d);
    }

    public native void bindDouble(long j3, int i7, double d);

    public native void bindInt(long j3, int i7, int i10);

    public void bindInteger(int i7, int i10) {
        bindInt(this.sqliteStatementHandle, i7, i10);
    }

    public void bindLong(int i7, long j3) {
        bindLong(this.sqliteStatementHandle, i7, j3);
    }

    public native void bindLong(long j3, int i7, long j10);

    public void bindNull(int i7) {
        bindNull(this.sqliteStatementHandle, i7);
    }

    public native void bindNull(long j3, int i7);

    public void bindString(int i7, String str) {
        bindString(this.sqliteStatementHandle, i7, str);
    }

    public native void bindString(long j3, int i7, String str);

    public void bindTlObject(int i7, TLObject tLObject) {
        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
        try {
            tLObject.serializeToStream(nativeByteBuffer);
            bindByteBuffer(i7, nativeByteBuffer);
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

    public native void finalize(long j3);

    public void finalizeQuery() {
        if (!this.isFinalized) {
            if (r2.f25199a) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
                if (elapsedRealtime > 500) {
                    StringBuilder sb2 = new StringBuilder("sqlite query ");
                    sb2.append(this.query);
                    sb2.append(" took ");
                    sb2.append(elapsedRealtime);
                    f1.u("ms", sb2);
                }
            }
            try {
                this.isFinalized = true;
                finalize(this.sqliteStatementHandle);
            } catch (SQLiteException e10) {
                if (r2.f25199a) {
                    a8.e(e10.getMessage(), e10);
                }
            }
        }
    }

    public long getStatementHandle() {
        return this.sqliteStatementHandle;
    }

    public native long prepare(long j3, String str);

    public SQLiteCursor query(Object[] objArr) {
        if (objArr != null) {
            checkFinalized();
            reset(this.sqliteStatementHandle);
            int i7 = 1;
            for (Object obj : objArr) {
                if (obj == null) {
                    bindNull(this.sqliteStatementHandle, i7);
                } else if (obj instanceof Integer) {
                    bindInt(this.sqliteStatementHandle, i7, ((Integer) obj).intValue());
                } else {
                    if (obj instanceof Double) {
                        bindDouble(this.sqliteStatementHandle, i7, ((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        bindString(this.sqliteStatementHandle, i7, (String) obj);
                    } else if (obj instanceof Long) {
                        bindLong(this.sqliteStatementHandle, i7, ((Long) obj).longValue());
                    } else {
                        throw new IllegalArgumentException();
                    }
                    i7++;
                }
                i7++;
            }
            return new SQLiteCursor(this);
        }
        throw new IllegalArgumentException();
    }

    public void requery() {
        checkFinalized();
        reset(this.sqliteStatementHandle);
    }

    public native void reset(long j3);

    public int step() {
        return step(this.sqliteStatementHandle);
    }

    public native int step(long j3);

    public SQLitePreparedStatement stepThis() {
        step(this.sqliteStatementHandle);
        return this;
    }

    public void bindByteBuffer(int i7, NativeByteBuffer nativeByteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i7, nativeByteBuffer.buffer, nativeByteBuffer.limit());
    }
}
