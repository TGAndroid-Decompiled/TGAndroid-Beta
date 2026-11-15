package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26414a;
    public final w7 f26415b;
    public final TLRPC.Document f26416c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26414a = i7;
        this.f26415b = w7Var;
        this.f26416c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26414a) {
            case 0:
                this.f26415b.d0(this.f26416c, this.d);
                return;
            default:
                this.f26415b.a0(this.f26416c, this.d);
                return;
        }
    }
}
