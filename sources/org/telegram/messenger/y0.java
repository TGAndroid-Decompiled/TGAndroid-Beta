package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f19649a;
    public final ResultCallback f19650b;
    public final TLRPC.TL_error f19651c;

    public y0(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f19649a = i10;
        this.f19650b = resultCallback;
        this.f19651c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19649a) {
            case 0:
                this.f19650b.onError(this.f19651c);
                return;
            default:
                this.f19650b.onError(this.f19651c);
                return;
        }
    }
}
