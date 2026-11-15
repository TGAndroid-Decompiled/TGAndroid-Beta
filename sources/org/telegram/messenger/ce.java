package org.telegram.messenger;
public final class ce implements Runnable {
    public final int f22858a;
    public final boolean[] f22859b;
    public final org.telegram.ui.ActionBar.t1 f22860c;

    public ce(org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, int i7) {
        this.f22858a = i7;
        this.f22860c = t1Var;
        this.f22859b = zArr;
    }

    @Override
    public final void run() {
        int i7 = this.f22858a;
        boolean[] zArr = this.f22859b;
        org.telegram.ui.ActionBar.t1 t1Var = this.f22860c;
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

    public ce(boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f22858a = i7;
        this.f22859b = zArr;
        this.f22860c = t1Var;
    }
}
