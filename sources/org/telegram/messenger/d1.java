package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f17357a;
    public final ResultCallback f17358b;
    public final TLRPC.TL_error f17359c;

    public d1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17357a = i10;
        this.f17358b = resultCallback;
        this.f17359c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17357a) {
            case 0:
                this.f17358b.onError(this.f17359c);
                return;
            default:
                this.f17358b.onError(this.f17359c);
                return;
        }
    }
}
