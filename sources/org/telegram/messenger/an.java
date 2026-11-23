package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class an implements Runnable {
    public final int f22952a;
    public final yo f22953b;
    public final TLRPC.TL_error f22954c;

    public an(yo yoVar, TLRPC.TL_error tL_error, int i7) {
        this.f22952a = i7;
        this.f22953b = yoVar;
        this.f22954c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f22952a) {
            case 0:
                this.f22953b.e(this.f22954c);
                return;
            default:
                this.f22953b.e(this.f22954c);
                return;
        }
    }
}
