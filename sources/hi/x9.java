package hi;

import android.app.Activity;
import android.app.Dialog;
public final class x9 extends org.telegram.ui.ActionBar.h2 {
    public final int f15744a;
    public final ta f15745b;

    public x9(ta taVar, int i7) {
        super(null);
        this.f15744a = i7;
        switch (i7) {
            case 1:
                this.f15745b = taVar;
                super(null);
                this.currentAccount = taVar.f15428c;
                return;
            default:
                this.f15745b = taVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f15744a) {
            case 0:
                return this.f15745b.f15424b;
            default:
                return this.f15745b.f15424b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        switch (this.f15744a) {
            case 0:
                return new fi.g2(7, this.f15745b.f15420a);
            default:
                return new fi.g2(8, this.f15745b.f15420a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f15744a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        switch (this.f15744a) {
            case 0:
                this.f15745b.S();
                return false;
            default:
                return super.presentFragment(h2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f15744a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
