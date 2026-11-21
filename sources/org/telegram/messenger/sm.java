package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sm implements Runnable {
    public final int f26854a;
    public final mp f26855b;
    public final TLRPC.Updates f26856c;
    public final boolean d;

    public sm(mp mpVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f26854a = i7;
        this.f26855b = mpVar;
        this.f26856c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26854a) {
            case 0:
                Utilities.d.c(new sm(this.f26855b, this.f26856c, this.d, 1));
                return;
            default:
                this.f26855b.V3(this.f26856c, this.d);
                return;
        }
    }
}
