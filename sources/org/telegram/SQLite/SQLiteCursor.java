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
        long jColumnByteBufferValue = columnByteBufferValue(this.preparedStatement.getStatementHandle(), i10);
        if (jColumnByteBufferValue != 0) {
            return NativeByteBuffer.wrap(jColumnByteBufferValue);
        }
        return null;
    }

    public void checkRow() throws SQLiteException {
        if (!this.inRow) {
            throw new SQLiteException("You must call next before");
        }
    }

    public native byte[] columnByteArrayValue(long j10, int i10);

    public native long columnByteBufferValue(long j10, int i10);

    public native int columnCount(long j10);

    public native double columnDoubleValue(long j10, int i10);

    public native int columnIntValue(long j10, int i10);

    public native int columnIsNull(long j10, int i10);

    public native long columnLongValue(long j10, int i10);

    public native String columnStringValue(long j10, int i10);

    public native int columnType(long j10, int i10);

    public void dispose() {
        this.preparedStatement.dispose();
    }

    public double doubleValue(int i10) throws SQLiteException {
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

    public int getTypeOf(int i10) throws SQLiteException {
        checkRow();
        return columnType(this.preparedStatement.getStatementHandle(), i10);
    }

    public int intValue(int i10) {
        checkRow();
        return columnIntValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public boolean isNull(int i10) {
        checkRow();
        return columnIsNull(this.preparedStatement.getStatementHandle(), i10) == 1;
    }

    public long longValue(int i10) {
        checkRow();
        return columnLongValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public boolean next() {
        SQLitePreparedStatement sQLitePreparedStatement = this.preparedStatement;
        int iStep = sQLitePreparedStatement.step(sQLitePreparedStatement.getStatementHandle());
        if (iStep == -1) {
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
                    iStep = this.preparedStatement.step();
                    if (iStep == 0) {
                        break;
                    }
                    i10 = i11;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            if (iStep == -1) {
                throw new SQLiteException("sqlite busy");
            }
        }
        boolean z10 = iStep == 0;
        this.inRow = z10;
        return z10;
    }

    public String stringValue(int i10) {
        checkRow();
        return columnStringValue(this.preparedStatement.getStatementHandle(), i10);
    }

    public <T extends TLObject> T tlObjectValue(int i10, Vector.TLDeserializer<T> tLDeserializer, boolean z10) {
        NativeByteBuffer nativeByteBufferByteBufferValue = byteBufferValue(i10);
        if (nativeByteBufferByteBufferValue == null) {
            return null;
        }
        try {
            return (T) tLDeserializer.deserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(z10), z10);
        } finally {
            nativeByteBufferByteBufferValue.reuse();
        }
    }
}
