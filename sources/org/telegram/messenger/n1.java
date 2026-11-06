package org.telegram.messenger;
public final class n1 implements Runnable {
    public final int f24108a;
    public final org.telegram.ui.ActionBar.u1[] f24109b;

    public n1(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f24108a = i7;
        this.f24109b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f24108a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f24109b;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, t0.f25555b, null);
                u1VarArr[0] = u1Var;
                u1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f24109b[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
