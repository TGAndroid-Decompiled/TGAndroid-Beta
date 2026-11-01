package org.telegram.messenger;
public final class ce implements Runnable {
    public final int f15138a;
    public final boolean[] f15139b;
    public final org.telegram.ui.ActionBar.x1 f15140c;

    public ce(org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr, int i10) {
        this.f15138a = i10;
        this.f15140c = x1Var;
        this.f15139b = zArr;
    }

    @Override
    public final void run() {
        int i10 = this.f15138a;
        boolean[] zArr = this.f15139b;
        org.telegram.ui.ActionBar.x1 x1Var = this.f15140c;
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

    public ce(boolean[] zArr, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f15138a = i10;
        this.f15139b = zArr;
        this.f15140c = x1Var;
    }
}
