package kh;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
public final class z0 implements Runnable {
    public final int f16420a;
    public final MessagesStorage f16421b;
    public final a1 f16422c;

    public z0(MessagesStorage messagesStorage, a1 a1Var, int i9) {
        this.f16420a = i9;
        this.f16421b = messagesStorage;
        this.f16422c = a1Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase database;
        SQLiteDatabase database2;
        switch (this.f16420a) {
            case 0:
                MessagesStorage messagesStorage = this.f16421b;
                a1 a1Var = this.f16422c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Throwable th) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                if (database != null) {
                    sQLitePreparedStatement = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    int i9 = 1;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                    a1Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    a1Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, a1Var.f14846a);
                    sQLitePreparedStatement.bindLong(2, a1Var.f14848b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (!a1Var.G) {
                        if (a1Var.M) {
                            i9 = 2;
                        } else {
                            i9 = 0;
                        }
                    }
                    sQLitePreparedStatement.bindInteger(4, i9);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer2.reuse();
                    sQLitePreparedStatement.dispose();
                    sQLitePreparedStatement.dispose();
                    return;
                }
                return;
            default:
                MessagesStorage messagesStorage2 = this.f16421b;
                a1 a1Var2 = this.f16422c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        database2 = messagesStorage2.getDatabase();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (database2 != null) {
                        sQLitePreparedStatement2 = database2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement2.requery();
                        int i10 = 1;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        a1Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        a1Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, a1Var2.f14846a);
                        sQLitePreparedStatement2.bindLong(2, a1Var2.f14848b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (!a1Var2.G) {
                            if (a1Var2.M) {
                                i10 = 2;
                            } else {
                                i10 = 0;
                            }
                        }
                        sQLitePreparedStatement2.bindInteger(4, i10);
                        sQLitePreparedStatement2.step();
                        nativeByteBuffer4.reuse();
                        sQLitePreparedStatement2.dispose();
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th2;
                }
        }
    }
}
