package di;

import android.app.Activity;
import android.app.Dialog;
public final class tb extends org.telegram.ui.ActionBar.n2 {
    public final int f8204a;
    public final pc f8205b;

    public tb(pc pcVar, int i10) {
        super(null);
        this.f8204a = i10;
        switch (i10) {
            case 1:
                this.f8205b = pcVar;
                super(null);
                this.currentAccount = pcVar.f7848c;
                return;
            default:
                this.f8205b = pcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f8204a) {
            case 0:
                return this.f8205b.f7844b;
            default:
                return this.f8205b.f7844b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f8204a) {
            case 0:
                return new bi.k3(7, this.f8205b.f7841a);
            default:
                return new bi.k3(8, this.f8205b.f7841a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f8204a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f8204a) {
            case 0:
                this.f8205b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f8204a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
