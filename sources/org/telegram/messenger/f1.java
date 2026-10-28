package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final int f20036a;
    public final ResultCallback f20037b;
    public final TLRPC.TL_error f20038c;

    public f1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f20036a = i10;
        this.f20037b = resultCallback;
        this.f20038c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20036a) {
            case 0:
                this.f20037b.onError(this.f20038c);
                return;
            default:
                this.f20037b.onError(this.f20038c);
                return;
        }
    }
}
