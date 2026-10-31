package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f19219a;
    public final b8 f19220b;
    public final TLRPC.Document f19221c;
    public final boolean d;

    public x7(b8 b8Var, TLRPC.Document document, boolean z10, int i10) {
        this.f19219a = i10;
        this.f19220b = b8Var;
        this.f19221c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19219a) {
            case 0:
                this.f19220b.e0(this.f19221c, this.d);
                return;
            default:
                this.f19220b.b0(this.f19221c, this.d);
                return;
        }
    }
}
