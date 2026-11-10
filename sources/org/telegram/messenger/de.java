package org.telegram.messenger;
public final class de implements Runnable {
    public final int f22022a;
    public final boolean[] f22023b;
    public final org.telegram.ui.ActionBar.u1 f22024c;

    public de(org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, int i7) {
        this.f22022a = i7;
        this.f22024c = u1Var;
        this.f22023b = zArr;
    }

    @Override
    public final void run() {
        int i7 = this.f22022a;
        boolean[] zArr = this.f22023b;
        org.telegram.ui.ActionBar.u1 u1Var = this.f22024c;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                if (!zArr[0]) {
                    u1Var.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.V1;
                if (!zArr[0]) {
                    u1Var.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.V1;
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
                String[] strArr4 = MediaController.V1;
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

    public de(boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f22022a = i7;
        this.f22023b = zArr;
        this.f22024c = u1Var;
    }
}
