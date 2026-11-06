package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f25424a;
    public final w7 f25425b;
    public final TLRPC.Document f25426c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z9, int i7) {
        this.f25424a = i7;
        this.f25425b = w7Var;
        this.f25426c = document;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f25424a) {
            case 0:
                this.f25425b.d0(this.f25426c, this.d);
                return;
            default:
                this.f25425b.a0(this.f25426c, this.d);
                return;
        }
    }
}
