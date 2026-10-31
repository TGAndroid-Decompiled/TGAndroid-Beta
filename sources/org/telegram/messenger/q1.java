package org.telegram.messenger;
public final class q1 implements Runnable {
    public final int f17544a;
    public final org.telegram.ui.ActionBar.x1[] f17545b;

    public q1(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10) {
        this.f17544a = i10;
        this.f17545b = x1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17544a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.f17545b;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, w0.f19025b, null);
                x1VarArr[0] = x1Var;
                x1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.f17545b[0];
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
