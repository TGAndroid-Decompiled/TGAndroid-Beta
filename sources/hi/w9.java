package hi;

import android.app.Activity;
import android.app.Dialog;
public final class w9 extends org.telegram.ui.ActionBar.g2 {
    public final int f15727a;
    public final sa f15728b;

    public w9(sa saVar, int i7) {
        super(null);
        this.f15727a = i7;
        switch (i7) {
            case 1:
                this.f15728b = saVar;
                super(null);
                this.currentAccount = saVar.f15392c;
                return;
            default:
                this.f15728b = saVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f15727a) {
            case 0:
                return this.f15728b.f15388b;
            default:
                return this.f15728b.f15388b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        switch (this.f15727a) {
            case 0:
                return new fi.g2(7, this.f15728b.f15384a);
            default:
                return new fi.g2(8, this.f15728b.f15384a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f15727a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        switch (this.f15727a) {
            case 0:
                this.f15728b.S();
                return false;
            default:
                return super.presentFragment(g2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f15727a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
