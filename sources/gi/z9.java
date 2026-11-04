package gi;

import android.app.Activity;
import android.app.Dialog;
public final class z9 extends org.telegram.ui.ActionBar.d2 {
    public final int f14056a;
    public final va f14057b;

    public z9(va vaVar, int i3) {
        super(null);
        this.f14056a = i3;
        switch (i3) {
            case 1:
                this.f14057b = vaVar;
                super(null);
                this.currentAccount = vaVar.f13706c;
                return;
            default:
                this.f14057b = vaVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f14056a) {
            case 0:
                return this.f14057b.f13702b;
            default:
                return this.f14057b.f13702b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.f14056a) {
            case 0:
                return new ei.q2(7, this.f14057b.f13698a);
            default:
                return new ei.q2(8, this.f14057b.f13698a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f14056a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        switch (this.f14056a) {
            case 0:
                this.f14057b.S();
                return false;
            default:
                return super.presentFragment(d2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f14056a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
