package org.telegram.messenger;
public final class be implements Runnable {
    public final int f23183a;
    public final boolean[] f23184b;
    public final org.telegram.ui.ActionBar.t1 f23185c;

    public be(org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, int i7) {
        this.f23183a = i7;
        this.f23185c = t1Var;
        this.f23184b = zArr;
    }

    @Override
    public final void run() {
        int i7 = this.f23183a;
        boolean[] zArr = this.f23184b;
        org.telegram.ui.ActionBar.t1 t1Var = this.f23185c;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    t1Var.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    t1Var.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (t1Var.isShowing()) {
                        t1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (t1Var.isShowing()) {
                        t1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }

    public be(boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f23183a = i7;
        this.f23184b = zArr;
        this.f23185c = t1Var;
    }
}
