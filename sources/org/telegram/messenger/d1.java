package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f18136a;
    public final ResultCallback f18137b;
    public final TLRPC.TL_error f18138c;

    public d1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18136a = i10;
        this.f18137b = resultCallback;
        this.f18138c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18136a) {
            case 0:
                this.f18137b.onError(this.f18138c);
                return;
            default:
                this.f18137b.onError(this.f18138c);
                return;
        }
    }
}
