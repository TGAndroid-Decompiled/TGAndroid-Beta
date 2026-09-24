package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f15847a;
    public final ResultCallback f15848b;
    public final TLRPC.TL_error f15849c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f15847a = i10;
        this.f15848b = resultCallback;
        this.f15849c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15847a) {
            case 0:
                this.f15848b.onError(this.f15849c);
                return;
            default:
                this.f15848b.onError(this.f15849c);
                return;
        }
    }
}
