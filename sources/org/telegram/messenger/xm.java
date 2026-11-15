package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final int f27550a;
    public final yo f27551b;
    public final TLRPC.TL_error f27552c;

    public xm(yo yoVar, TLRPC.TL_error tL_error, int i7) {
        this.f27550a = i7;
        this.f27551b = yoVar;
        this.f27552c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27550a) {
            case 0:
                this.f27551b.d(this.f27552c);
                return;
            default:
                this.f27551b.d(this.f27552c);
                return;
        }
    }
}
