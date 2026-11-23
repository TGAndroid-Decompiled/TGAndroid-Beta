package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hj extends gj {
    public final int f24495u3;
    public final kj f24496v3;

    public hj(kj kjVar, int i7, TLRPC.TL_message tL_message, int i10) {
        super(i7, tL_message, true, false);
        this.f24496v3 = kjVar;
        this.f24495u3 = i10;
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.f24495u3 == 2) {
            this.f24496v3.b(this);
        }
    }

    @Override
    public final boolean n5() {
        if (this.f24496v3.f25087k) {
            return false;
        }
        return super.n5();
    }
}
