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

    public byte[] byteArrayValue(int i9) {
        checkRow();
        return columnByteArrayValue(this.preparedStatement.getStatementHandle(), i9);
    }

    public NativeByteBuffer byteBufferValue(int i9) {
        checkRow();
        long columnByteBufferValue = columnByteBufferValue(this.preparedStatement.getStatementHandle(), i9);
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

    public native byte[] columnByteArrayValue(long j10, int i9);

    public native long columnByteBufferValue(long j10, int i9);

    public native int columnCount(long j10);

    public native double columnDoubleValue(long j10, int i9);

    public native int columnIntValue(long j10, int i9);

    public native int columnIsNull(long j10, int i9);

    public native long columnLongValue(long j10, int i9);

    public native String columnStringValue(long j10, int i9);

    public native int columnType(long j10, int i9);

    public void dispose() {
        this.preparedStatement.dispose();
    }

    public double doubleValue(int i9) {
        checkRow();
        return columnDoubleValue(this.preparedStatement.getStatementHandle(), i9);
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

    public int getTypeOf(int i9) {
        checkRow();
        return columnType(this.preparedStatement.getStatementHandle(), i9);
    }

    public int intValue(int i9) {
        checkRow();
        return columnIntValue(this.preparedStatement.getStatementHandle(), i9);
    }

    public boolean isNull(int i9) {
        checkRow();
        if (columnIsNull(this.preparedStatement.getStatementHandle(), i9) == 1) {
            return true;
        }
        return false;
    }

    public long longValue(int i9) {
        checkRow();
        return columnLongValue(this.preparedStatement.getStatementHandle(), i9);
    }

    public boolean next() {
        boolean z10;
        SQLitePreparedStatement sQLitePreparedStatement = this.preparedStatement;
        int step = sQLitePreparedStatement.step(sQLitePreparedStatement.getStatementHandle());
        if (step == -1) {
            int i9 = 6;
            while (true) {
                int i10 = i9 - 1;
                if (i9 == 0) {
                    break;
                }
                try {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("sqlite busy, waiting...");
                    }
                    Thread.sleep(500L);
                    step = this.preparedStatement.step();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (step == 0) {
                    break;
                }
                i9 = i10;
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

    public String stringValue(int i9) {
        checkRow();
        return columnStringValue(this.preparedStatement.getStatementHandle(), i9);
    }

    public <T extends TLObject> T tlObjectValue(int i9, Vector.TLDeserializer<T> tLDeserializer, boolean z10) {
        NativeByteBuffer byteBufferValue = byteBufferValue(i9);
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
