package defpackage;

import java.util.Locale;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
public final class gq3 implements Runnable {
    public final byte a;
    public final lq3 b;
    public final r47 c;

    public gq3(lq3 lq3Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = lq3Var;
        this.c = r47Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        r47 r47Var = this.c;
        lq3 lq3Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    executeFast.bindInteger(1, r47Var.F0().dc_id);
                    executeFast.bindLong(2, r47Var.F0().id);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    Locale locale = Locale.ENGLISH;
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = r47Var.F0().dc_id;
                    long j = r47Var.F0().id;
                    lq3Var.getMessagesStorage().b.executeFast("UPDATE downloading_documents SET state = 1, date = " + currentTimeMillis + " WHERE hash = " + i + " AND id = " + j).stepThis().dispose();
                    lq3Var.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE state = 1 AND rowid NOT IN (SELECT rowid FROM downloading_documents WHERE state = 1 ORDER BY date DESC LIMIT 100)").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            default:
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(r47Var.k.getObjectSize());
                    r47Var.k.serializeToStream(nativeByteBuffer);
                    SQLitePreparedStatement executeFast2 = lq3Var.getMessagesStorage().b.executeFast("REPLACE INTO downloading_documents VALUES(?, ?, ?, ?, ?)");
                    executeFast2.bindByteBuffer(1, nativeByteBuffer);
                    executeFast2.bindInteger(2, r47Var.F0().dc_id);
                    executeFast2.bindLong(3, r47Var.F0().id);
                    executeFast2.bindInteger(4, 0);
                    executeFast2.bindLong(5, System.currentTimeMillis());
                    executeFast2.step();
                    executeFast2.dispose();
                    nativeByteBuffer.reuse();
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
        }
    }
}
