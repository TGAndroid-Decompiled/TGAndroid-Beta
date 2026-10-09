package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f17283a;
    public final ResultCallback f17284b;
    public final TLRPC.TL_error f17285c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17283a = i10;
        this.f17284b = resultCallback;
        this.f17285c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17283a) {
            case 0:
                this.f17284b.onError(this.f17285c);
                return;
            default:
                this.f17284b.onError(this.f17285c);
                return;
        }
    }
}
