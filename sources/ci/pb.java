package ci;

import android.app.Activity;
import android.app.Dialog;
public final class pb extends org.telegram.ui.ActionBar.m2 {
    public final int f5317a;
    public final lc f5318b;

    public pb(lc lcVar, int i10) {
        super(null);
        this.f5317a = i10;
        switch (i10) {
            case 1:
                this.f5318b = lcVar;
                super(null);
                this.currentAccount = lcVar.f5040c;
                return;
            default:
                this.f5318b = lcVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f5317a) {
            case 0:
                return this.f5318b.f5036b;
            default:
                return this.f5318b.f5036b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        switch (this.f5317a) {
            case 0:
                return new ai.x3(7, this.f5318b.f5033a);
            default:
                return new ai.x3(8, this.f5318b.f5033a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f5317a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        switch (this.f5317a) {
            case 0:
                this.f5318b.T();
                return false;
            default:
                return super.presentFragment(m2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5317a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
