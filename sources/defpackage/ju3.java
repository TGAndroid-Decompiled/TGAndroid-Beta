package defpackage;

import android.content.DialogInterface;
public final class ju3 implements DialogInterface.OnShowListener {
    public final ou3 a;

    public ju3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ou3 ou3Var = this.a;
        stc stcVar = ou3Var.m1;
        if (ou3Var.H0() && stcVar.f()) {
            stcVar.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 2));
        }
    }
}
