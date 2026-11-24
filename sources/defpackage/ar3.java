package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class ar3 implements Runnable {
    public final byte a;
    public final er3 b;
    public final k47 c;

    public ar3(er3 er3Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = er3Var;
        this.c = k47Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k47 k47Var = this.c;
        er3 er3Var = this.b;
        switch (b) {
            case 0:
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = k47Var.F0().dc_id;
                    long j = k47Var.F0().id;
                    er3Var.getMessagesStorage().b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i + " AND id = " + j).stepThis().dispose();
                    er3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(k47Var.k.getObjectSize());
                    k47Var.k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = er3Var.getMessagesStorage().b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, k47Var.F0().dc_id);
                    executeFast.bindLong(3, k47Var.F0().id);
                    executeFast.bindInteger(4, 0);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            default:
                try {
                    SQLitePreparedStatement executeFast2 = er3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, k47Var.F0().dc_id);
                    executeFast2.bindLong(2, k47Var.F0().id);
                    executeFast2.step();
                    executeFast2.dispose();
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
        }
    }
}
