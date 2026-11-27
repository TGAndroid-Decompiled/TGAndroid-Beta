package defpackage;

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.e;
public final class yab extends e {
    public final byte a;
    public final sbb b;

    public yab(sbb sbbVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = sbbVar;
                super(null);
                this.currentAccount = sbbVar.c;
                return;
            default:
                this.b = sbbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                return sbbVar.b;
            default:
                return sbbVar.b;
        }
    }

    @Override
    public final vnb getResourceProvider() {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                return new pu0(sbbVar.a, (byte) 8);
            default:
                return new pu0(sbbVar.a, (byte) 9);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        byte b = this.a;
        return false;
    }

    @Override
    public final boolean presentFragment(e eVar) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(eVar);
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
