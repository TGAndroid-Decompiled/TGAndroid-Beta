package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f26927a;
    public final mp f26928b;
    public final TLRPC.Updates f26929c;
    public final boolean d;

    public sm(mp mpVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f26927a = i7;
        this.f26928b = mpVar;
        this.f26929c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26927a) {
            case 0:
                Utilities.d.c(new sm(this.f26928b, this.f26929c, this.d, 1));
                return;
            default:
                this.f26928b.V3(this.f26929c, this.d);
                return;
        }
    }
}
