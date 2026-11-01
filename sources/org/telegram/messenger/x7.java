package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19407a;
    public final b8 f19408b;
    public final TLRPC.Document f19409c;
    public final boolean d;

    public x7(b8 b8Var, TLRPC.Document document, boolean z10, int i10) {
        this.f19407a = i10;
        this.f19408b = b8Var;
        this.f19409c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19407a) {
            case 0:
                this.f19408b.e0(this.f19409c, this.d);
                return;
            default:
                this.f19408b.b0(this.f19409c, this.d);
                return;
        }
    }
}
