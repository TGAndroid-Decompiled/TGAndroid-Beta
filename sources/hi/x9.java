package hi;

import android.app.Activity;
import android.app.Dialog;
public final class x9 extends org.telegram.ui.ActionBar.g2 {
    public final int f15699a;
    public final ta f15700b;

    public x9(ta taVar, int i7) {
        super(null);
        this.f15699a = i7;
        switch (i7) {
            case 1:
                this.f15700b = taVar;
                super(null);
                this.currentAccount = taVar.f15395c;
                return;
            default:
                this.f15700b = taVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f15699a) {
            case 0:
                return this.f15700b.f15391b;
            default:
                return this.f15700b.f15391b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        switch (this.f15699a) {
            case 0:
                return new fi.g2(7, this.f15700b.f15387a);
            default:
                return new fi.g2(8, this.f15700b.f15387a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f15699a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        switch (this.f15699a) {
            case 0:
                this.f15700b.S();
                return false;
            default:
                return super.presentFragment(g2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f15699a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
