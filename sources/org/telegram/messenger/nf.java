package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class nf implements Runnable {
    public final int f25941a;
    public final ri f25942b;
    public final TLRPC.Document f25943c;

    public nf(ri riVar, TLRPC.Document document, int i7) {
        this.f25941a = i7;
        this.f25942b = riVar;
        this.f25943c = document;
    }

    @Override
    public final void run() {
        switch (this.f25941a) {
            case 0:
                ri riVar = this.f25942b;
                TLRPC.Document document = this.f25943c;
                try {
                    SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().f27082b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f28437id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ri riVar2 = this.f25942b;
                TLRPC.Document document2 = this.f25943c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = riVar2.getMessagesStorage().f27082b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f28437id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
