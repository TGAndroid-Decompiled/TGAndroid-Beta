package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class x5 implements Runnable {
    public final int f19211a;
    public final b6 f19212b;
    public final jj f19213c;

    public x5(b6 b6Var, jj jjVar, int i10) {
        this.f19211a = i10;
        this.f19212b = b6Var;
        this.f19213c = jjVar;
    }

    @Override
    public final void run() {
        switch (this.f19211a) {
            case 0:
                b6 b6Var = this.f19212b;
                jj jjVar = this.f19213c;
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i10 = jjVar.F0().dc_id;
                    long j10 = jjVar.F0().f19799id;
                    b6Var.getMessagesStorage().f15940b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i10 + " AND id = " + j10).stepThis().dispose();
                    b6Var.getMessagesStorage().f15940b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                b6 b6Var2 = this.f19212b;
                jj jjVar2 = this.f19213c;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(jjVar2.f16337k.getObjectSize());
                    jjVar2.f16337k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = b6Var2.getMessagesStorage().f15940b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, jjVar2.F0().dc_id);
                    executeFast.bindLong(3, jjVar2.F0().f19799id);
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
                b6 b6Var3 = this.f19212b;
                jj jjVar3 = this.f19213c;
                try {
                    SQLitePreparedStatement executeFast2 = b6Var3.getMessagesStorage().f15940b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, jjVar3.F0().dc_id);
                    executeFast2.bindLong(2, jjVar3.F0().f19799id);
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
