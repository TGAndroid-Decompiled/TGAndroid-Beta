package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f24191a;
    public final ui f24192b;
    public final TLRPC.Document f24193c;

    public nf(ui uiVar, TLRPC.Document document, int i7) {
        this.f24191a = i7;
        this.f24192b = uiVar;
        this.f24193c = document;
    }

    @Override
    public final void run() {
        switch (this.f24191a) {
            case 0:
                ui uiVar = this.f24192b;
                TLRPC.Document document = this.f24193c;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26725b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f26966id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ui uiVar2 = this.f24192b;
                TLRPC.Document document2 = this.f24193c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = uiVar2.getMessagesStorage().f26725b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f26966id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
