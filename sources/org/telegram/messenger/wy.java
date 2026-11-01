package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wy implements Runnable {
    public final int f19358a;
    public final rz f19359b;
    public final TLRPC.Updates f19360c;
    public final TLRPC.Message d;
    public final boolean e;

    public wy(rz rzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f19358a = i10;
        this.f19359b = rzVar;
        this.f19360c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f19358a) {
            case 0:
                rz rzVar = this.f19359b;
                rzVar.getMessagesController().L3(this.f19360c, false);
                i0.g3(new fx(rzVar, this.d, this.e, 0));
                return;
            default:
                rz rzVar2 = this.f19359b;
                rzVar2.getMessagesController().L3(this.f19360c, false);
                i0.g3(new fx(rzVar2, this.d, this.e, 1));
                return;
        }
    }
}
