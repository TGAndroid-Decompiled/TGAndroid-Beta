package di;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.za1;
public final class d implements te.b, ot0, qt0, org.telegram.ui.ActionBar.q1, u10 {
    public final t f8627a;

    public d(t tVar) {
        this.f8627a = tVar;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.f8627a.y0();
    }

    @Override
    public int b() {
        return this.f8627a.f9747n;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        t tVar = this.f8627a;
        tVar.getClass();
        tVar.presentFragment(new za1(6, null));
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t.a0(this.f8627a, (n41) obj);
    }

    @Override
    public RecyclerView l(View view) {
        t tVar = this.f8627a;
        if (tVar.f9730a == 1) {
            return ((s) view).f9676c;
        }
        tVar.L.getClass();
        return ((mb) view).f9322a;
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override
    public void G(float f10, int i7) {
    }
}
