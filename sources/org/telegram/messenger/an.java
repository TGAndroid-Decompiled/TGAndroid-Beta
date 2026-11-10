package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class an implements Runnable {
    public final int f21495a;
    public final bp f21496b;
    public final TLRPC.TL_error f21497c;

    public an(bp bpVar, TLRPC.TL_error tL_error, int i7) {
        this.f21495a = i7;
        this.f21496b = bpVar;
        this.f21497c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21495a) {
            case 0:
                this.f21496b.a(this.f21497c);
                return;
            default:
                this.f21496b.a(this.f21497c);
                return;
        }
    }
}
