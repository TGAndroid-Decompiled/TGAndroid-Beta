package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final int f17999a;
    public final ResultCallback f18000b;
    public final TLRPC.TL_error f18001c;

    public c1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17999a = i10;
        this.f18000b = resultCallback;
        this.f18001c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17999a) {
            case 0:
                this.f18000b.onError(this.f18001c);
                return;
            default:
                this.f18000b.onError(this.f18001c);
                return;
        }
    }
}
