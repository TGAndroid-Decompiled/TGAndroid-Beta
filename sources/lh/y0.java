package lh;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;

public final class y0 implements Runnable {

    public final int f17067a;

    public final MessagesStorage f17068b;

    public final z0 f17069c;

    public y0(MessagesStorage messagesStorage, z0 z0Var, int i10) {
        this.f17067a = i10;
        this.f17068b = messagesStorage;
        this.f17069c = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f17067a) {
            case 0:
                MessagesStorage messagesStorage = this.f17068b;
                z0 z0Var = this.f17069c;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage.getDatabase();
                        if (database == null) {
                            return;
                        }
                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatementExecuteFast.requery();
                        int i10 = 1;
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                        z0Var.b(nativeByteBuffer);
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                        z0Var.b(nativeByteBuffer2);
                        sQLitePreparedStatementExecuteFast.bindLong(1, z0Var.f17139a);
                        sQLitePreparedStatementExecuteFast.bindLong(2, z0Var.f17141b);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer2);
                        if (!z0Var.G) {
                            i10 = z0Var.M ? 2 : 0;
                        }
                        sQLitePreparedStatementExecuteFast.bindInteger(4, i10);
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer2.reuse();
                        sQLitePreparedStatementExecuteFast.dispose();
                        sQLitePreparedStatementExecuteFast.dispose();
                        return;
                    } catch (Throwable th) {
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    if (sQLitePreparedStatementExecuteFast == null) {
                        return;
                    }
                }
                break;
            default:
                MessagesStorage messagesStorage2 = this.f17068b;
                z0 z0Var2 = this.f17069c;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = null;
                try {
                    try {
                        SQLiteDatabase database2 = messagesStorage2.getDatabase();
                        if (database2 == null) {
                            return;
                        }
                        sQLitePreparedStatementExecuteFast2 = database2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatementExecuteFast2.requery();
                        int i11 = 1;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        z0Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        z0Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatementExecuteFast2.bindLong(1, z0Var2.f17139a);
                        sQLitePreparedStatementExecuteFast2.bindLong(2, z0Var2.f17141b);
                        sQLitePreparedStatementExecuteFast2.bindByteBuffer(3, nativeByteBuffer4);
                        if (!z0Var2.G) {
                            i11 = z0Var2.M ? 2 : 0;
                        }
                        sQLitePreparedStatementExecuteFast2.bindInteger(4, i11);
                        sQLitePreparedStatementExecuteFast2.step();
                        nativeByteBuffer4.reuse();
                        sQLitePreparedStatementExecuteFast2.dispose();
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatementExecuteFast2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatementExecuteFast2.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatementExecuteFast2 != null) {
                        sQLitePreparedStatementExecuteFast2.dispose();
                    }
                    throw th2;
                }
        }
    }
}
