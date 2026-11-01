package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lj extends kj {
    public final int f16950p3;
    public final oj f16951q3;

    public lj(oj ojVar, int i10, TLRPC.TL_message tL_message, int i11) {
        super(i10, tL_message, true, false);
        this.f16951q3 = ojVar;
        this.f16950p3 = i11;
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.f16950p3 == 2) {
            this.f16951q3.b(this);
        }
    }

    @Override
    public final boolean n5() {
        if (this.f16951q3.f17458k) {
            return false;
        }
        return super.n5();
    }
}
