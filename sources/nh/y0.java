package nh;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
public final class y0 implements Runnable {
    public final int f18850a;
    public final MessagesStorage f18851b;
    public final z0 f18852c;

    public y0(MessagesStorage messagesStorage, z0 z0Var, int i10) {
        this.f18850a = i10;
        this.f18851b = messagesStorage;
        this.f18852c = z0Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase database;
        SQLiteDatabase database2;
        switch (this.f18850a) {
            case 0:
                MessagesStorage messagesStorage = this.f18851b;
                z0 z0Var = this.f18852c;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                if (database != null) {
                    sQLitePreparedStatement = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    int i10 = 1;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                    z0Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    z0Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, z0Var.f18919a);
                    sQLitePreparedStatement.bindLong(2, z0Var.f18921b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (!z0Var.G) {
                        if (z0Var.M) {
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
                MessagesStorage messagesStorage2 = this.f18851b;
                z0 z0Var2 = this.f18852c;
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
                        int i11 = 1;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        z0Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        z0Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, z0Var2.f18919a);
                        sQLitePreparedStatement2.bindLong(2, z0Var2.f18921b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (!z0Var2.G) {
                            if (z0Var2.M) {
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
