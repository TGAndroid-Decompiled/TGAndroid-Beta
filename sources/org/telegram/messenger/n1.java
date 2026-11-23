package org.telegram.messenger;
public final class n1 implements Runnable {
    public final int f25715a;
    public final org.telegram.ui.ActionBar.t1[] f25716b;

    public n1(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.f25715a = i7;
        this.f25716b = t1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25715a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.f25716b;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, t0.f26931b, null);
                t1VarArr[0] = t1Var;
                t1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f25716b[0];
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
