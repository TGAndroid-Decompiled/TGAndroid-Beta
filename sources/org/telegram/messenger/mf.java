package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f25031a;
    public final si f25032b;
    public final TLRPC.Document f25033c;

    public mf(si siVar, TLRPC.Document document, int i7) {
        this.f25031a = i7;
        this.f25032b = siVar;
        this.f25033c = document;
    }

    @Override
    public final void run() {
        switch (this.f25031a) {
            case 0:
                si siVar = this.f25032b;
                TLRPC.Document document = this.f25033c;
                try {
                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27221b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f28057id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                si siVar2 = this.f25032b;
                TLRPC.Document document2 = this.f25033c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = siVar2.getMessagesStorage().f27221b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f28057id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
