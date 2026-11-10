package hi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;
public final class r {
    public final RectF f14907a = new RectF();
    public final v5 f14908b;
    public final v5 f14909c;
    public final v5 d;
    public final v5 f14910e;
    public final y4 f14911f;
    public final y4 f14912g;
    public final v5 h;
    public final v5 f14913i;
    public final hc f14914j;
    public final Paint f14915k;
    public final h6 f14916l;
    public int f14917m;
    public final org.telegram.ui.Cells.y f14918n;
    public final cp f14919o;
    public final org.telegram.ui.Components.voip.n f14920p;

    public r(t tVar) {
        wq wqVar = wq.h;
        this.f14908b = new v5(tVar, 0L, 320L, wqVar);
        this.f14909c = new v5(tVar, 0L, 320L, wqVar);
        this.d = new v5(tVar, 0L, 320L, wqVar);
        this.f14910e = new v5(tVar, 0L, 320L, wqVar);
        this.f14911f = new y4(tVar, 320L, wqVar, 0);
        this.f14912g = new y4(tVar, 320L, wqVar, 0);
        this.h = new v5(tVar, 0L, 320L, wqVar);
        this.f14913i = new v5(tVar, 0L, 320L, wqVar);
        this.f14914j = new hc(tVar);
        this.f14915k = new Paint(1);
        h6 h6Var = new h6(true, false, true);
        this.f14916l = h6Var;
        org.telegram.ui.Cells.y a02 = m6.a0(0, 9, 9);
        this.f14918n = a02;
        cp cpVar = new cp(-1);
        this.f14919o = cpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f14920p = nVar;
        h6Var.f34187b = 17;
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.M = org.telegram.messenger.g0.f22567q.x * 4;
        h6Var.q(true);
        h6Var.setCallback(tVar);
        cpVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.f39388l = true;
        nVar.f39389m = 2.0f;
    }
}
