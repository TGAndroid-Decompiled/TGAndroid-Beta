package defpackage;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class qr3 implements Runnable {
    public final byte a;
    public final cf7 b;
    public final sr3 c;

    public qr3(cf7 cf7Var, sr3 sr3Var, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = sr3Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        byte b = this.a;
        int i = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sr3 sr3Var = this.c;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                try {
                    try {
                        sQLiteDatabase2 = cf7Var.b;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase2 != null) {
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                        sr3Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        sr3Var.b(nativeByteBuffer2);
                        sQLitePreparedStatement.bindLong(1, sr3Var.a);
                        sQLitePreparedStatement.bindLong(2, sr3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (sr3Var.G) {
                            i = 1;
                        } else if (sr3Var.M) {
                            i = 2;
                        }
                        sQLitePreparedStatement.bindInteger(4, i);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer2.reuse();
                        sQLitePreparedStatement.dispose();
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            default:
                try {
                    try {
                        sQLiteDatabase = cf7Var.b;
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase != null) {
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        sr3Var.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        sr3Var.b(nativeByteBuffer4);
                        sQLitePreparedStatement.bindLong(1, sr3Var.a);
                        sQLitePreparedStatement.bindLong(2, sr3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer4);
                        if (sr3Var.G) {
                            i = 1;
                        } else if (sr3Var.M) {
                            i = 2;
                        }
                        sQLitePreparedStatement.bindInteger(4, i);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer4.reuse();
                        sQLitePreparedStatement.dispose();
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
        }
    }
}
