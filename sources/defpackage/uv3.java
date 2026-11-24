package defpackage;

import android.content.DialogInterface;
public final class uv3 implements DialogInterface.OnShowListener {
    public final zv3 a;

    public uv3(zv3 zv3Var) {
        this.a = zv3Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        zv3 zv3Var = this.a;
        tvc tvcVar = zv3Var.m1;
        if (zv3Var.H0() && tvcVar.f()) {
            tvcVar.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 2));
        }
    }
}
