package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f19684a;
    public final ResultCallback f19685b;
    public final TLRPC.TL_error f19686c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f19684a = i10;
        this.f19685b = resultCallback;
        this.f19686c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19684a) {
            case 0:
                this.f19685b.onError(this.f19686c);
                return;
            default:
                this.f19685b.onError(this.f19686c);
                return;
        }
    }
}
