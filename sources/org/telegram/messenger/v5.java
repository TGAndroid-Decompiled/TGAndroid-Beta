package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class v5 implements Runnable {
    public final int f25944a;
    public final z5 f25945b;
    public final ij f25946c;

    public v5(z5 z5Var, ij ijVar, int i7) {
        this.f25944a = i7;
        this.f25945b = z5Var;
        this.f25946c = ijVar;
    }

    @Override
    public final void run() {
        switch (this.f25944a) {
            case 0:
                z5 z5Var = this.f25945b;
                ij ijVar = this.f25946c;
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i7 = ijVar.F0().dc_id;
                    long j3 = ijVar.F0().f26962id;
                    z5Var.getMessagesStorage().f26721b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i7 + " AND id = " + j3).stepThis().dispose();
                    z5Var.getMessagesStorage().f26721b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                z5 z5Var2 = this.f25945b;
                ij ijVar2 = this.f25946c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ijVar2.f23262k.getObjectSize());
                    ijVar2.f23262k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = z5Var2.getMessagesStorage().f26721b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, ijVar2.F0().dc_id);
                    executeFast.bindLong(3, ijVar2.F0().f26962id);
                    executeFast.bindInteger(4, 0);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            default:
                z5 z5Var3 = this.f25945b;
                ij ijVar3 = this.f25946c;
                try {
                    SQLitePreparedStatement executeFast2 = z5Var3.getMessagesStorage().f26721b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, ijVar3.F0().dc_id);
                    executeFast2.bindLong(2, ijVar3.F0().f26962id);
                    executeFast2.step();
                    executeFast2.dispose();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
        }
    }
}
