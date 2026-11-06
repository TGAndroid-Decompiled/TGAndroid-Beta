package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.dt0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ya1;
public final class e implements te.b, dt0, ft0, org.telegram.ui.ActionBar.r1, a20 {
    public final z f3731a;

    public e(z zVar) {
        this.f3731a = zVar;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f3731a.x0();
    }

    @Override
    public int b() {
        return this.f3731a.f5125n;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        z zVar = this.f3731a;
        zVar.getClass();
        zVar.presentFragment(new ya1(6, null));
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        z.a0(this.f3731a, (r31) obj);
    }

    @Override
    public RecyclerView l(View view) {
        z zVar = this.f3731a;
        if (zVar.f5108a == 1) {
            return ((y) view).f5057c;
        }
        zVar.K.getClass();
        return ((ad) view).f3468a;
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override
    public void F(float f10, int i7) {
    }
}
