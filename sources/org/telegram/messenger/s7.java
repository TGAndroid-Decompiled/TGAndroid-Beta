package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26748a;
    public final w7 f26749b;
    public final TLRPC.Document f26750c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26748a = i7;
        this.f26749b = w7Var;
        this.f26750c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26748a) {
            case 0:
                this.f26749b.d0(this.f26750c, this.d);
                return;
            default:
                this.f26749b.a0(this.f26750c, this.d);
                return;
        }
    }
}
