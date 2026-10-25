package org.telegram.messenger;

import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public final class f1 implements Runnable {
    public final int f20039a;
    public final ResultCallback f20040b;
    public final TLRPC.TL_error f20041c;

    public f1(ResultCallback resultCallback, TLRPC.TL_error tL_error, int i10) {
        this.f20039a = i10;
        this.f20040b = resultCallback;
        this.f20041c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20039a) {
            case 0:
                this.f20040b.onError(this.f20041c);
                return;
            default:
                this.f20040b.onError(this.f20041c);
                return;
        }
    }
}
