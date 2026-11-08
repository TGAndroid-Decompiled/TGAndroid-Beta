package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f26330a;
    public final qp f26331b;
    public final TLRPC.Updates f26332c;
    public final boolean d;

    public wk(qp qpVar, TLRPC.Updates updates, boolean z9, int i7) {
        this.f26330a = i7;
        this.f26331b = qpVar;
        this.f26332c = updates;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f26330a) {
            case 0:
                this.f26331b.O3(this.f26332c, this.d);
                return;
            default:
                Utilities.d.c(new wk(this.f26331b, this.f26332c, this.d, 0));
                return;
        }
    }
}
