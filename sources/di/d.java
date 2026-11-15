package di;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.xa1;
public final class d implements te.b, et0, gt0, org.telegram.ui.ActionBar.q1, x10 {
    public final t f8379a;

    public d(t tVar) {
        this.f8379a = tVar;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.f8379a.x0();
    }

    @Override
    public int b() {
        return this.f8379a.f9428n;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        t tVar = this.f8379a;
        tVar.getClass();
        tVar.presentFragment(new xa1(6, null));
    }

    @Override
    public float k(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.y0.c(recyclerView);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t.a0(this.f8379a, (b41) obj);
    }

    @Override
    public RecyclerView n(View view) {
        t tVar = this.f8379a;
        if (tVar.f9411a == 1) {
            return ((s) view).f9345c;
        }
        tVar.L.getClass();
        return ((ib) view).f8816a;
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.y0.b(recyclerView);
    }

    @Override
    public void E(float f10, int i7) {
    }
}
