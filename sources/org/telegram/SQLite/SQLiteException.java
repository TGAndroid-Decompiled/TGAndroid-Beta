package org.telegram.SQLite;
public class SQLiteException extends Exception {
    private static final long serialVersionUID = -2398298479089615621L;
    public final int errorCode;

    public SQLiteException(int i9, String str) {
        super(str);
        this.errorCode = i9;
    }

    public SQLiteException(String str) {
        this(0, str);
    }

    public SQLiteException() {
        this.errorCode = 0;
    }
}
