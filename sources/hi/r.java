package hi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z4;
public final class r {
    public final RectF f14905a = new RectF();
    public final w5 f14906b;
    public final w5 f14907c;
    public final w5 d;
    public final w5 f14908e;
    public final z4 f14909f;
    public final z4 f14910g;
    public final w5 h;
    public final w5 f14911i;
    public final ic f14912j;
    public final Paint f14913k;
    public final i6 f14914l;
    public int f14915m;
    public final org.telegram.ui.Cells.y f14916n;
    public final cp f14917o;
    public final org.telegram.ui.Components.voip.n f14918p;

    public r(t tVar) {
        xq xqVar = xq.h;
        this.f14906b = new w5(tVar, 0L, 320L, xqVar);
        this.f14907c = new w5(tVar, 0L, 320L, xqVar);
        this.d = new w5(tVar, 0L, 320L, xqVar);
        this.f14908e = new w5(tVar, 0L, 320L, xqVar);
        this.f14909f = new z4(tVar, 320L, xqVar, 0);
        this.f14910g = new z4(tVar, 320L, xqVar, 0);
        this.h = new w5(tVar, 0L, 320L, xqVar);
        this.f14911i = new w5(tVar, 0L, 320L, xqVar);
        this.f14912j = new ic(tVar);
        this.f14913k = new Paint(1);
        i6 i6Var = new i6(true, false, true);
        this.f14914l = i6Var;
        org.telegram.ui.Cells.y a02 = l6.a0(0, 9, 9);
        this.f14916n = a02;
        cp cpVar = new cp(-1);
        this.f14917o = cpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f14918p = nVar;
        i6Var.f34587b = 17;
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.f22563q.x * 4;
        i6Var.q(true);
        i6Var.setCallback(tVar);
        cpVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.f39468l = true;
        nVar.f39469m = 2.0f;
    }
}
