package defpackage;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class cn6 implements Runnable {
    public final byte a;
    public final hq6 b;
    public final TLRPC.Document c;

    public cn6(hq6 hq6Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = document;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Document document = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = hq6Var.getMessagesStorage().b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                try {
                    SQLiteDatabase sQLiteDatabase2 = hq6Var.getMessagesStorage().b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
