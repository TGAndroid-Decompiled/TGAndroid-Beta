package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fy implements Runnable {
    public final int f23973a;
    public final az f23974b;
    public final TLRPC.Updates f23975c;
    public final TLRPC.Message d;
    public final boolean f23976e;

    public fy(az azVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f23973a = i7;
        this.f23974b = azVar;
        this.f23975c = updates;
        this.d = message;
        this.f23976e = z10;
    }

    @Override
    public final void run() {
        switch (this.f23973a) {
            case 0:
                az azVar = this.f23974b;
                azVar.getMessagesController().V3(this.f23975c, false);
                g0.g3(new mw(azVar, this.d, this.f23976e, 0));
                return;
            default:
                az azVar2 = this.f23974b;
                azVar2.getMessagesController().V3(this.f23975c, false);
                g0.g3(new mw(azVar2, this.d, this.f23976e, 1));
                return;
        }
    }
}
