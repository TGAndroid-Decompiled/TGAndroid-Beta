package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f15863a;
    public final ResultCallback f15864b;
    public final TLRPC.TL_error f15865c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f15863a = i10;
        this.f15864b = resultCallback;
        this.f15865c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15863a) {
            case 0:
                this.f15864b.onError(this.f15865c);
                return;
            default:
                this.f15864b.onError(this.f15865c);
                return;
        }
    }
}
