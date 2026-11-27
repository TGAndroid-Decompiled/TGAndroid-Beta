package defpackage;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class yq3 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final zq3 c;

    public yq3(kf7 kf7Var, zq3 zq3Var, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = zq3Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        byte b = this.a;
        int i = 0;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        zq3 zq3Var = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                try {
                    try {
                        sQLiteDatabase2 = kf7Var.b;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase2 != null) {
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                        zq3Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        zq3Var.b(nativeByteBuffer2);
                        sQLitePreparedStatement.bindLong(1, zq3Var.a);
                        sQLitePreparedStatement.bindLong(2, zq3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (zq3Var.G) {
                            i = 1;
                        } else if (zq3Var.M) {
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
                        sQLiteDatabase = kf7Var.b;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase != null) {
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        zq3Var.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        zq3Var.b(nativeByteBuffer4);
                        sQLitePreparedStatement.bindLong(1, zq3Var.a);
                        sQLitePreparedStatement.bindLong(2, zq3Var.b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer4);
                        if (zq3Var.G) {
                            i = 1;
                        } else if (zq3Var.M) {
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
