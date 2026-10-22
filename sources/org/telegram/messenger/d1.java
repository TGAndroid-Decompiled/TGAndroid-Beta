package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f18123a;
    public final ResultCallback f18124b;
    public final TLRPC.TL_error f18125c;

    public d1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18123a = i10;
        this.f18124b = resultCallback;
        this.f18125c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18123a) {
            case 0:
                this.f18124b.onError(this.f18125c);
                return;
            default:
                this.f18124b.onError(this.f18125c);
                return;
        }
    }
}
