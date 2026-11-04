package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class ef implements Runnable {
    public final int f22344a;
    public final li f22345b;
    public final TLRPC.Document f22346c;

    public ef(li liVar, TLRPC.Document document, int i3) {
        this.f22344a = i3;
        this.f22345b = liVar;
        this.f22346c = document;
    }

    @Override
    public final void run() {
        switch (this.f22344a) {
            case 0:
                li liVar = this.f22345b;
                TLRPC.Document document = this.f22346c;
                try {
                    SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().f24936b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f27007id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                li liVar2 = this.f22345b;
                TLRPC.Document document2 = this.f22346c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = liVar2.getMessagesStorage().f24936b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f27007id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
