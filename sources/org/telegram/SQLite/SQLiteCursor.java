package org.telegram.SQLite;

import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
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

    public byte[] byteArrayValue(int i7) {
        checkRow();
        return columnByteArrayValue(this.preparedStatement.getStatementHandle(), i7);
    }

    public NativeByteBuffer byteBufferValue(int i7) {
        checkRow();
        long columnByteBufferValue = columnByteBufferValue(this.preparedStatement.getStatementHandle(), i7);
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

    public native byte[] columnByteArrayValue(long j3, int i7);

    public native long columnByteBufferValue(long j3, int i7);

    public native int columnCount(long j3);

    public native double columnDoubleValue(long j3, int i7);

    public native int columnIntValue(long j3, int i7);

    public native int columnIsNull(long j3, int i7);

    public native long columnLongValue(long j3, int i7);

    public native String columnStringValue(long j3, int i7);

    public native int columnType(long j3, int i7);

    public void dispose() {
        this.preparedStatement.dispose();
    }

    public double doubleValue(int i7) {
        checkRow();
        return columnDoubleValue(this.preparedStatement.getStatementHandle(), i7);
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

    public int getTypeOf(int i7) {
        checkRow();
        return columnType(this.preparedStatement.getStatementHandle(), i7);
    }

    public int intValue(int i7) {
        checkRow();
        return columnIntValue(this.preparedStatement.getStatementHandle(), i7);
    }

    public boolean isNull(int i7) {
        checkRow();
        if (columnIsNull(this.preparedStatement.getStatementHandle(), i7) == 1) {
            return true;
        }
        return false;
    }

    public long longValue(int i7) {
        checkRow();
        return columnLongValue(this.preparedStatement.getStatementHandle(), i7);
    }

    public boolean next() {
        SQLitePreparedStatement sQLitePreparedStatement = this.preparedStatement;
        int step = sQLitePreparedStatement.step(sQLitePreparedStatement.getStatementHandle());
        boolean z9 = true;
        if (step == -1) {
            int i7 = 6;
            while (true) {
                int i10 = i7 - 1;
                if (i7 == 0) {
                    break;
                }
                try {
                    if (r2.f25216a) {
                        a8.b("sqlite busy, waiting...");
                    }
                    Thread.sleep(500L);
                    step = this.preparedStatement.step();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (step == 0) {
                    break;
                }
                i7 = i10;
            }
            if (step == -1) {
                throw new SQLiteException("sqlite busy");
            }
        }
        if (step != 0) {
            z9 = false;
        }
        this.inRow = z9;
        return z9;
    }

    public String stringValue(int i7) {
        checkRow();
        return columnStringValue(this.preparedStatement.getStatementHandle(), i7);
    }

    public <T extends TLObject> T tlObjectValue(int i7, Vector.TLDeserializer<T> tLDeserializer, boolean z9) {
        NativeByteBuffer byteBufferValue = byteBufferValue(i7);
        if (byteBufferValue == null) {
            return null;
        }
        try {
            return tLDeserializer.deserialize(byteBufferValue, byteBufferValue.readInt32(z9), z9);
        } finally {
            byteBufferValue.reuse();
        }
    }
}
