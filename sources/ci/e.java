package ci;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ra1;
public final class e implements qe.b, ct0, et0, org.telegram.ui.ActionBar.p1, s10 {
    public final v f4994a;

    public e(v vVar) {
        this.f4994a = vVar;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.f4994a.x0();
    }

    @Override
    public int c() {
        return this.f4994a.f6147n;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        v vVar = this.f4994a;
        vVar.getClass();
        vVar.presentFragment(new ra1(6, null));
    }

    @Override
    public float i(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        v.a0(this.f4994a, (r31) obj);
    }

    @Override
    public RecyclerView m(View view) {
        v vVar = this.f4994a;
        if (vVar.f6130a == 1) {
            return ((u) view).f6071c;
        }
        vVar.L.getClass();
        return ((tb) view).f6049a;
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override
    public void F(float f10, int i3) {
    }
}
