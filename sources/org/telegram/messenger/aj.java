package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj extends zi {
    public final int f21531s3;
    public final dj f21532t3;

    public aj(dj djVar, int i3, TLRPC.TL_message tL_message, int i10) {
        super(i3, tL_message, true, false);
        this.f21532t3 = djVar;
        this.f21531s3 = i10;
    }

    @Override
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.f21531s3 == 2) {
            this.f21532t3.b(this);
        }
    }

    @Override
    public final boolean o5() {
        if (this.f21532t3.f22205k) {
            return false;
        }
        return super.o5();
    }
}
