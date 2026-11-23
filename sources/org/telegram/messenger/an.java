package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class an implements Runnable {
    public final int f22916a;
    public final yo f22917b;
    public final TLRPC.TL_error f22918c;

    public an(yo yoVar, TLRPC.TL_error tL_error, int i7) {
        this.f22916a = i7;
        this.f22917b = yoVar;
        this.f22918c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f22916a) {
            case 0:
                this.f22917b.e(this.f22918c);
                return;
            default:
                this.f22917b.e(this.f22918c);
                return;
        }
    }
}
