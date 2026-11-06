package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ly implements Runnable {
    public final int f23947a;
    public final gz f23948b;
    public final TLRPC.Updates f23949c;
    public final TLRPC.Message d;
    public final boolean f23950e;

    public ly(gz gzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z9, int i7) {
        this.f23947a = i7;
        this.f23948b = gzVar;
        this.f23949c = updates;
        this.d = message;
        this.f23950e = z9;
    }

    @Override
    public final void run() {
        switch (this.f23947a) {
            case 0:
                gz gzVar = this.f23948b;
                gzVar.getMessagesController().O3(this.f23949c, false);
                g0.h3(new tw(gzVar, this.d, this.f23950e, 0));
                return;
            default:
                gz gzVar2 = this.f23948b;
                gzVar2.getMessagesController().O3(this.f23949c, false);
                g0.h3(new tw(gzVar2, this.d, this.f23950e, 1));
                return;
        }
    }
}
