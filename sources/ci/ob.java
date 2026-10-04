package ci;

import android.app.Activity;
import android.app.Dialog;
public final class ob extends org.telegram.ui.ActionBar.n2 {
    public final int f5674a;
    public final kc f5675b;

    public ob(kc kcVar, int i10) {
        super(null);
        this.f5674a = i10;
        switch (i10) {
            case 1:
                this.f5675b = kcVar;
                super(null);
                this.currentAccount = kcVar.f5380c;
                return;
            default:
                this.f5675b = kcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5674a) {
            case 0:
                return this.f5675b.f5376b;
            default:
                return this.f5675b.f5376b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        switch (this.f5674a) {
            case 0:
                return new ai.x3(7, this.f5675b.f5373a);
            default:
                return new ai.x3(8, this.f5675b.f5373a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5674a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f5674a) {
            case 0:
                this.f5675b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5674a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
