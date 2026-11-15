package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jy implements Runnable {
    public final int f24611a;
    public final ez f24612b;
    public final TLRPC.Updates f24613c;
    public final TLRPC.Message d;
    public final boolean f24614e;

    public jy(ez ezVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f24611a = i7;
        this.f24612b = ezVar;
        this.f24613c = updates;
        this.d = message;
        this.f24614e = z10;
    }

    @Override
    public final void run() {
        switch (this.f24611a) {
            case 0:
                ez ezVar = this.f24612b;
                ezVar.getMessagesController().O3(this.f24613c, false);
                g0.h3(new qw(ezVar, this.d, this.f24614e, 0));
                return;
            default:
                ez ezVar2 = this.f24612b;
                ezVar2.getMessagesController().O3(this.f24613c, false);
                g0.h3(new qw(ezVar2, this.d, this.f24614e, 1));
                return;
        }
    }
}
