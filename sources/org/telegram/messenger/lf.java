package org.telegram.messenger;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class lf implements Runnable {
    public final int f16730a;
    public final ui f16731b;
    public final TLRPC.Document f16732c;

    public lf(ui uiVar, TLRPC.Document document, int i10) {
        this.f16730a = i10;
        this.f16731b = uiVar;
        this.f16732c = document;
    }

    @Override
    public final void run() {
        switch (this.f16730a) {
            case 0:
                ui uiVar = this.f16731b;
                TLRPC.Document document = this.f16732c;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f15940b;
                    sQLiteDatabase.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f19799id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                ui uiVar2 = this.f16731b;
                TLRPC.Document document2 = this.f16732c;
                try {
                    SQLiteDatabase sQLiteDatabase2 = uiVar2.getMessagesStorage().f15940b;
                    sQLiteDatabase2.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.f19799id + "' AND type = 2").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
