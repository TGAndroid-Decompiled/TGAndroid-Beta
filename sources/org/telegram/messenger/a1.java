package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f17282a;
    public final ResultCallback f17283b;
    public final TLRPC.TL_error f17284c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17282a = i10;
        this.f17283b = resultCallback;
        this.f17284c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17282a) {
            case 0:
                this.f17283b.onError(this.f17284c);
                return;
            default:
                this.f17283b.onError(this.f17284c);
                return;
        }
    }
}
