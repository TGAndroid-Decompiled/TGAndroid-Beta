package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f22206a;
    public final ResultCallback f22207b;
    public final TLRPC.TL_error f22208c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f22206a = i10;
        this.f22207b = resultCallback;
        this.f22208c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f22206a) {
            case 0:
                this.f22207b.onError(this.f22208c);
                return;
            default:
                this.f22207b.onError(this.f22208c);
                return;
        }
    }
}
