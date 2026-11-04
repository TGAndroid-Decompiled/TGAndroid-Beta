package ii;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xq;
public final class t {
    public final RectF f15221a = new RectF();
    public final u5 f15222b;
    public final u5 f15223c;
    public final u5 d;
    public final u5 f15224e;
    public final x4 f15225f;
    public final x4 f15226g;
    public final u5 h;
    public final u5 f15227i;
    public final gc f15228j;
    public final Paint f15229k;
    public final g6 f15230l;
    public int f15231m;
    public final org.telegram.ui.Cells.y f15232n;
    public final cp f15233o;
    public final org.telegram.ui.Components.voip.g f15234p;

    public t(v vVar) {
        xq xqVar = xq.h;
        this.f15222b = new u5(vVar, 0L, 320L, xqVar);
        this.f15223c = new u5(vVar, 0L, 320L, xqVar);
        this.d = new u5(vVar, 0L, 320L, xqVar);
        this.f15224e = new u5(vVar, 0L, 320L, xqVar);
        this.f15225f = new x4(vVar, 320L, xqVar, 0);
        this.f15226g = new x4(vVar, 320L, xqVar, 0);
        this.h = new u5(vVar, 0L, 320L, xqVar);
        this.f15227i = new u5(vVar, 0L, 320L, xqVar);
        this.f15228j = new gc(vVar);
        this.f15229k = new Paint(1);
        g6 g6Var = new g6(true, false, true);
        this.f15230l = g6Var;
        org.telegram.ui.Cells.y a02 = k6.a0(0, 9, 9);
        this.f15232n = a02;
        cp cpVar = new cp(-1);
        this.f15233o = cpVar;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f15234p = gVar;
        g6Var.f33983b = 17;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.M = org.telegram.messenger.g0.f22608q.x * 4;
        g6Var.q(true);
        g6Var.setCallback(vVar);
        cpVar.setCallback(vVar);
        a02.setCallback(vVar);
        gVar.f39354l = true;
        gVar.f39355m = 2.0f;
    }
}
