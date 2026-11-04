package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lw implements Runnable {
    public final int f24129a;
    public final yy f24130b;
    public final TLRPC.Message f24131c;
    public final boolean d;

    public lw(yy yyVar, TLRPC.Message message, boolean z10, int i3) {
        this.f24129a = i3;
        this.f24130b = yyVar;
        this.f24131c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f24129a) {
            case 0:
                yy yyVar = this.f24130b;
                yyVar.getClass();
                TLRPC.Message message = this.f24131c;
                yyVar.d0(message.f27022id);
                yyVar.i0(message.f27022id, this.d);
                return;
            case 1:
                yy yyVar2 = this.f24130b;
                yyVar2.getClass();
                TLRPC.Message message2 = this.f24131c;
                yyVar2.d0(message2.f27022id);
                yyVar2.i0(message2.f27022id, this.d);
                return;
            default:
                this.f24130b.g0(this.f24131c, this.d);
                return;
        }
    }
}
