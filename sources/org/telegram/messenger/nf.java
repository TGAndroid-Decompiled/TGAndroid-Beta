package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f24174a;
    public final ui f24175b;
    public final TLRPC.Document f24176c;

    public nf(ui uiVar, TLRPC.Document document, int i7) {
        this.f24174a = i7;
        this.f24175b = uiVar;
        this.f24176c = document;
    }

    @Override
    public final void run() {
        switch (this.f24174a) {
            case 0:
                ui uiVar = this.f24175b;
                TLRPC.Document document = this.f24176c;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26690b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f26958id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ui uiVar2 = this.f24175b;
                TLRPC.Document document2 = this.f24176c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = uiVar2.getMessagesStorage().f26690b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f26958id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
