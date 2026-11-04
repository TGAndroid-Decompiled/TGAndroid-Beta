package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nk implements Runnable {
    public final int f24392a;
    public final hp f24393b;
    public final TLRPC.Updates f24394c;
    public final boolean d;

    public nk(hp hpVar, TLRPC.Updates updates, boolean z10, int i3) {
        this.f24392a = i3;
        this.f24393b = hpVar;
        this.f24394c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f24392a) {
            case 0:
                this.f24393b.O3(this.f24394c, this.d);
                return;
            default:
                Utilities.d.c(new nk(this.f24393b, this.f24394c, this.d, 0));
                return;
        }
    }
}
