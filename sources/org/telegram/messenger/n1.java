package org.telegram.messenger;
public final class n1 implements Runnable {
    public final int f24125a;
    public final org.telegram.ui.ActionBar.u1[] f24126b;

    public n1(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f24125a = i7;
        this.f24126b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f24125a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f24126b;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, t0.f25570b, null);
                u1VarArr[0] = u1Var;
                u1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f24126b[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
