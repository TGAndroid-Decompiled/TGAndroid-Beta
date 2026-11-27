package defpackage;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class lp6 implements Runnable {
    public final byte a;
    public final ls6 b;
    public final TLRPC.Document c;

    public lp6(ls6 ls6Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = document;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Document document = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = ls6Var.getMessagesStorage().b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                try {
                    SQLiteDatabase sQLiteDatabase2 = ls6Var.getMessagesStorage().b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
