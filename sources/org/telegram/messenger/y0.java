package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f19676a;
    public final ResultCallback f19677b;
    public final TLRPC.TL_error f19678c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f19676a = i10;
        this.f19677b = resultCallback;
        this.f19678c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19676a) {
            case 0:
                this.f19677b.onError(this.f19678c);
                return;
            default:
                this.f19677b.onError(this.f19678c);
                return;
        }
    }
}
