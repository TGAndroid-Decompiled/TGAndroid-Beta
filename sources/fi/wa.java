package fi;

import android.app.Activity;
import android.app.Dialog;
public final class wa extends org.telegram.ui.ActionBar.r2 {
    public final int f11947a;
    public final sb f11948b;

    public wa(sb sbVar, int i10) {
        super(null);
        this.f11947a = i10;
        switch (i10) {
            case 1:
                this.f11948b = sbVar;
                super(null);
                this.currentAccount = sbVar.f11612c;
                return;
            default:
                this.f11948b = sbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f11947a) {
            case 0:
                return this.f11948b.f11608b;
            default:
                return this.f11948b.f11608b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        switch (this.f11947a) {
            case 0:
                return new di.s2(7, this.f11948b.f11605a);
            default:
                return new di.s2(8, this.f11948b.f11605a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f11947a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        switch (this.f11947a) {
            case 0:
                this.f11948b.S();
                return false;
            default:
                return super.presentFragment(r2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f11947a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
