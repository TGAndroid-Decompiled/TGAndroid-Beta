package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f15862a;
    public final ResultCallback f15863b;
    public final TLRPC.TL_error f15864c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f15862a = i10;
        this.f15863b = resultCallback;
        this.f15864c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15862a) {
            case 0:
                this.f15863b.onError(this.f15864c);
                return;
            default:
                this.f15863b.onError(this.f15864c);
                return;
        }
    }
}
