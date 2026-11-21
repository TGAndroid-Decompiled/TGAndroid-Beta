package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dw implements Runnable {
    public final int f23615a;
    public final zy f23616b;
    public final TLRPC.Updates f23617c;

    public dw(zy zyVar, TLRPC.Updates updates, int i7) {
        this.f23615a = i7;
        this.f23616b = zyVar;
        this.f23617c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23615a) {
            case 0:
                this.f23616b.getMessagesController().V3(this.f23617c, false);
                return;
            default:
                this.f23616b.getMessagesController().V3(this.f23617c, false);
                return;
        }
    }
}
