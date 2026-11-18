package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lw implements Runnable {
    public final int f25443a;
    public final zy f25444b;
    public final TLRPC.Message f25445c;
    public final boolean d;

    public lw(zy zyVar, TLRPC.Message message, boolean z10, int i7) {
        this.f25443a = i7;
        this.f25444b = zyVar;
        this.f25445c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f25443a) {
            case 0:
                zy zyVar = this.f25444b;
                zyVar.getClass();
                TLRPC.Message message = this.f25445c;
                zyVar.d0(message.f28424id);
                zyVar.i0(message.f28424id, this.d);
                return;
            case 1:
                zy zyVar2 = this.f25444b;
                zyVar2.getClass();
                TLRPC.Message message2 = this.f25445c;
                zyVar2.d0(message2.f28424id);
                zyVar2.i0(message2.f28424id, this.d);
                return;
            default:
                this.f25444b.g0(this.f25445c, this.d);
                return;
        }
    }
}
