package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dw implements Runnable {
    public final int f23590a;
    public final zy f23591b;
    public final TLRPC.Updates f23592c;

    public dw(zy zyVar, TLRPC.Updates updates, int i7) {
        this.f23590a = i7;
        this.f23591b = zyVar;
        this.f23592c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23590a) {
            case 0:
                this.f23591b.getMessagesController().V3(this.f23592c, false);
                return;
            default:
                this.f23591b.getMessagesController().V3(this.f23592c, false);
                return;
        }
    }
}
