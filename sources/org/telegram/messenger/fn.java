package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fn implements Runnable {
    public final int f15775a;
    public final hp f15776b;
    public final TLRPC.TL_error f15777c;

    public fn(hp hpVar, TLRPC.TL_error tL_error, int i10) {
        this.f15775a = i10;
        this.f15776b = hpVar;
        this.f15777c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15775a) {
            case 0:
                this.f15776b.a(this.f15777c);
                return;
            default:
                this.f15776b.a(this.f15777c);
                return;
        }
    }
}
