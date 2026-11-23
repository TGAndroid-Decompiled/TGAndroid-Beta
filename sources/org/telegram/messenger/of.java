package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class of implements Runnable {
    public final int f26076a;
    public final si f26077b;
    public final TLRPC.Document f26078c;

    public of(si siVar, TLRPC.Document document, int i7) {
        this.f26076a = i7;
        this.f26077b = siVar;
        this.f26078c = document;
    }

    @Override
    public final void run() {
        switch (this.f26076a) {
            case 0:
                si siVar = this.f26077b;
                TLRPC.Document document = this.f26078c;
                try {
                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27216b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f28404id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                si siVar2 = this.f26077b;
                TLRPC.Document document2 = this.f26078c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = siVar2.getMessagesStorage().f27216b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f28404id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
