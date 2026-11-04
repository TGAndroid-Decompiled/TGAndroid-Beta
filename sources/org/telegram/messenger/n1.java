package org.telegram.messenger;
public final class n1 implements Runnable {
    public final int f24302a;
    public final org.telegram.ui.ActionBar.s1[] f24303b;

    public n1(org.telegram.ui.ActionBar.s1[] s1VarArr, int i3) {
        this.f24302a = i3;
        this.f24303b = s1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f24302a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.f24303b;
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, t0.f25457b, null);
                s1VarArr[0] = s1Var;
                s1Var.r(500L);
                return;
            default:
                org.telegram.ui.ActionBar.s1 s1Var2 = this.f24303b[0];
                if (s1Var2 != null) {
                    s1Var2.dismiss();
                    return;
                }
                return;
        }
    }
}
