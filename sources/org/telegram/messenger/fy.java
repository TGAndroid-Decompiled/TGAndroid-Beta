package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fy implements Runnable {
    public final int f24009a;
    public final az f24010b;
    public final TLRPC.Updates f24011c;
    public final TLRPC.Message d;
    public final boolean f24012e;

    public fy(az azVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f24009a = i7;
        this.f24010b = azVar;
        this.f24011c = updates;
        this.d = message;
        this.f24012e = z10;
    }

    @Override
    public final void run() {
        switch (this.f24009a) {
            case 0:
                az azVar = this.f24010b;
                azVar.getMessagesController().V3(this.f24011c, false);
                g0.g3(new mw(azVar, this.d, this.f24012e, 0));
                return;
            default:
                az azVar2 = this.f24010b;
                azVar2.getMessagesController().V3(this.f24011c, false);
                g0.g3(new mw(azVar2, this.d, this.f24012e, 1));
                return;
        }
    }
}
