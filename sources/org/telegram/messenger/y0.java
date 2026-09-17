package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f19711a;
    public final ResultCallback f19712b;
    public final TLRPC.TL_error f19713c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f19711a = i10;
        this.f19712b = resultCallback;
        this.f19713c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19711a) {
            case 0:
                this.f19712b.onError(this.f19713c);
                return;
            default:
                this.f19712b.onError(this.f19713c);
                return;
        }
    }
}
