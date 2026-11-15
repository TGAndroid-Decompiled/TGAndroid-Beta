package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class v5 implements Runnable {
    public final int f26932a;
    public final z5 f26933b;
    public final gj f26934c;

    public v5(z5 z5Var, gj gjVar, int i7) {
        this.f26932a = i7;
        this.f26933b = z5Var;
        this.f26934c = gjVar;
    }

    @Override
    public final void run() {
        switch (this.f26932a) {
            case 0:
                z5 z5Var = this.f26933b;
                gj gjVar = this.f26934c;
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i7 = gjVar.F0().dc_id;
                    long j3 = gjVar.F0().f28057id;
                    z5Var.getMessagesStorage().f27222b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i7 + " AND id = " + j3).stepThis().dispose();
                    z5Var.getMessagesStorage().f27222b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                z5 z5Var2 = this.f26933b;
                gj gjVar2 = this.f26934c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(gjVar2.f23817k.getObjectSize());
                    gjVar2.f23817k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = z5Var2.getMessagesStorage().f27222b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, gjVar2.F0().dc_id);
                    executeFast.bindLong(3, gjVar2.F0().f28057id);
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
                z5 z5Var3 = this.f26933b;
                gj gjVar3 = this.f26934c;
                try {
                    SQLitePreparedStatement executeFast2 = z5Var3.getMessagesStorage().f27222b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, gjVar3.F0().dc_id);
                    executeFast2.bindLong(2, gjVar3.F0().f28057id);
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
