package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f25915a;
    public final ri f25916b;
    public final TLRPC.Document f25917c;

    public nf(ri riVar, TLRPC.Document document, int i7) {
        this.f25915a = i7;
        this.f25916b = riVar;
        this.f25917c = document;
    }

    @Override
    public final void run() {
        switch (this.f25915a) {
            case 0:
                ri riVar = this.f25916b;
                TLRPC.Document document = this.f25917c;
                try {
                    SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().f27056b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f28411id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ri riVar2 = this.f25916b;
                TLRPC.Document document2 = this.f25917c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = riVar2.getMessagesStorage().f27056b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f28411id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
