package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

public final class y0 implements Runnable {

    public final int f22187a;

    public final ResultCallback f22188b;

    public final TLRPC.TL_error f22189c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f22187a = i10;
        this.f22188b = resultCallback;
        this.f22189c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f22187a) {
            case 0:
                this.f22188b.onError(this.f22189c);
                break;
            default:
                this.f22188b.onError(this.f22189c);
                break;
        }
    }
}
