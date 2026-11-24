package defpackage;

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.d;
public final class b9b extends d {
    public final byte a;
    public final v9b b;

    public b9b(v9b v9bVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = v9bVar;
                super(null);
                this.currentAccount = v9bVar.c;
                return;
            default:
                this.b = v9bVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                return v9bVar.b;
            default:
                return v9bVar.b;
        }
    }

    @Override
    public final ylb getResourceProvider() {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                return new pv0(v9bVar.a, (byte) 8);
            default:
                return new pv0(v9bVar.a, (byte) 9);
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
