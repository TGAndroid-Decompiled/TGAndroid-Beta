package hi;

import android.app.Activity;
import android.app.Dialog;
public final class w9 extends org.telegram.ui.ActionBar.e2 {
    public final int f15309a;
    public final sa f15310b;

    public w9(sa saVar, int i7) {
        super(null);
        this.f15309a = i7;
        switch (i7) {
            case 1:
                this.f15310b = saVar;
                super(null);
                this.currentAccount = saVar.f15043c;
                return;
            default:
                this.f15310b = saVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f15309a) {
            case 0:
                return this.f15310b.f15039b;
            default:
                return this.f15310b.f15039b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.f15309a) {
            case 0:
                return new fi.i2(7, this.f15310b.f15035a);
            default:
                return new fi.i2(8, this.f15310b.f15035a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f15309a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        switch (this.f15309a) {
            case 0:
                this.f15310b.S();
                return false;
            default:
                return super.presentFragment(e2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f15309a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
