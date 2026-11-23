package hi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.tr;
import org.telegram.tgnet.NativeByteBuffer;
public final class g1 implements Runnable {
    public final int f14517a;
    public final tr f14518b;
    public final i1 f14519c;

    public g1(tr trVar, i1 i1Var, int i7) {
        this.f14517a = i7;
        this.f14518b = trVar;
        this.f14519c = i1Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.f14517a) {
            case 0:
                tr trVar = this.f14518b;
                i1 i1Var = this.f14519c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = trVar.f27151b;
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
                        i1Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        i1Var.b(nativeByteBuffer2);
                        sQLitePreparedStatement.bindLong(1, i1Var.f14617a);
                        int i7 = 2;
                        sQLitePreparedStatement.bindLong(2, i1Var.f14619b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (i1Var.G) {
                            i7 = 1;
                        } else if (!i1Var.M) {
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
                tr trVar2 = this.f14518b;
                i1 i1Var2 = this.f14519c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = trVar2.f27151b;
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
                        i1Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        i1Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, i1Var2.f14617a);
                        int i10 = 2;
                        sQLitePreparedStatement2.bindLong(2, i1Var2.f14619b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (i1Var2.G) {
                            i10 = 1;
                        } else if (!i1Var2.M) {
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
