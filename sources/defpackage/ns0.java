package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
public final class ns0 implements s84, ska, uka, fd, ncc {
    public final at0 a;

    public ns0(at0 at0Var) {
        this.a = at0Var;
    }

    @Override
    public final float b(RecyclerView recyclerView) {
        return wka.j(recyclerView);
    }

    @Override
    public final int c() {
        return this.a.n;
    }

    @Override
    public final RecyclerView h(View view) {
        at0 at0Var = this.a;
        if (at0Var.a) {
            return ((zs0) view).c;
        }
        at0Var.L.getClass();
        return ((kza) view).a;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.u0((b8c) obj);
    }

    @Override
    public final void o(RecyclerView recyclerView) {
        uh9.d(recyclerView);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.a.y0();
    }

    @Override
    public final void w(id idVar, int i) {
        at0 at0Var = this.a;
        at0Var.getClass();
        at0Var.presentFragment(new o7c(6, null));
    }

    @Override
    public final void v0(float f, int i) {
    }
}
