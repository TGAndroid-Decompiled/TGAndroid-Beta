package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26750a;
    public final w7 f26751b;
    public final TLRPC.Document f26752c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26750a = i7;
        this.f26751b = w7Var;
        this.f26752c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26750a) {
            case 0:
                this.f26751b.d0(this.f26752c, this.d);
                return;
            default:
                this.f26751b.a0(this.f26752c, this.d);
                return;
        }
    }
}
