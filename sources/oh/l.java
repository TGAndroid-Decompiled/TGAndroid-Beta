package oh;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.hx;
public final class l extends cg.c {
    public final boolean d;
    public final hx f17386e;

    public l(hx hxVar, boolean z4) {
        this.f17386e = hxVar;
        this.d = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList;
        boolean z4 = this.d;
        hx hxVar = this.f17386e;
        if (z4) {
            arrayList = hxVar.f17607y;
        } else {
            arrayList = hxVar.f17605x;
        }
        return arrayList.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        o oVar = (o) m1Var.f5875a;
        oVar.f17517b = i10;
        boolean z4 = this.d;
        hx hxVar = this.f17386e;
        if (z4) {
            oVar.setDialogId(((m) hxVar.f17607y.get(i10)).f17422c);
        } else {
            oVar.setDialogId(((m) hxVar.f17605x.get(i10)).f17422c);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        o oVar = new o(this.f17386e, viewGroup.getContext());
        boolean z4 = this.d;
        oVar.K = z4;
        if (z4) {
            oVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new f2.m1(oVar);
    }
}
