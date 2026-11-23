package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lw implements Runnable {
    public final int f25562a;
    public final zy f25563b;
    public final TLRPC.Message f25564c;
    public final boolean d;

    public lw(zy zyVar, TLRPC.Message message, boolean z10, int i7) {
        this.f25562a = i7;
        this.f25563b = zyVar;
        this.f25564c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f25562a) {
            case 0:
                zy zyVar = this.f25563b;
                zyVar.getClass();
                TLRPC.Message message = this.f25564c;
                zyVar.d0(message.f28513id);
                zyVar.i0(message.f28513id, this.d);
                return;
            case 1:
                zy zyVar2 = this.f25563b;
                zyVar2.getClass();
                TLRPC.Message message2 = this.f25564c;
                zyVar2.d0(message2.f28513id);
                zyVar2.i0(message2.f28513id, this.d);
                return;
            default:
                this.f25563b.g0(this.f25564c, this.d);
                return;
        }
    }
}
