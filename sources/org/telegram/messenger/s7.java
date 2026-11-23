package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26757a;
    public final w7 f26758b;
    public final TLRPC.Document f26759c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26757a = i7;
        this.f26758b = w7Var;
        this.f26759c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26757a) {
            case 0:
                this.f26758b.d0(this.f26759c, this.d);
                return;
            default:
                this.f26758b.a0(this.f26759c, this.d);
                return;
        }
    }
}
