package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bk implements Runnable {
    public final int f14979a;
    public final wp f14980b;
    public final TLRPC.Updates f14981c;
    public final boolean d;

    public bk(wp wpVar, TLRPC.Updates updates, boolean z10, int i10) {
        this.f14979a = i10;
        this.f14980b = wpVar;
        this.f14981c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f14979a) {
            case 0:
                this.f14980b.L3(this.f14981c, this.d);
                return;
            default:
                Utilities.d.c(new bk(this.f14980b, this.f14981c, this.d, 0));
                return;
        }
    }
}
