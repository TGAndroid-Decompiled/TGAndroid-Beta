package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ly implements Runnable {
    public final int f23948a;
    public final gz f23949b;
    public final TLRPC.Updates f23950c;
    public final TLRPC.Message d;
    public final boolean f23951e;

    public ly(gz gzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z9, int i7) {
        this.f23948a = i7;
        this.f23949b = gzVar;
        this.f23950c = updates;
        this.d = message;
        this.f23951e = z9;
    }

    @Override
    public final void run() {
        switch (this.f23948a) {
            case 0:
                gz gzVar = this.f23949b;
                gzVar.getMessagesController().O3(this.f23950c, false);
                g0.h3(new sw(gzVar, this.d, this.f23951e, 0));
                return;
            default:
                gz gzVar2 = this.f23949b;
                gzVar2.getMessagesController().O3(this.f23950c, false);
                g0.h3(new sw(gzVar2, this.d, this.f23951e, 1));
                return;
        }
    }
}
