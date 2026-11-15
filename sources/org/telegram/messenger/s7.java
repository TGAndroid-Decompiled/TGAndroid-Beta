package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26404a;
    public final w7 f26405b;
    public final TLRPC.Document f26406c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26404a = i7;
        this.f26405b = w7Var;
        this.f26406c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26404a) {
            case 0:
                this.f26405b.d0(this.f26406c, this.d);
                return;
            default:
                this.f26405b.a0(this.f26406c, this.d);
                return;
        }
    }
}
