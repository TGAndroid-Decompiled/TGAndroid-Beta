package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class of implements Runnable {
    public final int f26112a;
    public final si f26113b;
    public final TLRPC.Document f26114c;

    public of(si siVar, TLRPC.Document document, int i7) {
        this.f26112a = i7;
        this.f26113b = siVar;
        this.f26114c = document;
    }

    @Override
    public final void run() {
        switch (this.f26112a) {
            case 0:
                si siVar = this.f26113b;
                TLRPC.Document document = this.f26114c;
                try {
                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27252b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f28440id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                si siVar2 = this.f26113b;
                TLRPC.Document document2 = this.f26114c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = siVar2.getMessagesStorage().f27252b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f28440id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
