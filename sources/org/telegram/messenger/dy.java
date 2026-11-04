package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dy implements Runnable {
    public final int f22264a;
    public final yy f22265b;
    public final TLRPC.Updates f22266c;
    public final TLRPC.Message d;
    public final boolean f22267e;

    public dy(yy yyVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i3) {
        this.f22264a = i3;
        this.f22265b = yyVar;
        this.f22266c = updates;
        this.d = message;
        this.f22267e = z10;
    }

    @Override
    public final void run() {
        switch (this.f22264a) {
            case 0:
                yy yyVar = this.f22265b;
                yyVar.getMessagesController().O3(this.f22266c, false);
                g0.h3(new lw(yyVar, this.d, this.f22267e, 0));
                return;
            default:
                yy yyVar2 = this.f22265b;
                yyVar2.getMessagesController().O3(this.f22266c, false);
                g0.h3(new lw(yyVar2, this.d, this.f22267e, 1));
                return;
        }
    }
}
