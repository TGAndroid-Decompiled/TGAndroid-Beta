package defpackage;

import android.content.DialogInterface;
public final class dv3 implements DialogInterface.OnShowListener {
    public final iv3 a;

    public dv3(iv3 iv3Var) {
        this.a = iv3Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        iv3 iv3Var = this.a;
        hyc hycVar = iv3Var.m1;
        if (iv3Var.I0() && hycVar.f()) {
            hycVar.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 2));
        }
    }
}
