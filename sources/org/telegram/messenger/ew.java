package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ew implements Runnable {
    public final int f23744a;
    public final az f23745b;
    public final TLRPC.Updates f23746c;

    public ew(az azVar, TLRPC.Updates updates, int i7) {
        this.f23744a = i7;
        this.f23745b = azVar;
        this.f23746c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23744a) {
            case 0:
                this.f23745b.getMessagesController().V3(this.f23746c, false);
                return;
            default:
                this.f23745b.getMessagesController().V3(this.f23746c, false);
                return;
        }
    }
}
