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

    native byte[] columnByteArrayValue(long j, int i);

    native long columnByteBufferValue(long j, int i);

    native int columnCount(long j);

    native double columnDoubleValue(long j, int i);

    native int columnIntValue(long j, int i);

    native int columnIsNull(long j, int i);

    native long columnLongValue(long j, int i);

    native String columnStringValue(long j, int i);

    native int columnType(long j, int i);

    public SQLiteCursor(SQLitePreparedStatement sQLitePreparedStatement) {
        this.preparedStatement = sQLitePreparedStatement;
    }

    public boolean isNull(int i) throws SQLiteException {
        checkRow();
        return columnIsNull(this.preparedStatement.getStatementHandle(), i) == 1;
    }

    public SQLitePreparedStatement getPreparedStatement() {
        return this.preparedStatement;
    }

    public int intValue(int i) {
        checkRow();
        return columnIntValue(this.preparedStatement.getStatementHandle(), i);
    }

    public double doubleValue(int i) throws SQLiteException {
        checkRow();
        return columnDoubleValue(this.preparedStatement.getStatementHandle(), i);
    }

    public long longValue(int i) {
        checkRow();
        return columnLongValue(this.preparedStatement.getStatementHandle(), i);
    }

    public String stringValue(int i) {
        checkRow();
        return columnStringValue(this.preparedStatement.getStatementHandle(), i);
    }

    public byte[] byteArrayValue(int i) {
        checkRow();
        return columnByteArrayValue(this.preparedStatement.getStatementHandle(), i);
    }

    public NativeByteBuffer byteBufferValue(int i) {
        checkRow();
        long jColumnByteBufferValue = columnByteBufferValue(this.preparedStatement.getStatementHandle(), i);
        if (jColumnByteBufferValue != 0) {
            return NativeByteBuffer.wrap(jColumnByteBufferValue);
        }
        return null;
    }

    public <T extends TLObject> T tlObjectValue(int i, Vector.TLDeserializer<T> tLDeserializer, boolean z) {
        NativeByteBuffer nativeByteBufferByteBufferValue = byteBufferValue(i);
        if (nativeByteBufferByteBufferValue == null) {
            return null;
        }
        try {
            return (T) tLDeserializer.deserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(z), z);
        } finally {
            nativeByteBufferByteBufferValue.reuse();
        }
    }

    public int getTypeOf(int i) throws SQLiteException {
        checkRow();
        return columnType(this.preparedStatement.getStatementHandle(), i);
    }

    public boolean next() throws InterruptedException, SQLiteException {
        SQLitePreparedStatement sQLitePreparedStatement = this.preparedStatement;
        int iStep = sQLitePreparedStatement.step(sQLitePreparedStatement.getStatementHandle());
        if (iStep == -1) {
            int i = 6;
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                try {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("sqlite busy, waiting...");
                    }
                    Thread.sleep(500L);
                    iStep = this.preparedStatement.step();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (iStep == 0) {
                    break;
                }
                i = i2;
            }
            if (iStep == -1) {
                throw new SQLiteException("sqlite busy");
            }
        }
        boolean z = iStep == 0;
        this.inRow = z;
        return z;
    }

    public long getStatementHandle() {
        return this.preparedStatement.getStatementHandle();
    }

    public int getColumnCount() {
        return columnCount(this.preparedStatement.getStatementHandle());
    }

    public void dispose() {
        this.preparedStatement.dispose();
    }

    void checkRow() throws SQLiteException {
        if (!this.inRow) {
            throw new SQLiteException("You must call next before");
        }
    }
}
