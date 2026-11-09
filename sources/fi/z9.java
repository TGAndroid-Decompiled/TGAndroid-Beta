package fi;

import android.app.Activity;
import android.app.Dialog;
public final class z9 extends org.telegram.ui.ActionBar.f2 {
    public final int f13256a;
    public final va f13257b;

    public z9(va vaVar, int i7) {
        super(null);
        this.f13256a = i7;
        switch (i7) {
            case 1:
                this.f13257b = vaVar;
                super(null);
                this.currentAccount = vaVar.f12942c;
                return;
            default:
                this.f13257b = vaVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f13256a) {
            case 0:
                return this.f13257b.f12938b;
            default:
                return this.f13257b.f12938b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.f13256a) {
            case 0:
                return new di.m2(7, this.f13257b.f12934a);
            default:
                return new di.m2(8, this.f13257b.f12934a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f13256a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        switch (this.f13256a) {
            case 0:
                this.f13257b.S();
                return false;
            default:
                return super.presentFragment(f2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f13256a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
