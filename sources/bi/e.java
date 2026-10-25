package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.dg1;
public final class e implements oe.d, hw0, jw0, org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final y f4536a;

    public e(y yVar) {
        this.f4536a = yVar;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.f4536a.t0();
    }

    @Override
    public float b(RecyclerView recyclerView) {
        return b10.c(recyclerView);
    }

    @Override
    public int c() {
        return this.f4536a.f5730n;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        y yVar = this.f4536a;
        yVar.getClass();
        yVar.presentFragment(new dg1(6, null));
    }

    @Override
    public RecyclerView i(View view) {
        y yVar = this.f4536a;
        if (yVar.f5714a == 1) {
            return ((x) view).f5636c;
        }
        yVar.K.getClass();
        return ((ad) view).f4289a;
    }

    @Override
    public void n(RecyclerView recyclerView) {
        b10.b(recyclerView);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f4536a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y.W(this.f4536a, (t61) obj);
    }

    @Override
    public void z(float f7, int i10) {
    }
}
