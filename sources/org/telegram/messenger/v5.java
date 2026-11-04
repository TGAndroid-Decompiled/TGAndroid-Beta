package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class v5 implements Runnable {
    public final int f25826a;
    public final z5 f25827b;
    public final zi f25828c;

    public v5(z5 z5Var, zi ziVar, int i3) {
        this.f25826a = i3;
        this.f25827b = z5Var;
        this.f25828c = ziVar;
    }

    @Override
    public final void run() {
        switch (this.f25826a) {
            case 0:
                z5 z5Var = this.f25827b;
                zi ziVar = this.f25828c;
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i3 = ziVar.F0().dc_id;
                    long j10 = ziVar.F0().f27007id;
                    z5Var.getMessagesStorage().f24936b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i3 + " AND id = " + j10).stepThis().dispose();
                    z5Var.getMessagesStorage().f24936b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                z5 z5Var2 = this.f25827b;
                zi ziVar2 = this.f25828c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ziVar2.f26868k.getObjectSize());
                    ziVar2.f26868k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = z5Var2.getMessagesStorage().f24936b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, ziVar2.F0().dc_id);
                    executeFast.bindLong(3, ziVar2.F0().f27007id);
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
                z5 z5Var3 = this.f25827b;
                zi ziVar3 = this.f25828c;
                try {
                    SQLitePreparedStatement executeFast2 = z5Var3.getMessagesStorage().f24936b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, ziVar3.F0().dc_id);
                    executeFast2.bindLong(2, ziVar3.F0().f27007id);
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
