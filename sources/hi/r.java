package hi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z4;
public final class r {
    public final RectF f14902a = new RectF();
    public final w5 f14903b;
    public final w5 f14904c;
    public final w5 d;
    public final w5 f14905e;
    public final z4 f14906f;
    public final z4 f14907g;
    public final w5 h;
    public final w5 f14908i;
    public final ic f14909j;
    public final Paint f14910k;
    public final i6 f14911l;
    public int f14912m;
    public final org.telegram.ui.Cells.y f14913n;
    public final cp f14914o;
    public final org.telegram.ui.Components.voip.n f14915p;

    public r(t tVar) {
        xq xqVar = xq.h;
        this.f14903b = new w5(tVar, 0L, 320L, xqVar);
        this.f14904c = new w5(tVar, 0L, 320L, xqVar);
        this.d = new w5(tVar, 0L, 320L, xqVar);
        this.f14905e = new w5(tVar, 0L, 320L, xqVar);
        this.f14906f = new z4(tVar, 320L, xqVar, 0);
        this.f14907g = new z4(tVar, 320L, xqVar, 0);
        this.h = new w5(tVar, 0L, 320L, xqVar);
        this.f14908i = new w5(tVar, 0L, 320L, xqVar);
        this.f14909j = new ic(tVar);
        this.f14910k = new Paint(1);
        i6 i6Var = new i6(true, false, true);
        this.f14911l = i6Var;
        org.telegram.ui.Cells.y a02 = k6.a0(0, 9, 9);
        this.f14913n = a02;
        cp cpVar = new cp(-1);
        this.f14914o = cpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f14915p = nVar;
        i6Var.f34508b = 17;
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.f22544q.x * 4;
        i6Var.q(true);
        i6Var.setCallback(tVar);
        cpVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.f39344l = true;
        nVar.f39345m = 2.0f;
    }
}
