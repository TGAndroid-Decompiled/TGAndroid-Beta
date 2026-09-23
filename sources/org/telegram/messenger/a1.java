package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f15607a;
    public final ResultCallback f15608b;
    public final TLRPC.TL_error f15609c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f15607a = i10;
        this.f15608b = resultCallback;
        this.f15609c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15607a) {
            case 0:
                this.f15608b.onError(this.f15609c);
                return;
            default:
                this.f15608b.onError(this.f15609c);
                return;
        }
    }
}
