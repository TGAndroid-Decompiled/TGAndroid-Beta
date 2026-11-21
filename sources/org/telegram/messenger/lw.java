package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lw implements Runnable {
    public final int f25471a;
    public final zy f25472b;
    public final TLRPC.Message f25473c;
    public final boolean d;

    public lw(zy zyVar, TLRPC.Message message, boolean z10, int i7) {
        this.f25471a = i7;
        this.f25472b = zyVar;
        this.f25473c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f25471a) {
            case 0:
                zy zyVar = this.f25472b;
                zyVar.getClass();
                TLRPC.Message message = this.f25473c;
                zyVar.d0(message.f28452id);
                zyVar.i0(message.f28452id, this.d);
                return;
            case 1:
                zy zyVar2 = this.f25472b;
                zyVar2.getClass();
                TLRPC.Message message2 = this.f25473c;
                zyVar2.d0(message2.f28452id);
                zyVar2.i0(message2.f28452id, this.d);
                return;
            default:
                this.f25472b.g0(this.f25473c, this.d);
                return;
        }
    }
}
