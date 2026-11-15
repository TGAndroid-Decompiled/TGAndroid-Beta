package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final int f27549a;
    public final yo f27550b;
    public final TLRPC.TL_error f27551c;

    public xm(yo yoVar, TLRPC.TL_error tL_error, int i7) {
        this.f27549a = i7;
        this.f27550b = yoVar;
        this.f27551c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27549a) {
            case 0:
                this.f27550b.d(this.f27551c);
                return;
            default:
                this.f27550b.d(this.f27551c);
                return;
        }
    }
}
