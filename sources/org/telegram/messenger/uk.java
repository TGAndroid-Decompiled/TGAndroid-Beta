package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uk implements Runnable {
    public final int f26832a;
    public final np f26833b;
    public final TLRPC.Updates f26834c;
    public final boolean d;

    public uk(np npVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f26832a = i7;
        this.f26833b = npVar;
        this.f26834c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26832a) {
            case 0:
                this.f26833b.O3(this.f26834c, this.d);
                return;
            default:
                Utilities.d.c(new uk(this.f26833b, this.f26834c, this.d, 0));
                return;
        }
    }
}
