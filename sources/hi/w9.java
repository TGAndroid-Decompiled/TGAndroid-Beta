package hi;

import android.app.Activity;
import android.app.Dialog;
public final class w9 extends org.telegram.ui.ActionBar.g2 {
    public final int f15724a;
    public final sa f15725b;

    public w9(sa saVar, int i7) {
        super(null);
        this.f15724a = i7;
        switch (i7) {
            case 1:
                this.f15725b = saVar;
                super(null);
                this.currentAccount = saVar.f15389c;
                return;
            default:
                this.f15725b = saVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f15724a) {
            case 0:
                return this.f15725b.f15385b;
            default:
                return this.f15725b.f15385b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        switch (this.f15724a) {
            case 0:
                return new fi.g2(7, this.f15725b.f15381a);
            default:
                return new fi.g2(8, this.f15725b.f15381a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f15724a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        switch (this.f15724a) {
            case 0:
                this.f15725b.S();
                return false;
            default:
                return super.presentFragment(g2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f15724a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
