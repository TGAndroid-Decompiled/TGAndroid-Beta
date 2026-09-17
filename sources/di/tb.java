package di;

import android.app.Activity;
import android.app.Dialog;
public final class tb extends org.telegram.ui.ActionBar.n2 {
    public final int f8232a;
    public final pc f8233b;

    public tb(pc pcVar, int i10) {
        super(null);
        this.f8232a = i10;
        switch (i10) {
            case 1:
                this.f8233b = pcVar;
                super(null);
                this.currentAccount = pcVar.f7876c;
                return;
            default:
                this.f8233b = pcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f8232a) {
            case 0:
                return this.f8233b.f7872b;
            default:
                return this.f8233b.f7872b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f8232a) {
            case 0:
                return new bi.k3(7, this.f8233b.f7869a);
            default:
                return new bi.k3(8, this.f8233b.f7869a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f8232a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f8232a) {
            case 0:
                this.f8233b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f8232a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
