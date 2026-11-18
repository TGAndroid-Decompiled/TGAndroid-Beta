package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class w5 implements Runnable {
    public final int f27642a;
    public final a6 f27643b;
    public final fj f27644c;

    public w5(a6 a6Var, fj fjVar, int i7) {
        this.f27642a = i7;
        this.f27643b = a6Var;
        this.f27644c = fjVar;
    }

    @Override
    public final void run() {
        switch (this.f27642a) {
            case 0:
                a6 a6Var = this.f27643b;
                fj fjVar = this.f27644c;
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i7 = fjVar.F0().dc_id;
                    long j3 = fjVar.F0().f28409id;
                    a6Var.getMessagesStorage().f27054b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i7 + " AND id = " + j3).stepThis().dispose();
                    a6Var.getMessagesStorage().f27054b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                a6 a6Var2 = this.f27643b;
                fj fjVar2 = this.f27644c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(fjVar2.f23965k.getObjectSize());
                    fjVar2.f23965k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = a6Var2.getMessagesStorage().f27054b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, fjVar2.F0().dc_id);
                    executeFast.bindLong(3, fjVar2.F0().f28409id);
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
                a6 a6Var3 = this.f27643b;
                fj fjVar3 = this.f27644c;
                try {
                    SQLitePreparedStatement executeFast2 = a6Var3.getMessagesStorage().f27054b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, fjVar3.F0().dc_id);
                    executeFast2.bindLong(2, fjVar3.F0().f28409id);
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
