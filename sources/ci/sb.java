package ci;

import android.app.Activity;
import android.app.Dialog;
public final class sb extends org.telegram.ui.ActionBar.o2 {
    public final int f5528a;
    public final oc f5529b;

    public sb(oc ocVar, int i10) {
        super(null);
        this.f5528a = i10;
        switch (i10) {
            case 1:
                this.f5529b = ocVar;
                super(null);
                this.currentAccount = ocVar.f5211c;
                return;
            default:
                this.f5529b = ocVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5528a) {
            case 0:
                return this.f5529b.f5207b;
            default:
                return this.f5529b.f5207b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f5528a) {
            case 0:
                return new ai.x3(7, this.f5529b.f5204a);
            default:
                return new ai.x3(8, this.f5529b.f5204a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5528a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.f5528a) {
            case 0:
                this.f5529b.T();
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5528a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
