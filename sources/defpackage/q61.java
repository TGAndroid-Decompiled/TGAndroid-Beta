package defpackage;

import android.content.Context;
public final class q61 extends nx0 {
    public static final int m1 = 0;
    public final byte l1;

    public q61(int i, vnb vnbVar, Context context, boolean z) {
        super(i, vnbVar, context, z);
        this.l1 = (byte) 2;
    }

    @Override
    public final boolean E() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.E();
        }
    }

    @Override
    public final void p0() {
        switch (this.l1) {
            case 2:
                super.p0();
                try {
                    int v0 = aob.v0(aob.h5, this.J0);
                    if (this.H0 != v0) {
                        K(v0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                super.p0();
                return;
        }
    }

    public q61(byte b, Context context, boolean z) {
        super(context, z);
        this.l1 = b;
    }
}
