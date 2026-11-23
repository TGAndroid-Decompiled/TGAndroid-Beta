package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dw implements Runnable {
    public final int f23716a;
    public final zy f23717b;
    public final TLRPC.Updates f23718c;

    public dw(zy zyVar, TLRPC.Updates updates, int i7) {
        this.f23716a = i7;
        this.f23717b = zyVar;
        this.f23718c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23716a) {
            case 0:
                this.f23717b.getMessagesController().V3(this.f23718c, false);
                return;
            default:
                this.f23717b.getMessagesController().V3(this.f23718c, false);
                return;
        }
    }
}
