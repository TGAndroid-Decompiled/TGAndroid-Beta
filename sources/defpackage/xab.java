package defpackage;

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.e;
public final class xab extends e {
    public final byte a;
    public final rbb b;

    public xab(rbb rbbVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = rbbVar;
                super(null);
                this.currentAccount = rbbVar.c;
                return;
            default:
                this.b = rbbVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                return rbbVar.b;
            default:
                return rbbVar.b;
        }
    }

    @Override
    public final vnb getResourceProvider() {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                return new pu0(rbbVar.a, (byte) 8);
            default:
                return new pu0(rbbVar.a, (byte) 9);
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
