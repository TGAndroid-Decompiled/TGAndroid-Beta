package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class an implements Runnable {
    public final int f21474a;
    public final bp f21475b;
    public final TLRPC.TL_error f21476c;

    public an(bp bpVar, TLRPC.TL_error tL_error, int i7) {
        this.f21474a = i7;
        this.f21475b = bpVar;
        this.f21476c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21474a) {
            case 0:
                this.f21475b.a(this.f21476c);
                return;
            default:
                this.f21475b.a(this.f21476c);
                return;
        }
    }
}
