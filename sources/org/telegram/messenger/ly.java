package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ly implements Runnable {
    public final int f23952a;
    public final gz f23953b;
    public final TLRPC.Updates f23954c;
    public final TLRPC.Message d;
    public final boolean f23955e;

    public ly(gz gzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z9, int i7) {
        this.f23952a = i7;
        this.f23953b = gzVar;
        this.f23954c = updates;
        this.d = message;
        this.f23955e = z9;
    }

    @Override
    public final void run() {
        switch (this.f23952a) {
            case 0:
                gz gzVar = this.f23953b;
                gzVar.getMessagesController().O3(this.f23954c, false);
                g0.h3(new sw(gzVar, this.d, this.f23955e, 0));
                return;
            default:
                gz gzVar2 = this.f23953b;
                gzVar2.getMessagesController().O3(this.f23954c, false);
                g0.h3(new sw(gzVar2, this.d, this.f23955e, 1));
                return;
        }
    }
}
