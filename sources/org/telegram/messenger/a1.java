package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f17297a;
    public final ResultCallback f17298b;
    public final TLRPC.TL_error f17299c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17297a = i10;
        this.f17298b = resultCallback;
        this.f17299c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17297a) {
            case 0:
                this.f17298b.onError(this.f17299c);
                return;
            default:
                this.f17298b.onError(this.f17299c);
                return;
        }
    }
}
