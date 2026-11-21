package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26776a;
    public final w7 f26777b;
    public final TLRPC.Document f26778c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26776a = i7;
        this.f26777b = w7Var;
        this.f26778c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26776a) {
            case 0:
                this.f26777b.d0(this.f26778c, this.d);
                return;
            default:
                this.f26777b.a0(this.f26778c, this.d);
                return;
        }
    }
}
