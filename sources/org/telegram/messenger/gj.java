package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gj extends fj {
    public final int f24292u3;
    public final jj f24293v3;

    public gj(jj jjVar, int i7, TLRPC.TL_message tL_message, int i10) {
        super(i7, tL_message, true, false);
        this.f24293v3 = jjVar;
        this.f24292u3 = i10;
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.f24292u3 == 2) {
            this.f24293v3.b(this);
        }
    }

    @Override
    public final boolean n5() {
        if (this.f24293v3.f24900k) {
            return false;
        }
        return super.n5();
    }
}
