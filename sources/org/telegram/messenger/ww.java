package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ww implements Runnable {
    public final int f19351a;
    public final rz f19352b;
    public final TLRPC.Updates f19353c;

    public ww(rz rzVar, TLRPC.Updates updates, int i10) {
        this.f19351a = i10;
        this.f19352b = rzVar;
        this.f19353c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19351a) {
            case 0:
                this.f19352b.getMessagesController().L3(this.f19353c, false);
                return;
            default:
                this.f19352b.getMessagesController().L3(this.f19353c, false);
                return;
        }
    }
}
