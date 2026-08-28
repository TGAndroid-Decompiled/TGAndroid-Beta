package kh;

import org.telegram.messenger.AndroidUtilities;
public final class d8 implements Runnable {
    public final int f15115a;
    public final k8 f15116b;

    public d8(k8 k8Var, int i9) {
        this.f15115a = i9;
        this.f15116b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f15115a) {
            case 0:
                k8.P(this.f15116b);
                return;
            case 1:
                this.f15116b.W();
                return;
            default:
                k8 k8Var = this.f15116b;
                org.telegram.ui.Cells.j3 j3Var = k8Var.U;
                if (k8Var.isShowing()) {
                    j3Var.f24544b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.f24544b);
                    return;
                }
                return;
        }
    }
}
