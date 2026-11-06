package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f26485a;
    public final qp f26486b;
    public final TLRPC.Updates f26487c;
    public final boolean d;

    public xk(qp qpVar, TLRPC.Updates updates, boolean z9, int i7) {
        this.f26485a = i7;
        this.f26486b = qpVar;
        this.f26487c = updates;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f26485a) {
            case 0:
                this.f26486b.O3(this.f26487c, this.d);
                return;
            default:
                Utilities.d.c(new xk(this.f26486b, this.f26487c, this.d, 0));
                return;
        }
    }
}
