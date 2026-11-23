package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f25613a;
    public final az f25614b;
    public final TLRPC.Message f25615c;
    public final boolean d;

    public mw(az azVar, TLRPC.Message message, boolean z10, int i7) {
        this.f25613a = i7;
        this.f25614b = azVar;
        this.f25615c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f25613a) {
            case 0:
                az azVar = this.f25614b;
                azVar.getClass();
                TLRPC.Message message = this.f25615c;
                azVar.d0(message.f28419id);
                azVar.i0(message.f28419id, this.d);
                return;
            case 1:
                az azVar2 = this.f25614b;
                azVar2.getClass();
                TLRPC.Message message2 = this.f25615c;
                azVar2.d0(message2.f28419id);
                azVar2.i0(message2.f28419id, this.d);
                return;
            default:
                this.f25614b.g0(this.f25615c, this.d);
                return;
        }
    }
}
