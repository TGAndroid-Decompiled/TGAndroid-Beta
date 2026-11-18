package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f26828a;
    public final mp f26829b;
    public final TLRPC.Updates f26830c;
    public final boolean d;

    public sm(mp mpVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f26828a = i7;
        this.f26829b = mpVar;
        this.f26830c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26828a) {
            case 0:
                Utilities.d.c(new sm(this.f26829b, this.f26830c, this.d, 1));
                return;
            default:
                this.f26829b.V3(this.f26830c, this.d);
                return;
        }
    }
}
