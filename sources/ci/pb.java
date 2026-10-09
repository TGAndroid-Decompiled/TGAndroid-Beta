package ci;

import android.app.Activity;
import android.app.Dialog;
public final class pb extends org.telegram.ui.ActionBar.n2 {
    public final int f5741a;
    public final lc f5742b;

    public pb(lc lcVar, int i10) {
        super(null);
        this.f5741a = i10;
        switch (i10) {
            case 1:
                this.f5742b = lcVar;
                super(null);
                this.currentAccount = lcVar.f5465c;
                return;
            default:
                this.f5742b = lcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5741a) {
            case 0:
                return this.f5742b.f5461b;
            default:
                return this.f5742b.f5461b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.f5741a) {
            case 0:
                return new ai.y3(7, this.f5742b.f5458a);
            default:
                return new ai.y3(8, this.f5742b.f5458a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5741a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f5741a) {
            case 0:
                this.f5742b.S();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5741a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
