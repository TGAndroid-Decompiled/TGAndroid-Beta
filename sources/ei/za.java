package ei;

import android.app.Activity;
import android.app.Dialog;
public final class za extends org.telegram.ui.ActionBar.n2 {
    public final int f10247a;
    public final vb f10248b;

    public za(vb vbVar, int i10) {
        super(null);
        this.f10247a = i10;
        switch (i10) {
            case 1:
                this.f10248b = vbVar;
                super(null);
                this.currentAccount = vbVar.f9954c;
                return;
            default:
                this.f10248b = vbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f10247a) {
            case 0:
                return this.f10248b.f9950b;
            default:
                return this.f10248b.f9950b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        switch (this.f10247a) {
            case 0:
                return new ci.t2(7, this.f10248b.f9947a);
            default:
                return new ci.t2(8, this.f10248b.f9947a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f10247a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f10247a) {
            case 0:
                this.f10248b.S();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f10247a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
