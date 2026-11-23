package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ey implements Runnable {
    public final int f23905a;
    public final zy f23906b;
    public final TLRPC.Updates f23907c;
    public final TLRPC.Message d;
    public final boolean f23908e;

    public ey(zy zyVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f23905a = i7;
        this.f23906b = zyVar;
        this.f23907c = updates;
        this.d = message;
        this.f23908e = z10;
    }

    @Override
    public final void run() {
        switch (this.f23905a) {
            case 0:
                zy zyVar = this.f23906b;
                zyVar.getMessagesController().V3(this.f23907c, false);
                g0.g3(new lw(zyVar, this.d, this.f23908e, 0));
                return;
            default:
                zy zyVar2 = this.f23906b;
                zyVar2.getMessagesController().V3(this.f23907c, false);
                g0.g3(new lw(zyVar2, this.d, this.f23908e, 1));
                return;
        }
    }
}
