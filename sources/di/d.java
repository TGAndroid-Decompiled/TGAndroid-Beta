package di;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.bb1;
public final class d implements te.b, pt0, rt0, org.telegram.ui.ActionBar.q1, w10 {
    public final t f8666a;

    public d(t tVar) {
        this.f8666a = tVar;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f8666a.y0();
    }

    @Override
    public int b() {
        return this.f8666a.f9786n;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        t tVar = this.f8666a;
        tVar.getClass();
        tVar.presentFragment(new bb1(6, null));
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t.a0(this.f8666a, (o41) obj);
    }

    @Override
    public RecyclerView n(View view) {
        t tVar = this.f8666a;
        if (tVar.f9769a == 1) {
            return ((s) view).f9715c;
        }
        tVar.L.getClass();
        return ((mb) view).f9361a;
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override
    public void D(float f10, int i7) {
    }
}
