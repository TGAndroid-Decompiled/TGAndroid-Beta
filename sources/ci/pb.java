package ci;

import android.app.Activity;
import android.app.Dialog;
public final class pb extends org.telegram.ui.ActionBar.n2 {
    public final int f5308a;
    public final lc f5309b;

    public pb(lc lcVar, int i10) {
        super(null);
        this.f5308a = i10;
        switch (i10) {
            case 1:
                this.f5309b = lcVar;
                super(null);
                this.currentAccount = lcVar.f5033c;
                return;
            default:
                this.f5309b = lcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5308a) {
            case 0:
                return this.f5309b.f5029b;
            default:
                return this.f5309b.f5029b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        switch (this.f5308a) {
            case 0:
                return new ai.x3(7, this.f5309b.f5026a);
            default:
                return new ai.x3(8, this.f5309b.f5026a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5308a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f5308a) {
            case 0:
                this.f5309b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5308a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
