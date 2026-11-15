package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jy implements Runnable {
    public final int f24614a;
    public final ez f24615b;
    public final TLRPC.Updates f24616c;
    public final TLRPC.Message d;
    public final boolean f24617e;

    public jy(ez ezVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f24614a = i7;
        this.f24615b = ezVar;
        this.f24616c = updates;
        this.d = message;
        this.f24617e = z10;
    }

    @Override
    public final void run() {
        switch (this.f24614a) {
            case 0:
                ez ezVar = this.f24615b;
                ezVar.getMessagesController().O3(this.f24616c, false);
                g0.h3(new qw(ezVar, this.d, this.f24617e, 0));
                return;
            default:
                ez ezVar2 = this.f24615b;
                ezVar2.getMessagesController().O3(this.f24616c, false);
                g0.h3(new qw(ezVar2, this.d, this.f24617e, 1));
                return;
        }
    }
}
