package hi;

import android.app.Activity;
import android.app.Dialog;
public final class ra extends org.telegram.ui.ActionBar.g2 {
    public final int f15326a;
    public final nb f15327b;

    public ra(nb nbVar, int i7) {
        super(null);
        this.f15326a = i7;
        switch (i7) {
            case 1:
                this.f15327b = nbVar;
                super(null);
                this.currentAccount = nbVar.f15062c;
                return;
            default:
                this.f15327b = nbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f15326a) {
            case 0:
                return this.f15327b.f15058b;
            default:
                return this.f15327b.f15058b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        switch (this.f15326a) {
            case 0:
                return new fi.g2(7, this.f15327b.f15054a);
            default:
                return new fi.g2(8, this.f15327b.f15054a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f15326a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        switch (this.f15326a) {
            case 0:
                this.f15327b.S();
                return false;
            default:
                return super.presentFragment(g2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f15326a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
