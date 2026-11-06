package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f26477a;
    public final qp f26478b;
    public final TLRPC.Updates f26479c;
    public final boolean d;

    public xk(qp qpVar, TLRPC.Updates updates, boolean z9, int i7) {
        this.f26477a = i7;
        this.f26478b = qpVar;
        this.f26479c = updates;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f26477a) {
            case 0:
                this.f26478b.O3(this.f26479c, this.d);
                return;
            default:
                Utilities.d.c(new xk(this.f26478b, this.f26479c, this.d, 0));
                return;
        }
    }
}
