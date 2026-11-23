package hi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ur;
import org.telegram.tgnet.NativeByteBuffer;
public final class y0 implements Runnable {
    public final int f15777a;
    public final ur f15778b;
    public final a1 f15779c;

    public y0(ur urVar, a1 a1Var, int i7) {
        this.f15777a = i7;
        this.f15778b = urVar;
        this.f15779c = a1Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.f15777a) {
            case 0:
                ur urVar = this.f15778b;
                a1 a1Var = this.f15779c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = urVar.f27252b;
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
                        a1Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        a1Var.b(nativeByteBuffer2);
                        sQLitePreparedStatement.bindLong(1, a1Var.f14210a);
                        int i7 = 2;
                        sQLitePreparedStatement.bindLong(2, a1Var.f14212b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (a1Var.G) {
                            i7 = 1;
                        } else if (!a1Var.M) {
                            i7 = 0;
                        }
                        sQLitePreparedStatement.bindInteger(4, i7);
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
                ur urVar2 = this.f15778b;
                a1 a1Var2 = this.f15779c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = urVar2.f27252b;
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
                        a1Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        a1Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, a1Var2.f14210a);
                        int i10 = 2;
                        sQLitePreparedStatement2.bindLong(2, a1Var2.f14212b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (a1Var2.G) {
                            i10 = 1;
                        } else if (!a1Var2.M) {
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
