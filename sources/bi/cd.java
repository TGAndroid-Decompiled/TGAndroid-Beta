package bi;

import android.app.Activity;
import android.app.Dialog;
public final class cd extends org.telegram.ui.ActionBar.p2 {
    public final int f2428a;
    public final ce f2429b;

    public cd(ce ceVar, int i10) {
        super(null);
        this.f2428a = i10;
        switch (i10) {
            case 1:
                this.f2429b = ceVar;
                super(null);
                this.currentAccount = ceVar.f2437c;
                return;
            default:
                this.f2429b = ceVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f2428a) {
            case 0:
                return this.f2429b.f2433b;
            default:
                return this.f2429b.f2433b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f2428a) {
            case 0:
                return new n1(2, this.f2429b.f2430a);
            default:
                return new n1(3, this.f2429b.f2430a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f2428a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.f2428a) {
            case 0:
                this.f2429b.T();
                return false;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f2428a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
