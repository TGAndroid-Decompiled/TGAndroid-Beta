package hi;

import android.app.Activity;
import android.app.Dialog;
public final class x9 extends org.telegram.ui.ActionBar.h2 {
    public final int f15747a;
    public final ta f15748b;

    public x9(ta taVar, int i7) {
        super(null);
        this.f15747a = i7;
        switch (i7) {
            case 1:
                this.f15748b = taVar;
                super(null);
                this.currentAccount = taVar.f15431c;
                return;
            default:
                this.f15748b = taVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f15747a) {
            case 0:
                return this.f15748b.f15427b;
            default:
                return this.f15748b.f15427b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        switch (this.f15747a) {
            case 0:
                return new fi.g2(7, this.f15748b.f15423a);
            default:
                return new fi.g2(8, this.f15748b.f15423a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f15747a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        switch (this.f15747a) {
            case 0:
                this.f15748b.S();
                return false;
            default:
                return super.presentFragment(h2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f15747a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
