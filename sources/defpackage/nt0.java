package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
public final class nt0 implements g94, bja, dja, ee, oac {
    public final au0 a;

    public nt0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.y0();
    }

    @Override
    public final int b() {
        return this.a.n;
    }

    @Override
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override
    public final RecyclerView h(View view) {
        au0 au0Var = this.a;
        if (au0Var.a) {
            return ((zt0) view).c;
        }
        au0Var.L.getClass();
        return ((kxa) view).a;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.v0((c6c) obj);
    }

    @Override
    public final void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override
    public final void r(he heVar, int i) {
        au0 au0Var = this.a;
        au0Var.getClass();
        au0Var.presentFragment(new p5c(6, null));
    }

    @Override
    public final void V(float f, int i) {
    }
}
