package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Runnable {
    public final int f14745a;
    public final ResultCallback f14746b;
    public final TLRPC.TL_error f14747c;

    public b1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f14745a = i10;
        this.f14746b = resultCallback;
        this.f14747c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f14745a) {
            case 0:
                this.f14746b.onError(this.f14747c);
                return;
            default:
                this.f14746b.onError(this.f14747c);
                return;
        }
    }
}
