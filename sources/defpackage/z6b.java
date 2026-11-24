package defpackage;

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.d;
public final class z6b extends d {
    public final byte a;
    public final t7b b;

    public z6b(t7b t7bVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = t7bVar;
                super(null);
                this.currentAccount = t7bVar.c;
                return;
            default:
                this.b = t7bVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                return t7bVar.b;
            default:
                return t7bVar.b;
        }
    }

    @Override
    public final wjb getResourceProvider() {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                return new gu0(t7bVar.a, (byte) 8);
            default:
                return new gu0(t7bVar.a, (byte) 9);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        byte b = this.a;
        return false;
    }

    @Override
    public final boolean presentFragment(d dVar) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(dVar);
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
