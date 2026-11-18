package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f26826a;
    public final mp f26827b;
    public final TLRPC.Updates f26828c;
    public final boolean d;

    public sm(mp mpVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f26826a = i7;
        this.f26827b = mpVar;
        this.f26828c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26826a) {
            case 0:
                Utilities.d.c(new sm(this.f26827b, this.f26828c, this.d, 1));
                return;
            default:
                this.f26827b.V3(this.f26828c, this.d);
                return;
        }
    }
}
