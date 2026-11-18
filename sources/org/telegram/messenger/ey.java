package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ey implements Runnable {
    public final int f23803a;
    public final zy f23804b;
    public final TLRPC.Updates f23805c;
    public final TLRPC.Message d;
    public final boolean f23806e;

    public ey(zy zyVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f23803a = i7;
        this.f23804b = zyVar;
        this.f23805c = updates;
        this.d = message;
        this.f23806e = z10;
    }

    @Override
    public final void run() {
        switch (this.f23803a) {
            case 0:
                zy zyVar = this.f23804b;
                zyVar.getMessagesController().V3(this.f23805c, false);
                g0.g3(new lw(zyVar, this.d, this.f23806e, 0));
                return;
            default:
                zy zyVar2 = this.f23804b;
                zyVar2.getMessagesController().V3(this.f23805c, false);
                g0.g3(new lw(zyVar2, this.d, this.f23806e, 1));
                return;
        }
    }
}
