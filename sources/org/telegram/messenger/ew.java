package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ew implements Runnable {
    public final int f23780a;
    public final az f23781b;
    public final TLRPC.Updates f23782c;

    public ew(az azVar, TLRPC.Updates updates, int i7) {
        this.f23780a = i7;
        this.f23781b = azVar;
        this.f23782c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23780a) {
            case 0:
                this.f23781b.getMessagesController().V3(this.f23782c, false);
                return;
            default:
                this.f23781b.getMessagesController().V3(this.f23782c, false);
                return;
        }
    }
}
