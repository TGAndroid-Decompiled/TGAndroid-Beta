package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kj extends jj {
    public final int f16585p3;
    public final nj f16586q3;

    public kj(nj njVar, int i10, TLRPC.TL_message tL_message, int i11) {
        super(i10, tL_message, true, false);
        this.f16586q3 = njVar;
        this.f16585p3 = i11;
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.f16585p3 == 2) {
            this.f16586q3.b(this);
        }
    }

    @Override
    public final boolean n5() {
        if (this.f16586q3.f17121k) {
            return false;
        }
        return super.n5();
    }
}
