package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dw implements Runnable {
    public final int f23587a;
    public final zy f23588b;
    public final TLRPC.Updates f23589c;

    public dw(zy zyVar, TLRPC.Updates updates, int i7) {
        this.f23587a = i7;
        this.f23588b = zyVar;
        this.f23589c = updates;
    }

    @Override
    public final void run() {
        switch (this.f23587a) {
            case 0:
                this.f23588b.getMessagesController().V3(this.f23589c, false);
                return;
            default:
                this.f23588b.getMessagesController().V3(this.f23589c, false);
                return;
        }
    }
}
