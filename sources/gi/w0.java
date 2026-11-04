package gi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.qr;
import org.telegram.tgnet.NativeByteBuffer;
public final class w0 implements Runnable {
    public final int f13786a;
    public final qr f13787b;
    public final y0 f13788c;

    public w0(qr qrVar, y0 y0Var, int i3) {
        this.f13786a = i3;
        this.f13787b = qrVar;
        this.f13788c = y0Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.f13786a) {
            case 0:
                qr qrVar = this.f13787b;
                y0 y0Var = this.f13788c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = qrVar.f24936b;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase != null) {
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                        y0Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        y0Var.b(nativeByteBuffer2);
                        sQLitePreparedStatement.bindLong(1, y0Var.f13880a);
                        int i3 = 2;
                        sQLitePreparedStatement.bindLong(2, y0Var.f13882b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (y0Var.G) {
                            i3 = 1;
                        } else if (!y0Var.M) {
                            i3 = 0;
                        }
                        sQLitePreparedStatement.bindInteger(4, i3);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer2.reuse();
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
            default:
                qr qrVar2 = this.f13787b;
                y0 y0Var2 = this.f13788c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = qrVar2.f24936b;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (sQLiteDatabase2 != null) {
                        sQLitePreparedStatement2 = sQLiteDatabase2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement2.requery();
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        y0Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        y0Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, y0Var2.f13880a);
                        int i10 = 2;
                        sQLitePreparedStatement2.bindLong(2, y0Var2.f13882b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (y0Var2.G) {
                            i10 = 1;
                        } else if (!y0Var2.M) {
                            i10 = 0;
                        }
                        sQLitePreparedStatement2.bindInteger(4, i10);
                        sQLitePreparedStatement2.step();
                        nativeByteBuffer4.reuse();
                        sQLitePreparedStatement2.dispose();
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
        }
    }
}
