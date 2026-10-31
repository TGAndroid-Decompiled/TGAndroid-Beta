package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vw implements Runnable {
    public final int f19008a;
    public final qz f19009b;
    public final TLRPC.Updates f19010c;

    public vw(qz qzVar, TLRPC.Updates updates, int i10) {
        this.f19008a = i10;
        this.f19009b = qzVar;
        this.f19010c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19008a) {
            case 0:
                this.f19009b.getMessagesController().L3(this.f19010c, false);
                return;
            default:
                this.f19009b.getMessagesController().L3(this.f19010c, false);
                return;
        }
    }
}
