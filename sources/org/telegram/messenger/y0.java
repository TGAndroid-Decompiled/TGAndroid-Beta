package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f17917a;
    public final ResultCallback f17918b;
    public final TLRPC.TL_error f17919c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17917a = i10;
        this.f17918b = resultCallback;
        this.f17919c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17917a) {
            case 0:
                this.f17918b.onError(this.f17919c);
                return;
            default:
                this.f17918b.onError(this.f17919c);
                return;
        }
    }
}
