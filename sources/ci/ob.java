package ci;

import android.app.Activity;
import android.app.Dialog;
public final class ob extends org.telegram.ui.ActionBar.o2 {
    public final int f5270a;
    public final kc f5271b;

    public ob(kc kcVar, int i10) {
        super(null);
        this.f5270a = i10;
        switch (i10) {
            case 1:
                this.f5271b = kcVar;
                super(null);
                this.currentAccount = kcVar.f4989c;
                return;
            default:
                this.f5271b = kcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5270a) {
            case 0:
                return this.f5271b.f4985b;
            default:
                return this.f5271b.f4985b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.f5270a) {
            case 0:
                return new ai.x3(7, this.f5271b.f4982a);
            default:
                return new ai.x3(8, this.f5271b.f4982a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5270a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.f5270a) {
            case 0:
                this.f5271b.T();
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5270a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
