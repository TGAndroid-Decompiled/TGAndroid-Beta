package defpackage;

import org.telegram.ui.ActionBar.d;
public final class ar1 implements jm7 {
    public final int a;
    public final up6 b;
    public final yv1 c;
    public final yv1 d;

    public ar1(yv1 yv1Var, int i, up6 up6Var, yv1 yv1Var2) {
        this.d = yv1Var;
        this.a = i;
        this.b = up6Var;
        this.c = yv1Var2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4 = nm7.C;
        if (i == i4 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            gm.d3(new zq1(this.c, i, i2, objArr, (byte) 0), 50L);
            i3 = ((d) this.d).currentAccount;
            nm7.f(i3).n(this, i4);
        }
    }
}
