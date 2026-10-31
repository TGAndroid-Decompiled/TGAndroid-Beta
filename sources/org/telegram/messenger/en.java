package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class en implements Runnable {
    public final int f15434a;
    public final gp f15435b;
    public final TLRPC.TL_error f15436c;

    public en(gp gpVar, TLRPC.TL_error tL_error, int i10) {
        this.f15434a = i10;
        this.f15435b = gpVar;
        this.f15436c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15434a) {
            case 0:
                this.f15435b.a(this.f15436c);
                return;
            default:
                this.f15435b.a(this.f15436c);
                return;
        }
    }
}
