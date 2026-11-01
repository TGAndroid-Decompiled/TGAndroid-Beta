package org.telegram.messenger;
public final class q1 implements Runnable {
    public final int f17730a;
    public final org.telegram.ui.ActionBar.x1[] f17731b;

    public q1(org.telegram.ui.ActionBar.x1[] x1VarArr, int i10) {
        this.f17730a = i10;
        this.f17731b = x1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f17730a) {
            case 0:
                org.telegram.ui.ActionBar.x1[] x1VarArr = this.f17731b;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, w0.f18945b, null);
                x1VarArr[0] = x1Var;
                x1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.f17731b[0];
                if (x1Var2 != null) {
                    x1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
