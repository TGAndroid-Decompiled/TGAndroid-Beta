package nh;

import android.app.Activity;
import android.app.Dialog;
public final class la extends org.telegram.ui.ActionBar.o2 {
    public final int f18055a;
    public final gb f18056b;

    public la(gb gbVar, int i10) {
        super(null);
        this.f18055a = i10;
        switch (i10) {
            case 1:
                this.f18056b = gbVar;
                super(null);
                this.currentAccount = gbVar.f17743c;
                return;
            default:
                this.f18056b = gbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f18055a) {
            case 0:
                return this.f18056b.f17739b;
            default:
                return this.f18056b.f17739b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.f18055a) {
            case 0:
                return new lh.l2(7, this.f18056b.f17736a);
            default:
                return new lh.l2(8, this.f18056b.f17736a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f18055a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.f18055a) {
            case 0:
                this.f18056b.T();
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f18055a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
