package defpackage;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class gq3 implements Runnable {
    public final byte a;
    public final ad7 b;
    public final iq3 c;

    public gq3(ad7 ad7Var, iq3 iq3Var, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = iq3Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        byte b = this.a;
        int i = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        iq3 iq3Var = this.c;
        ad7 ad7Var = this.b;
        switch (b) {
            case 0:
                try {
                    try {
                        sQLiteDatabase2 = ad7Var.b;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase2 != null) {
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                        iq3Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        iq3Var.b(nativeByteBuffer2);
                        sQLitePreparedStatement.bindLong(1, iq3Var.a);
                        sQLitePreparedStatement.bindLong(2, iq3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (iq3Var.G) {
                            i = 1;
                        } else if (iq3Var.M) {
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
                        sQLiteDatabase = ad7Var.b;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase != null) {
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        iq3Var.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        iq3Var.b(nativeByteBuffer4);
                        sQLitePreparedStatement.bindLong(1, iq3Var.a);
                        sQLitePreparedStatement.bindLong(2, iq3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer4);
                        if (iq3Var.G) {
                            i = 1;
                        } else if (iq3Var.M) {
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
