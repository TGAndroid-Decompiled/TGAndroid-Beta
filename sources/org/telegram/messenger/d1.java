package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Runnable {
    public final int f18146a;
    public final ResultCallback f18147b;
    public final TLRPC.TL_error f18148c;

    public d1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f18146a = i10;
        this.f18147b = resultCallback;
        this.f18148c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18146a) {
            case 0:
                this.f18147b.onError(this.f18148c);
                return;
            default:
                this.f18147b.onError(this.f18148c);
                return;
        }
    }
}
