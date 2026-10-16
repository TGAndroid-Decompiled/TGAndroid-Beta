package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final int f16613a;
    public final ResultCallback f16614b;
    public final TLRPC.TL_error f16615c;

    public c1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f16613a = i10;
        this.f16614b = resultCallback;
        this.f16615c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16613a) {
            case 0:
                this.f16614b.onError(this.f16615c);
                return;
            default:
                this.f16614b.onError(this.f16615c);
                return;
        }
    }
}
