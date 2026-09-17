package di;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
public final class z0 implements Runnable {
    public final int f8531a;
    public final MessagesStorage f8532b;
    public final a1 f8533c;

    public z0(MessagesStorage messagesStorage, a1 a1Var, int i10) {
        this.f8531a = i10;
        this.f8532b = messagesStorage;
        this.f8533c = a1Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase database;
        SQLiteDatabase database2;
        switch (this.f8531a) {
            case 0:
                MessagesStorage messagesStorage = this.f8532b;
                a1 a1Var = this.f8533c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                if (database != null) {
                    sQLitePreparedStatement = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    int i10 = 1;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                    a1Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    a1Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, a1Var.f6892a);
                    sQLitePreparedStatement.bindLong(2, a1Var.f6894b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (!a1Var.G) {
                        if (a1Var.M) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                    }
                    sQLitePreparedStatement.bindInteger(4, i10);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer2.reuse();
                    sQLitePreparedStatement.dispose();
                    sQLitePreparedStatement.dispose();
                    return;
                }
                return;
            default:
                MessagesStorage messagesStorage2 = this.f8532b;
                a1 a1Var2 = this.f8533c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        database2 = messagesStorage2.getDatabase();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (database2 != null) {
                        sQLitePreparedStatement2 = database2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement2.requery();
                        int i11 = 1;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        a1Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        a1Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, a1Var2.f6892a);
                        sQLitePreparedStatement2.bindLong(2, a1Var2.f6894b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (!a1Var2.G) {
                            if (a1Var2.M) {
                                i11 = 2;
                            } else {
                                i11 = 0;
                            }
                        }
                        sQLitePreparedStatement2.bindInteger(4, i11);
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
