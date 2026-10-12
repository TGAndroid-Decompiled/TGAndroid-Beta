package di;

import android.app.Activity;
import android.app.Dialog;
public final class ob extends org.telegram.ui.ActionBar.m2 {
    public final int f7570a;
    public final kc f7571b;

    public ob(kc kcVar, int i10) {
        super(null);
        this.f7570a = i10;
        switch (i10) {
            case 1:
                this.f7571b = kcVar;
                super(null);
                this.currentAccount = kcVar.f7241c;
                return;
            default:
                this.f7571b = kcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f7570a) {
            case 0:
                return this.f7571b.f7237b;
            default:
                return this.f7571b.f7237b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.f7570a) {
            case 0:
                return new bi.n3(7, this.f7571b.f7234a);
            default:
                return new bi.n3(8, this.f7571b.f7234a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f7570a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        switch (this.f7570a) {
            case 0:
                this.f7571b.S();
                return false;
            default:
                return super.presentFragment(m2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f7570a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
