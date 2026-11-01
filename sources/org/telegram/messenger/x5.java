package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class x5 implements Runnable {
    public final int f19399a;
    public final b6 f19400b;
    public final kj f19401c;

    public x5(b6 b6Var, kj kjVar, int i10) {
        this.f19399a = i10;
        this.f19400b = b6Var;
        this.f19401c = kjVar;
    }

    @Override
    public final void run() {
        switch (this.f19399a) {
            case 0:
                b6 b6Var = this.f19400b;
                kj kjVar = this.f19401c;
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i10 = kjVar.F0().dc_id;
                    long j10 = kjVar.F0().f19800id;
                    b6Var.getMessagesStorage().f16333b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i10 + " AND id = " + j10).stepThis().dispose();
                    b6Var.getMessagesStorage().f16333b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                b6 b6Var2 = this.f19400b;
                kj kjVar2 = this.f19401c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(kjVar2.f16690k.getObjectSize());
                    kjVar2.f16690k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = b6Var2.getMessagesStorage().f16333b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, kjVar2.F0().dc_id);
                    executeFast.bindLong(3, kjVar2.F0().f19800id);
                    executeFast.bindInteger(4, 0);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            default:
                b6 b6Var3 = this.f19400b;
                kj kjVar3 = this.f19401c;
                try {
                    SQLitePreparedStatement executeFast2 = b6Var3.getMessagesStorage().f16333b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, kjVar3.F0().dc_id);
                    executeFast2.bindLong(2, kjVar3.F0().f19800id);
                    executeFast2.step();
                    executeFast2.dispose();
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
        }
    }
}
