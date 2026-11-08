package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f24187a;
    public final ui f24188b;
    public final TLRPC.Document f24189c;

    public nf(ui uiVar, TLRPC.Document document, int i7) {
        this.f24187a = i7;
        this.f24188b = uiVar;
        this.f24189c = document;
    }

    @Override
    public final void run() {
        switch (this.f24187a) {
            case 0:
                ui uiVar = this.f24188b;
                TLRPC.Document document = this.f24189c;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26721b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f26962id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ui uiVar2 = this.f24188b;
                TLRPC.Document document2 = this.f24189c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = uiVar2.getMessagesStorage().f26721b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f26962id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
