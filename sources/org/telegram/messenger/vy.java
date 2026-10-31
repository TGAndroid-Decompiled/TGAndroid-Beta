package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vy implements Runnable {
    public final int f19015a;
    public final qz f19016b;
    public final TLRPC.Updates f19017c;
    public final TLRPC.Message d;
    public final boolean e;

    public vy(qz qzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f19015a = i10;
        this.f19016b = qzVar;
        this.f19017c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f19015a) {
            case 0:
                qz qzVar = this.f19016b;
                qzVar.getMessagesController().L3(this.f19017c, false);
                i0.g3(new ex(qzVar, this.d, this.e, 0));
                return;
            default:
                qz qzVar2 = this.f19016b;
                qzVar2.getMessagesController().L3(this.f19017c, false);
                i0.g3(new ex(qzVar2, this.d, this.e, 1));
                return;
        }
    }
}
