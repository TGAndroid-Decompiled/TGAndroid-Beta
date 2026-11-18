package org.telegram.messenger;
public final class be implements Runnable {
    public final int f23058a;
    public final boolean[] f23059b;
    public final org.telegram.ui.ActionBar.u1 f23060c;

    public be(org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, int i7) {
        this.f23058a = i7;
        this.f23060c = u1Var;
        this.f23059b = zArr;
    }

    @Override
    public final void run() {
        int i7 = this.f23058a;
        boolean[] zArr = this.f23059b;
        org.telegram.ui.ActionBar.u1 u1Var = this.f23060c;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    u1Var.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    u1Var.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (u1Var.isShowing()) {
                        u1Var.dismiss();
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
                    if (u1Var.isShowing()) {
                        u1Var.dismiss();
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

    public be(boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f23058a = i7;
        this.f23059b = zArr;
        this.f23060c = u1Var;
    }
}
