package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jj extends ij {
    public final int f23542s3;
    public final mj f23543t3;

    public jj(mj mjVar, int i7, TLRPC.TL_message tL_message, int i10) {
        super(i7, tL_message, true, false);
        this.f23543t3 = mjVar;
        this.f23542s3 = i10;
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.f23542s3 == 2) {
            this.f23543t3.b(this);
        }
    }

    @Override
    public final boolean o5() {
        if (this.f23543t3.f24026k) {
            return false;
        }
        return super.o5();
    }
}
