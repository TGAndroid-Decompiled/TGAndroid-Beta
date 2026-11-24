package defpackage;

import android.content.Context;
public final class i61 extends fx0 {
    public static final int m1 = 0;
    public final byte l1;

    public i61(int i, wjb wjbVar, Context context, boolean z) {
        super(i, wjbVar, context, z);
        this.l1 = (byte) 2;
    }

    @Override
    public final boolean F() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.F();
        }
    }

    @Override
    public final void p0() {
        switch (this.l1) {
            case 2:
                super.p0();
                try {
                    int v0 = bkb.v0(bkb.g5, this.J0);
                    if (this.H0 != v0) {
                        L(v0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                super.p0();
                return;
        }
    }

    public i61(byte b, Context context, boolean z) {
        super(context, z);
        this.l1 = b;
    }
}
