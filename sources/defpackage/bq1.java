package defpackage;

import org.telegram.ui.ActionBar.e;
public final class bq1 implements fn7 {
    public final int a;
    public final gp6 b;
    public final zu1 c;
    public final zu1 d;

    public bq1(zu1 zu1Var, int i, gp6 gp6Var, zu1 zu1Var2) {
        this.d = zu1Var;
        this.a = i;
        this.b = gp6Var;
        this.c = zu1Var2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4 = jn7.C;
        if (i == i4 && ((Integer) objArr[10]).intValue() == this.a) {
            this.b.run();
            hl.d3(new aq1(this.c, i, i2, objArr, (byte) 0), 50L);
            i3 = ((e) this.d).currentAccount;
            jn7.f(i3).n(this, i4);
        }
    }
}
