package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uk implements Runnable {
    public final int f26834a;
    public final np f26835b;
    public final TLRPC.Updates f26836c;
    public final boolean d;

    public uk(np npVar, TLRPC.Updates updates, boolean z10, int i7) {
        this.f26834a = i7;
        this.f26835b = npVar;
        this.f26836c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26834a) {
            case 0:
                this.f26835b.O3(this.f26836c, this.d);
                return;
            default:
                Utilities.d.c(new uk(this.f26835b, this.f26836c, this.d, 0));
                return;
        }
    }
}
