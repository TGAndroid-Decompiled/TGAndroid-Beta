package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f17318a;
    public final ResultCallback f17319b;
    public final TLRPC.TL_error f17320c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17318a = i10;
        this.f17319b = resultCallback;
        this.f17320c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17318a) {
            case 0:
                this.f17319b.onError(this.f17320c);
                return;
            default:
                this.f17319b.onError(this.f17320c);
                return;
        }
    }
}
