package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final int f18008a;
    public final ResultCallback f18009b;
    public final TLRPC.TL_error f18010c;

    public c1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18008a = i10;
        this.f18009b = resultCallback;
        this.f18010c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18008a) {
            case 0:
                this.f18009b.onError(this.f18010c);
                return;
            default:
                this.f18009b.onError(this.f18010c);
                return;
        }
    }
}
