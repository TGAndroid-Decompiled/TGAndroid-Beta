package org.telegram.SQLite;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
public class SQLitePreparedStatement {
    private boolean isFinalized = false;
    private String query;
    private long sqliteStatementHandle;
    private long startTime;

    public SQLitePreparedStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.sqliteStatementHandle = prepare(sQLiteDatabase.getSQLiteHandle(), str);
        if (e21.a) {
            this.query = str;
            this.startTime = SystemClock.elapsedRealtime();
        }
    }

    public void bindByteBuffer(int i, NativeByteBuffer nativeByteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i, nativeByteBuffer.buffer, nativeByteBuffer.limit());
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

    public void checkFinalized() {
        if (!this.isFinalized) {
            return;
        }
        throw new SQLiteException("Prepared query finalized");
    }

    public void dispose() {
        finalizeQuery();
    }

    public native void finalize(long j);

    public void finalizeQuery() {
        if (!this.isFinalized) {
            if (e21.a) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.startTime;
                if (elapsedRealtime > 500) {
                    StringBuilder sb = new StringBuilder("sqlite query ");
                    sb.append(this.query);
                    sb.append(" took ");
                    sb.append(elapsedRealtime);
                    hg9.r("ms", sb);
                }
            }
            try {
                this.isFinalized = true;
                finalize(this.sqliteStatementHandle);
            } catch (SQLiteException e) {
                if (e21.a) {
                    fc4.e(e.getMessage(), e);
                }
            }
        }
    }

    public long getStatementHandle() {
        return this.sqliteStatementHandle;
    }

    public native long prepare(long j, String str);

    public SQLiteCursor query(Object[] objArr) {
        SQLitePreparedStatement sQLitePreparedStatement;
        if (objArr != null) {
            checkFinalized();
            reset(this.sqliteStatementHandle);
            int i = 0;
            int i2 = 1;
            while (i < objArr.length) {
                Object obj = objArr[i];
                if (obj == null) {
                    this.bindNull(this.sqliteStatementHandle, i2);
                } else if (obj instanceof Integer) {
                    this.bindInt(this.sqliteStatementHandle, i2, ((Integer) obj).intValue());
                } else {
                    if (obj instanceof Double) {
                        sQLitePreparedStatement = this;
                        sQLitePreparedStatement.bindDouble(this.sqliteStatementHandle, i2, ((Double) obj).doubleValue());
                    } else {
                        sQLitePreparedStatement = this;
                        if (obj instanceof String) {
                            sQLitePreparedStatement.bindString(sQLitePreparedStatement.sqliteStatementHandle, i2, (String) obj);
                        } else if (obj instanceof Long) {
                            sQLitePreparedStatement.bindLong(sQLitePreparedStatement.sqliteStatementHandle, i2, ((Long) obj).longValue());
                        } else {
                            i98.g();
                            return null;
                        }
                    }
                    i2++;
                    i++;
                    this = sQLitePreparedStatement;
                }
                sQLitePreparedStatement = this;
                i2++;
                i++;
                this = sQLitePreparedStatement;
            }
            return new SQLiteCursor(this);
        }
        i98.g();
        return null;
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

    public void bindByteBuffer(int i, ByteBuffer byteBuffer) {
        bindByteBuffer(this.sqliteStatementHandle, i, byteBuffer, byteBuffer.limit());
    }
}
