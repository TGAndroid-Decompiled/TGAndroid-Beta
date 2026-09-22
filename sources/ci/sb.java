package ci;

import android.app.Activity;
import android.app.Dialog;
public final class sb extends org.telegram.ui.ActionBar.n2 {
    public final int f5527a;
    public final oc f5528b;

    public sb(oc ocVar, int i10) {
        super(null);
        this.f5527a = i10;
        switch (i10) {
            case 1:
                this.f5528b = ocVar;
                super(null);
                this.currentAccount = ocVar.f5210c;
                return;
            default:
                this.f5528b = ocVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5527a) {
            case 0:
                return this.f5528b.f5206b;
            default:
                return this.f5528b.f5206b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f5527a) {
            case 0:
                return new ai.x3(7, this.f5528b.f5203a);
            default:
                return new ai.x3(8, this.f5528b.f5203a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5527a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f5527a) {
            case 0:
                this.f5528b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5527a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
