package defpackage;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class cp6 implements Runnable {
    public final byte a;
    public final hs6 b;
    public final TLRPC.Document c;

    public cp6(hs6 hs6Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = document;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Document document = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = hs6Var.getMessagesStorage().b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                try {
                    SQLiteDatabase sQLiteDatabase2 = hs6Var.getMessagesStorage().b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
