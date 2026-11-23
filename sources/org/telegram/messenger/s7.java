package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f26856a;
    public final w7 f26857b;
    public final TLRPC.Document f26858c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i7) {
        this.f26856a = i7;
        this.f26857b = w7Var;
        this.f26858c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26856a) {
            case 0:
                this.f26857b.d0(this.f26858c, this.d);
                return;
            default:
                this.f26857b.a0(this.f26858c, this.d);
                return;
        }
    }
}
