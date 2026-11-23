package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tm implements Runnable {
    public final int f27018a;
    public final np f27019b;
    public final TLRPC.Updates f27020c;
    public final boolean d;

    public tm(np npVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f27018a = i7;
        this.f27019b = npVar;
        this.f27020c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f27018a) {
            case 0:
                Utilities.d.c(new tm(this.f27019b, this.f27020c, this.d, 1));
                return;
            default:
                this.f27019b.V3(this.f27020c, this.d);
                return;
        }
    }
}
