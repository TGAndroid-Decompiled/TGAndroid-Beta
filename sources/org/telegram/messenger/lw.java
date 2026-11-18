package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lw implements Runnable {
    public final int f25445a;
    public final zy f25446b;
    public final TLRPC.Message f25447c;
    public final boolean d;

    public lw(zy zyVar, TLRPC.Message message, boolean z10, int i7) {
        this.f25445a = i7;
        this.f25446b = zyVar;
        this.f25447c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f25445a) {
            case 0:
                zy zyVar = this.f25446b;
                zyVar.getClass();
                TLRPC.Message message = this.f25447c;
                zyVar.d0(message.f28426id);
                zyVar.i0(message.f28426id, this.d);
                return;
            case 1:
                zy zyVar2 = this.f25446b;
                zyVar2.getClass();
                TLRPC.Message message2 = this.f25447c;
                zyVar2.d0(message2.f28426id);
                zyVar2.i0(message2.f28426id, this.d);
                return;
            default:
                this.f25446b.g0(this.f25447c, this.d);
                return;
        }
    }
}
