package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f26334a;
    public final qp f26335b;
    public final TLRPC.Updates f26336c;
    public final boolean d;

    public wk(qp qpVar, TLRPC.Updates updates, boolean z9, int i7) {
        this.f26334a = i7;
        this.f26335b = qpVar;
        this.f26336c = updates;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f26334a) {
            case 0:
                this.f26335b.O3(this.f26336c, this.d);
                return;
            default:
                Utilities.d.c(new wk(this.f26335b, this.f26336c, this.d, 0));
                return;
        }
    }
}
