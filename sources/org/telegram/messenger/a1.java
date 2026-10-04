package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f17292a;
    public final ResultCallback f17293b;
    public final TLRPC.TL_error f17294c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17292a = i10;
        this.f17293b = resultCallback;
        this.f17294c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17292a) {
            case 0:
                this.f17293b.onError(this.f17294c);
                return;
            default:
                this.f17293b.onError(this.f17294c);
                return;
        }
    }
}
