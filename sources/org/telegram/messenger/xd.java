package org.telegram.messenger;
public final class xd implements Runnable {
    public final int f26365a;
    public final boolean[] f26366b;
    public final org.telegram.ui.ActionBar.s1 f26367c;

    public xd(org.telegram.ui.ActionBar.s1 s1Var, boolean[] zArr, int i3) {
        this.f26365a = i3;
        this.f26367c = s1Var;
        this.f26366b = zArr;
    }

    @Override
    public final void run() {
        int i3 = this.f26365a;
        boolean[] zArr = this.f26366b;
        org.telegram.ui.ActionBar.s1 s1Var = this.f26367c;
        switch (i3) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    s1Var.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    s1Var.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (s1Var.isShowing()) {
                        s1Var.dismiss();
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
                    if (s1Var.isShowing()) {
                        s1Var.dismiss();
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

    public xd(boolean[] zArr, org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f26365a = i3;
        this.f26366b = zArr;
        this.f26367c = s1Var;
    }
}
