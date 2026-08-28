package kh;

import android.app.Activity;
import android.app.Dialog;
public final class ab extends org.telegram.ui.ActionBar.o2 {
    public final int f14970a;
    public final wb f14971b;

    public ab(wb wbVar, int i9) {
        super(null);
        this.f14970a = i9;
        switch (i9) {
            case 1:
                this.f14971b = wbVar;
                super(null);
                this.currentAccount = wbVar.f16253c;
                return;
            default:
                this.f14971b = wbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f14970a) {
            case 0:
                return this.f14971b.f16249b;
            default:
                return this.f14971b.f16249b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        switch (this.f14970a) {
            case 0:
                return new ih.n2(7, this.f14971b.f16246a);
            default:
                return new ih.n2(8, this.f14971b.f16246a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f14970a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.f14970a) {
            case 0:
                this.f14971b.T();
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f14970a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
