package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Runnable {
    public final int f15856a;
    public final ResultCallback f15857b;
    public final TLRPC.TL_error f15858c;

    public a1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f15856a = i10;
        this.f15857b = resultCallback;
        this.f15858c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f15856a) {
            case 0:
                this.f15857b.onError(this.f15858c);
                return;
            default:
                this.f15857b.onError(this.f15858c);
                return;
        }
    }
}
