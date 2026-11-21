package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ey implements Runnable {
    public final int f23828a;
    public final zy f23829b;
    public final TLRPC.Updates f23830c;
    public final TLRPC.Message d;
    public final boolean f23831e;

    public ey(zy zyVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f23828a = i7;
        this.f23829b = zyVar;
        this.f23830c = updates;
        this.d = message;
        this.f23831e = z10;
    }

    @Override
    public final void run() {
        switch (this.f23828a) {
            case 0:
                zy zyVar = this.f23829b;
                zyVar.getMessagesController().V3(this.f23830c, false);
                g0.g3(new lw(zyVar, this.d, this.f23831e, 0));
                return;
            default:
                zy zyVar2 = this.f23829b;
                zyVar2.getMessagesController().V3(this.f23830c, false);
                g0.g3(new lw(zyVar2, this.d, this.f23831e, 1));
                return;
        }
    }
}
