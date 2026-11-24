package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class qp3 implements Runnable {
    public final byte a;
    public final up3 b;
    public final k27 c;

    public qp3(up3 up3Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = up3Var;
        this.c = k27Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k27 k27Var = this.c;
        up3 up3Var = this.b;
        switch (b) {
            case 0:
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = k27Var.F0().dc_id;
                    long j = k27Var.F0().id;
                    up3Var.getMessagesStorage().b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i + " AND id = " + j).stepThis().dispose();
                    up3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(k27Var.k.getObjectSize());
                    k27Var.k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast = up3Var.getMessagesStorage().b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindInteger(2, k27Var.F0().dc_id);
                    executeFast.bindLong(3, k27Var.F0().id);
                    executeFast.bindInteger(4, 0);
                    executeFast.bindLong(5, System.currentTimeMillis());
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            default:
                try {
                    SQLitePreparedStatement executeFast2 = up3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast2.bindInteger(1, k27Var.F0().dc_id);
                    executeFast2.bindLong(2, k27Var.F0().id);
                    executeFast2.step();
                    executeFast2.dispose();
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
        }
    }
}
