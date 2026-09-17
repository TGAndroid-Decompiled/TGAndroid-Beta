package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f17926a;
    public final ResultCallback f17927b;
    public final TLRPC.TL_error f17928c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17926a = i10;
        this.f17927b = resultCallback;
        this.f17928c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17926a) {
            case 0:
                this.f17927b.onError(this.f17928c);
                return;
            default:
                this.f17927b.onError(this.f17928c);
                return;
        }
    }
}
