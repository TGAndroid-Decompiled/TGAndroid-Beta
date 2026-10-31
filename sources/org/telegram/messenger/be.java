package org.telegram.messenger;
public final class be implements Runnable {
    public final int f14756a;
    public final boolean[] f14757b;
    public final org.telegram.ui.ActionBar.x1 f14758c;

    public be(org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr, int i10) {
        this.f14756a = i10;
        this.f14758c = x1Var;
        this.f14757b = zArr;
    }

    @Override
    public final void run() {
        int i10 = this.f14756a;
        boolean[] zArr = this.f14757b;
        org.telegram.ui.ActionBar.x1 x1Var = this.f14758c;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                if (!zArr[0]) {
                    x1Var.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.U1;
                if (!zArr[0]) {
                    x1Var.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.U1;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.U1;
                try {
                    if (x1Var.isShowing()) {
                        x1Var.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }

    public be(boolean[] zArr, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f14756a = i10;
        this.f14757b = zArr;
        this.f14758c = x1Var;
    }
}
