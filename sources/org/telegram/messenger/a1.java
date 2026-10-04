package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f17288a;
    public final ResultCallback f17289b;
    public final TLRPC.TL_error f17290c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17288a = i10;
        this.f17289b = resultCallback;
        this.f17290c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17288a) {
            case 0:
                this.f17289b.onError(this.f17290c);
                return;
            default:
                this.f17289b.onError(this.f17290c);
                return;
        }
    }
}
