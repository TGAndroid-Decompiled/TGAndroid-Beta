package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f18210a;
    public final ResultCallback f18211b;
    public final TLRPC.TL_error f18212c;

    public d1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18210a = i10;
        this.f18211b = resultCallback;
        this.f18212c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18210a) {
            case 0:
                this.f18211b.onError(this.f18212c);
                return;
            default:
                this.f18211b.onError(this.f18212c);
                return;
        }
    }
}
