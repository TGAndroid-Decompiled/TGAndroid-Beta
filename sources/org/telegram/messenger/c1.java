package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Runnable {
    public final int f18011a;
    public final ResultCallback f18012b;
    public final TLRPC.TL_error f18013c;

    public c1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18011a = i10;
        this.f18012b = resultCallback;
        this.f18013c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18011a) {
            case 0:
                this.f18012b.onError(this.f18013c);
                return;
            default:
                this.f18012b.onError(this.f18013c);
                return;
        }
    }
}
