package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f25420a;
    public final w7 f25421b;
    public final TLRPC.Document f25422c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z9, int i7) {
        this.f25420a = i7;
        this.f25421b = w7Var;
        this.f25422c = document;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f25420a) {
            case 0:
                this.f25421b.d0(this.f25422c, this.d);
                return;
            default:
                this.f25421b.a0(this.f25422c, this.d);
                return;
        }
    }
}
