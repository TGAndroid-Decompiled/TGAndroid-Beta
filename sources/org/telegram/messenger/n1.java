package org.telegram.messenger;
public final class n1 implements Runnable {
    public final int f25875a;
    public final org.telegram.ui.ActionBar.u1[] f25876b;

    public n1(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.f25875a = i7;
        this.f25876b = u1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25875a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.f25876b;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, t0.f26913b, null);
                u1VarArr[0] = u1Var;
                u1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f25876b[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
