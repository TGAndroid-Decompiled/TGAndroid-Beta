package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class mf implements Runnable {
    public final int f17114a;
    public final vi f17115b;
    public final TLRPC.Document f17116c;

    public mf(vi viVar, TLRPC.Document document, int i10) {
        this.f17114a = i10;
        this.f17115b = viVar;
        this.f17116c = document;
    }

    @Override
    public final void run() {
        switch (this.f17114a) {
            case 0:
                vi viVar = this.f17115b;
                TLRPC.Document document = this.f17116c;
                try {
                    SQLiteDatabase sQLiteDatabase = viVar.getMessagesStorage().f16333b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f19800id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                vi viVar2 = this.f17115b;
                TLRPC.Document document2 = this.f17116c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = viVar2.getMessagesStorage().f16333b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f19800id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
