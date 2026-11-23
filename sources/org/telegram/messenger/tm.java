package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tm implements Runnable {
    public final int f27054a;
    public final np f27055b;
    public final TLRPC.Updates f27056c;
    public final boolean d;

    public tm(np npVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f27054a = i7;
        this.f27055b = npVar;
        this.f27056c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f27054a) {
            case 0:
                Utilities.d.c(new tm(this.f27055b, this.f27056c, this.d, 1));
                return;
            default:
                this.f27055b.V3(this.f27056c, this.d);
                return;
        }
    }
}
