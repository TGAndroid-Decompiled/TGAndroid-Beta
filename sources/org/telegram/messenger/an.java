package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class an implements Runnable {
    public final int f21490a;
    public final bp f21491b;
    public final TLRPC.TL_error f21492c;

    public an(bp bpVar, TLRPC.TL_error tL_error, int i7) {
        this.f21490a = i7;
        this.f21491b = bpVar;
        this.f21492c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21490a) {
            case 0:
                this.f21491b.a(this.f21492c);
                return;
            default:
                this.f21491b.a(this.f21492c);
                return;
        }
    }
}
