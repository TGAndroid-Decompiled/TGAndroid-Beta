package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26721a;
    public final w7 f26722b;
    public final TLRPC.Document f26723c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26721a = i7;
        this.f26722b = w7Var;
        this.f26723c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26721a) {
            case 0:
                this.f26722b.d0(this.f26723c, this.d);
                return;
            default:
                this.f26722b.a0(this.f26723c, this.d);
                return;
        }
    }
}
