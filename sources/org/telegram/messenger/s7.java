package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s7 implements Runnable {
    public final int f25416a;
    public final w7 f25417b;
    public final TLRPC.Document f25418c;
    public final boolean d;

    public s7(w7 w7Var, TLRPC.Document document, boolean z9, int i7) {
        this.f25416a = i7;
        this.f25417b = w7Var;
        this.f25418c = document;
        this.d = z9;
    }

    @Override
    public final void run() {
        switch (this.f25416a) {
            case 0:
                this.f25417b.e0(this.f25418c, this.d);
                return;
            default:
                this.f25417b.b0(this.f25418c, this.d);
                return;
        }
    }
}
