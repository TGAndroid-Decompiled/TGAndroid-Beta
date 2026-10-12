package ci;

import android.app.Activity;
import android.app.Dialog;
public final class pb extends org.telegram.ui.ActionBar.m2 {
    public final int f5739a;
    public final lc f5740b;

    public pb(lc lcVar, int i10) {
        super(null);
        this.f5739a = i10;
        switch (i10) {
            case 1:
                this.f5740b = lcVar;
                super(null);
                this.currentAccount = lcVar.f5463c;
                return;
            default:
                this.f5740b = lcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5739a) {
            case 0:
                return this.f5740b.f5459b;
            default:
                return this.f5740b.f5459b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.f5739a) {
            case 0:
                return new ai.y3(7, this.f5740b.f5456a);
            default:
                return new ai.y3(8, this.f5740b.f5456a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5739a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        switch (this.f5739a) {
            case 0:
                this.f5740b.S();
                return false;
            default:
                return super.presentFragment(m2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5739a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
