package org.telegram.SQLite;

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

    public byte[] byteArrayValue(int i) {
        checkRow();
        return columnByteArrayValue(this.preparedStatement.getStatementHandle(), i);
    }

    public NativeByteBuffer byteBufferValue(int i) {
        checkRow();
        long columnByteBufferValue = columnByteBufferValue(this.preparedStatement.getStatementHandle(), i);
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

    public native byte[] columnByteArrayValue(long j, int i);

    public native long columnByteBufferValue(long j, int i);

    public native int columnCount(long j);

    public native double columnDoubleValue(long j, int i);

    public native int columnIntValue(long j, int i);

    public native int columnIsNull(long j, int i);

    public native long columnLongValue(long j, int i);

    public native String columnStringValue(long j, int i);

    public native int columnType(long j, int i);

    public void dispose() {
        this.preparedStatement.dispose();
    }

    public double doubleValue(int i) {
        checkRow();
        return columnDoubleValue(this.preparedStatement.getStatementHandle(), i);
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

    public int getTypeOf(int i) {
        checkRow();
        return columnType(this.preparedStatement.getStatementHandle(), i);
    }

    public int intValue(int i) {
        checkRow();
        return columnIntValue(this.preparedStatement.getStatementHandle(), i);
    }

    public boolean isNull(int i) {
        checkRow();
        if (columnIsNull(this.preparedStatement.getStatementHandle(), i) == 1) {
            return true;
        }
        return false;
    }

    public long longValue(int i) {
        checkRow();
        return columnLongValue(this.preparedStatement.getStatementHandle(), i);
    }

    public boolean next() {
        SQLitePreparedStatement sQLitePreparedStatement = this.preparedStatement;
        int step = sQLitePreparedStatement.step(sQLitePreparedStatement.getStatementHandle());
        boolean z = true;
        if (step == -1) {
            int i = 6;
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                try {
                    if (f11.a) {
                        cc4.b("sqlite busy, waiting...");
                    }
                    Thread.sleep(500L);
                    step = this.preparedStatement.step();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (step == 0) {
                    break;
                }
                i = i2;
            }
            if (step == -1) {
                throw new SQLiteException("sqlite busy");
            }
        }
        if (step != 0) {
            z = false;
        }
        this.inRow = z;
        return z;
    }

    public String stringValue(int i) {
        checkRow();
        return columnStringValue(this.preparedStatement.getStatementHandle(), i);
    }

    public <T extends TLObject> T tlObjectValue(int i, Vector.TLDeserializer<T> tLDeserializer, boolean z) {
        NativeByteBuffer byteBufferValue = byteBufferValue(i);
        if (byteBufferValue == null) {
            return null;
        }
        try {
            return tLDeserializer.deserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
        } finally {
            byteBufferValue.reuse();
        }
    }
}
