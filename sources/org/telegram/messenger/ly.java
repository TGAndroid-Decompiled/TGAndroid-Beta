package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ly implements Runnable {
    public final int f23940a;
    public final gz f23941b;
    public final TLRPC.Updates f23942c;
    public final TLRPC.Message d;
    public final boolean f23943e;

    public ly(gz gzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z9, int i7) {
        this.f23940a = i7;
        this.f23941b = gzVar;
        this.f23942c = updates;
        this.d = message;
        this.f23943e = z9;
    }

    @Override
    public final void run() {
        switch (this.f23940a) {
            case 0:
                gz gzVar = this.f23941b;
                gzVar.getMessagesController().O3(this.f23942c, false);
                g0.h3(new tw(gzVar, this.d, this.f23943e, 0));
                return;
            default:
                gz gzVar2 = this.f23941b;
                gzVar2.getMessagesController().O3(this.f23942c, false);
                g0.h3(new tw(gzVar2, this.d, this.f23943e, 1));
                return;
        }
    }
}
