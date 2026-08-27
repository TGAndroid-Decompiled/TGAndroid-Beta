package lh;

import android.app.Activity;
import android.app.Dialog;

public final class xa extends org.telegram.ui.ActionBar.n2 {

    public final int f17054a;

    public final sb f17055b;

    public xa(sb sbVar, int i10) {
        super(null);
        this.f17054a = i10;
        switch (i10) {
            case 1:
                this.f17055b = sbVar;
                super(null);
                this.currentAccount = sbVar.f16749c;
                break;
            default:
                this.f17055b = sbVar;
                break;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f17054a) {
            case 0:
                break;
        }
        return this.f17055b.f16745b;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.f17054a) {
            case 0:
                return new jh.m2(7, this.f17055b.f16742a);
            default:
                return new jh.m2(8, this.f17055b.f16742a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f17054a) {
        }
        return false;
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f17054a) {
            case 0:
                this.f17055b.T();
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f17054a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
