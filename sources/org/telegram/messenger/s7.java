package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f25281a;
    public final w7 f25282b;
    public final TLRPC.Document f25283c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z10, int i3) {
        this.f25281a = i3;
        this.f25282b = w7Var;
        this.f25283c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f25281a) {
            case 0:
                this.f25282b.e0(this.f25283c, this.d);
                return;
            default:
                this.f25282b.b0(this.f25283c, this.d);
                return;
        }
    }
}
