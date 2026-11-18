package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f25913a;
    public final ri f25914b;
    public final TLRPC.Document f25915c;

    public nf(ri riVar, TLRPC.Document document, int i7) {
        this.f25913a = i7;
        this.f25914b = riVar;
        this.f25915c = document;
    }

    @Override
    public final void run() {
        switch (this.f25913a) {
            case 0:
                ri riVar = this.f25914b;
                TLRPC.Document document = this.f25915c;
                try {
                    SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().f27054b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f28409id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ri riVar2 = this.f25914b;
                TLRPC.Document document2 = this.f25915c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = riVar2.getMessagesStorage().f27054b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f28409id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
