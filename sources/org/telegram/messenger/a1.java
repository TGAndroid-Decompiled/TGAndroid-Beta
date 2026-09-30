package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f15879a;
    public final ResultCallback f15880b;
    public final TLRPC.TL_error f15881c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f15879a = i10;
        this.f15880b = resultCallback;
        this.f15881c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15879a) {
            case 0:
                this.f15880b.onError(this.f15881c);
                return;
            default:
                this.f15880b.onError(this.f15881c);
                return;
        }
    }
}
