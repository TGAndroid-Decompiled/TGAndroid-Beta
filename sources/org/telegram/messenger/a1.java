package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f17287a;
    public final ResultCallback f17288b;
    public final TLRPC.TL_error f17289c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f17287a = i10;
        this.f17288b = resultCallback;
        this.f17289c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17287a) {
            case 0:
                this.f17288b.onError(this.f17289c);
                return;
            default:
                this.f17288b.onError(this.f17289c);
                return;
        }
    }
}
