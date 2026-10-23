package ei;

import android.app.Activity;
import android.app.Dialog;
public final class za extends org.telegram.ui.ActionBar.o2 {
    public final int f10264a;
    public final vb f10265b;

    public za(vb vbVar, int i10) {
        super(null);
        this.f10264a = i10;
        switch (i10) {
            case 1:
                this.f10265b = vbVar;
                super(null);
                this.currentAccount = vbVar.f9971c;
                return;
            default:
                this.f10265b = vbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f10264a) {
            case 0:
                return this.f10265b.f9967b;
            default:
                return this.f10265b.f9967b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.f10264a) {
            case 0:
                return new ci.s2(7, this.f10265b.f9964a);
            default:
                return new ci.s2(8, this.f10265b.f9964a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f10264a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.f10264a) {
            case 0:
                this.f10265b.S();
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f10264a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
