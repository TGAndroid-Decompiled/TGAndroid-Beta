package defpackage;

import android.view.View;
public final class tm0 implements fd, nr7, sy4 {
    public final nx0 a;

    public tm0(nx0 nx0Var) {
        this.a = nx0Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        return this.a.Y(l2dVar);
    }

    @Override
    public final int h() {
        return aob.v0(aob.h5, this.a.J0);
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.dismiss();
        bx4.g1(false, null);
    }
}
