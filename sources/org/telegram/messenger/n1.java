package org.telegram.messenger;
public final class n1 implements Runnable {
    public final int f25903a;
    public final org.telegram.ui.ActionBar.t1[] f25904b;

    public n1(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f25903a = i7;
        this.f25904b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25903a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f25904b;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, t0.f26941b, null);
                t1VarArr[0] = t1Var;
                t1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f25904b[0];
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
