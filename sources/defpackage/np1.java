package defpackage;

import org.telegram.ui.ActionBar.d;
public final class np1 implements gk7 {
    public final int a;
    public final tn6 b;
    public final mu1 c;
    public final mu1 d;

    public np1(mu1 mu1Var, int i, tn6 tn6Var, mu1 mu1Var2) {
        this.d = mu1Var;
        this.a = i;
        this.b = tn6Var;
        this.c = mu1Var2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4 = kk7.C;
        if (i == i4 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            gl.d3(new mp1(this.c, i, i2, objArr, (byte) 0), 50L);
            i3 = ((d) this.d).currentAccount;
            kk7.f(i3).n(this, i4);
        }
    }
}
