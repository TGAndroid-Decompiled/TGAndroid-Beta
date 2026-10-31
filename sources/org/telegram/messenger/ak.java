package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ak implements Runnable {
    public final int f14624a;
    public final vp f14625b;
    public final TLRPC.Updates f14626c;
    public final boolean d;

    public ak(vp vpVar, TLRPC.Updates updates, boolean z10, int i10) {
        this.f14624a = i10;
        this.f14625b = vpVar;
        this.f14626c = updates;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f14624a) {
            case 0:
                this.f14625b.L3(this.f14626c, this.d);
                return;
            default:
                Utilities.d.c(new ak(this.f14625b, this.f14626c, this.d, 0));
                return;
        }
    }
}
