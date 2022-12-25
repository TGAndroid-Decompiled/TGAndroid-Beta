package org.telegram.SQLite;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.NativeByteBuffer;

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

    public int intValue(int i) throws SQLiteException {
        checkRow();
        return columnIntValue(this.preparedStatement.getStatementHandle(), i);
    }

    public double doubleValue(int i) throws SQLiteException {
        checkRow();
        return columnDoubleValue(this.preparedStatement.getStatementHandle(), i);
    }

    public long longValue(int i) throws SQLiteException {
        checkRow();
        return columnLongValue(this.preparedStatement.getStatementHandle(), i);
    }

    public String stringValue(int i) throws SQLiteException {
        checkRow();
        return columnStringValue(this.preparedStatement.getStatementHandle(), i);
    }

    public byte[] byteArrayValue(int i) throws SQLiteException {
        checkRow();
        return columnByteArrayValue(this.preparedStatement.getStatementHandle(), i);
    }

    public NativeByteBuffer byteBufferValue(int i) throws SQLiteException {
        checkRow();
        long columnByteBufferValue = columnByteBufferValue(this.preparedStatement.getStatementHandle(), i);
        if (columnByteBufferValue != 0) {
            return NativeByteBuffer.wrap(columnByteBufferValue);
        }
        return null;
    }

    public int getTypeOf(int i) throws SQLiteException {
        checkRow();
        return columnType(this.preparedStatement.getStatementHandle(), i);
    }

    public boolean next() throws SQLiteException {
        SQLitePreparedStatement sQLitePreparedStatement = this.preparedStatement;
        int step = sQLitePreparedStatement.step(sQLitePreparedStatement.getStatementHandle());
        if (step == -1) {
            int i = 6;
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                try {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.m34d("sqlite busy, waiting...");
                    }
                    Thread.sleep(500L);
                    step = this.preparedStatement.step();
                } catch (Exception e) {
                    FileLog.m31e(e);
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
        boolean z = step == 0;
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
