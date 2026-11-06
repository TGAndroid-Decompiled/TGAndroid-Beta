package fi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.yr;
import org.telegram.tgnet.NativeByteBuffer;
public final class w0 implements Runnable {
    public final int f13022a;
    public final yr f13023b;
    public final y0 f13024c;

    public w0(yr yrVar, y0 y0Var, int i7) {
        this.f13022a = i7;
        this.f13023b = yrVar;
        this.f13024c = y0Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        switch (this.f13022a) {
            case 0:
                yr yrVar = this.f13023b;
                y0 y0Var = this.f13024c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase = yrVar.f26690b;
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
                        sQLitePreparedStatement.bindLong(1, y0Var.f13110a);
                        int i7 = 2;
                        sQLitePreparedStatement.bindLong(2, y0Var.f13112b);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                        if (y0Var.G) {
                            i7 = 1;
                        } else if (!y0Var.M) {
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
                yr yrVar2 = this.f13023b;
                y0 y0Var2 = this.f13024c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        sQLiteDatabase2 = yrVar2.f26690b;
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
                        sQLitePreparedStatement2.bindLong(1, y0Var2.f13110a);
                        int i10 = 2;
                        sQLitePreparedStatement2.bindLong(2, y0Var2.f13112b);
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
