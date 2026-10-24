package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f18186a;
    public final ResultCallback f18187b;
    public final TLRPC.TL_error f18188c;

    public d1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18186a = i10;
        this.f18187b = resultCallback;
        this.f18188c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18186a) {
            case 0:
                this.f18187b.onError(this.f18188c);
                return;
            default:
                this.f18187b.onError(this.f18188c);
                return;
        }
    }
}
