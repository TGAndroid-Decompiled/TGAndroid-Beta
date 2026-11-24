package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
public final class fs0 implements x74, zga, bha, ed, n8c {
    public final ss0 a;

    public fs0(ss0 ss0Var) {
        this.a = ss0Var;
    }

    @Override
    public final int b() {
        return this.a.n;
    }

    @Override
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override
    public final RecyclerView h(View view) {
        ss0 ss0Var = this.a;
        if (ss0Var.a) {
            return ((rs0) view).c;
        }
        ss0Var.L.getClass();
        return ((gva) view).a;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.u0((c4c) obj);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.a.x0();
    }

    @Override
    public final void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override
    public final void u(hd hdVar, int i) {
        ss0 ss0Var = this.a;
        ss0Var.getClass();
        ss0Var.presentFragment(new p3c(6, null));
    }

    @Override
    public final void F(float f, int i) {
    }
}
