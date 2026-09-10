package bi;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
public final class d1 implements Runnable {
    public final int f2535a;
    public final MessagesStorage f2536b;
    public final e1 f2537c;

    public d1(MessagesStorage messagesStorage, e1 e1Var, int i10) {
        this.f2535a = i10;
        this.f2536b = messagesStorage;
        this.f2537c = e1Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase database;
        SQLiteDatabase database2;
        switch (this.f2535a) {
            case 0:
                MessagesStorage messagesStorage = this.f2536b;
                e1 e1Var = this.f2537c;
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
                } catch (Exception e) {
                    FileLog.e(e);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                if (database != null) {
                    sQLitePreparedStatement = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    int i10 = 1;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                    e1Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    e1Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, e1Var.f2578a);
                    sQLitePreparedStatement.bindLong(2, e1Var.f2580b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (!e1Var.G) {
                        if (e1Var.M) {
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
                MessagesStorage messagesStorage2 = this.f2536b;
                e1 e1Var2 = this.f2537c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        database2 = messagesStorage2.getDatabase();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (database2 != null) {
                        sQLitePreparedStatement2 = database2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement2.requery();
                        int i11 = 1;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        e1Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        e1Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, e1Var2.f2578a);
                        sQLitePreparedStatement2.bindLong(2, e1Var2.f2580b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (!e1Var2.G) {
                            if (e1Var2.M) {
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
