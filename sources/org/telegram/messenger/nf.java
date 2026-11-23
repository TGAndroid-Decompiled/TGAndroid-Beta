package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f26009a;
    public final ri f26010b;
    public final TLRPC.Document f26011c;

    public nf(ri riVar, TLRPC.Document document, int i7) {
        this.f26009a = i7;
        this.f26010b = riVar;
        this.f26011c = document;
    }

    @Override
    public final void run() {
        switch (this.f26009a) {
            case 0:
                ri riVar = this.f26010b;
                TLRPC.Document document = this.f26011c;
                try {
                    SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().f27151b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f28498id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ri riVar2 = this.f26010b;
                TLRPC.Document document2 = this.f26011c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = riVar2.getMessagesStorage().f27151b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f28498id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
