package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f24181a;
    public final ui f24182b;
    public final TLRPC.Document f24183c;

    public nf(ui uiVar, TLRPC.Document document, int i7) {
        this.f24181a = i7;
        this.f24182b = uiVar;
        this.f24183c = document;
    }

    @Override
    public final void run() {
        switch (this.f24181a) {
            case 0:
                ui uiVar = this.f24182b;
                TLRPC.Document document = this.f24183c;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26698b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f26959id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ui uiVar2 = this.f24182b;
                TLRPC.Document document2 = this.f24183c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = uiVar2.getMessagesStorage().f26698b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f26959id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
