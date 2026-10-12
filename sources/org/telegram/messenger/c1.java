package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final int f16916a;
    public final ResultCallback f16917b;
    public final TLRPC.TL_error f16918c;

    public c1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f16916a = i10;
        this.f16917b = resultCallback;
        this.f16918c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16916a) {
            case 0:
                this.f16917b.onError(this.f16918c);
                return;
            default:
                this.f16917b.onError(this.f16918c);
                return;
        }
    }
}
