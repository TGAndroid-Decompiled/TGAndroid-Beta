package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jj extends ij {
    public final int f23568s3;
    public final mj f23569t3;

    public jj(mj mjVar, int i7, TLRPC.TL_message tL_message, int i10) {
        super(i7, tL_message, true, false);
        this.f23569t3 = mjVar;
        this.f23568s3 = i10;
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.f23568s3 == 2) {
            this.f23569t3.b(this);
        }
    }

    @Override
    public final boolean o5() {
        if (this.f23569t3.f24038k) {
            return false;
        }
        return super.o5();
    }
}
