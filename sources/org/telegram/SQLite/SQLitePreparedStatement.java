package org.telegram.SQLite;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.th;
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

    public void bindByteBuffer(int i10, ByteBuffer byteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i10, byteBuffer, byteBuffer.limit());
    }

    public native void bindByteBuffer(long j10, int i10, ByteBuffer byteBuffer, int i11);

    public void bindDouble(int i10, double d) {
        bindDouble(this.sqliteStatementHandle, i10, d);
    }

    public native void bindDouble(long j10, int i10, double d);

    public native void bindInt(long j10, int i10, int i11);

    public void bindInteger(int i10, int i11) {
        bindInt(this.sqliteStatementHandle, i10, i11);
    }

    public void bindLong(int i10, long j10) {
        bindLong(this.sqliteStatementHandle, i10, j10);
    }

    public native void bindLong(long j10, int i10, long j11);

    public void bindNull(int i10) {
        bindNull(this.sqliteStatementHandle, i10);
    }

    public native void bindNull(long j10, int i10);

    public void bindString(int i10, String str) {
        bindString(this.sqliteStatementHandle, i10, str);
    }

    public native void bindString(long j10, int i10, String str);

    public void bindTlObject(int i10, TLObject tLObject) {
        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
        try {
            tLObject.serializeToStream(nativeByteBuffer);
            bindByteBuffer(i10, nativeByteBuffer);
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
                    th.v("ms", sb2);
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
            int i10 = 1;
            for (Object obj : objArr) {
                if (obj == null) {
                    bindNull(this.sqliteStatementHandle, i10);
                } else if (obj instanceof Integer) {
                    bindInt(this.sqliteStatementHandle, i10, ((Integer) obj).intValue());
                } else {
                    if (obj instanceof Double) {
                        bindDouble(this.sqliteStatementHandle, i10, ((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        bindString(this.sqliteStatementHandle, i10, (String) obj);
                    } else if (obj instanceof Long) {
                        bindLong(this.sqliteStatementHandle, i10, ((Long) obj).longValue());
                    } else {
                        throw new IllegalArgumentException();
                    }
                    i10++;
                }
                i10++;
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

    public void bindByteBuffer(int i10, NativeByteBuffer nativeByteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i10, nativeByteBuffer.buffer, nativeByteBuffer.limit());
    }
}
