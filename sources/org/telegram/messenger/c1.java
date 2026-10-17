package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final int f17996a;
    public final ResultCallback f17997b;
    public final TLRPC.TL_error f17998c;

    public c1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17996a = i10;
        this.f17997b = resultCallback;
        this.f17998c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17996a) {
            case 0:
                this.f17997b.onError(this.f17998c);
                return;
            default:
                this.f17997b.onError(this.f17998c);
                return;
        }
    }
}
