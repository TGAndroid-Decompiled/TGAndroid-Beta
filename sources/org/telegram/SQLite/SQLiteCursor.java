package org.telegram.SQLite;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
public class SQLiteCursor {
    public static final int FIELD_TYPE_BYTEARRAY = 4;
    public static final int FIELD_TYPE_FLOAT = 2;
    public static final int FIELD_TYPE_INT = 1;
    public static final int FIELD_TYPE_NULL = 5;
    public static final int FIELD_TYPE_STRING = 3;
    private boolean inRow = false;
    private SQLitePreparedStatement preparedStatement;

    public SQLiteCursor(SQLitePreparedStatement sQLitePreparedStatement) {
        this.preparedStatement = sQLitePreparedStatement;
    }

    public byte[] byteArrayValue(int i10) {
        checkRow();
        return columnByteArrayValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public NativeByteBuffer byteBufferValue(int i10) {
        checkRow();
        long columnByteBufferValue = columnByteBufferValue(this.preparedStatement.getStatementHandle(), i10);
        if (columnByteBufferValue != 0) {
            return NativeByteBuffer.wrap(columnByteBufferValue);
        }
        return null;
    }

    public void checkRow() {
        if (this.inRow) {
            return;
        }
        throw new SQLiteException("You must call next before");
    }

    public native byte[] columnByteArrayValue(long j3, int i10);

    public native long columnByteBufferValue(long j3, int i10);

    public native int columnCount(long j3);

    public native double columnDoubleValue(long j3, int i10);

    public native int columnIntValue(long j3, int i10);

    public native int columnIsNull(long j3, int i10);

    public native long columnLongValue(long j3, int i10);

    public native String columnStringValue(long j3, int i10);

    public native int columnType(long j3, int i10);

    public void dispose() {
        this.preparedStatement.dispose();
    }

    public double doubleValue(int i10) {
        checkRow();
        return columnDoubleValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public int getColumnCount() {
        return columnCount(this.preparedStatement.getStatementHandle());
    }

    public SQLitePreparedStatement getPreparedStatement() {
        return this.preparedStatement;
    }

    public long getStatementHandle() {
        return this.preparedStatement.getStatementHandle();
    }

    public int getTypeOf(int i10) {
        checkRow();
        return columnType(this.preparedStatement.getStatementHandle(), i10);
    }

    public int intValue(int i10) {
        checkRow();
        return columnIntValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public boolean isNull(int i10) {
        checkRow();
        if (columnIsNull(this.preparedStatement.getStatementHandle(), i10) == 1) {
            return true;
        }
        return false;
    }

    public long longValue(int i10) {
        checkRow();
        return columnLongValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public boolean next() {
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement = this.preparedStatement;
        int step = sQLitePreparedStatement.step(sQLitePreparedStatement.getStatementHandle());
        if (step == -1) {
            int i10 = 6;
            while (true) {
                int i11 = i10 - 1;
                if (i10 == 0) {
                    break;
                }
                try {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("sqlite busy, waiting...");
                    }
                    Thread.sleep(500L);
                    step = this.preparedStatement.step();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (step == 0) {
                    break;
                }
                i10 = i11;
            }
            if (step == -1) {
                throw new SQLiteException("sqlite busy");
            }
        }
        if (step == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.inRow = z10;
        return z10;
    }

    public String stringValue(int i10) {
        checkRow();
        return columnStringValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public <T extends TLObject> T tlObjectValue(int i10, Vector.TLDeserializer<T> tLDeserializer, boolean z10) {
        NativeByteBuffer byteBufferValue = byteBufferValue(i10);
        if (byteBufferValue == null) {
            return null;
        }
        try {
            return tLDeserializer.deserialize(byteBufferValue, byteBufferValue.readInt32(z10), z10);
        } finally {
            byteBufferValue.reuse();
        }
    }
}
