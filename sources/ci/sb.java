package ci;

import android.app.Activity;
import android.app.Dialog;
public final class sb extends org.telegram.ui.ActionBar.n2 {
    public final int f5529a;
    public final oc f5530b;

    public sb(oc ocVar, int i10) {
        super(null);
        this.f5529a = i10;
        switch (i10) {
            case 1:
                this.f5530b = ocVar;
                super(null);
                this.currentAccount = ocVar.f5212c;
                return;
            default:
                this.f5530b = ocVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5529a) {
            case 0:
                return this.f5530b.f5208b;
            default:
                return this.f5530b.f5208b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f5529a) {
            case 0:
                return new ai.x3(7, this.f5530b.f5205a);
            default:
                return new ai.x3(8, this.f5530b.f5205a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5529a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f5529a) {
            case 0:
                this.f5530b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5529a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
