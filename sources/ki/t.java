package ki;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;
public final class t {
    public final RectF f18551a = new RectF();
    public final u5 f18552b;
    public final u5 f18553c;
    public final u5 d;
    public final u5 f18554e;
    public final x4 f18555f;
    public final x4 f18556g;
    public final u5 h;
    public final u5 f18557i;
    public final dc f18558j;
    public final Paint f18559k;
    public final g6 f18560l;
    public int f18561m;
    public final org.telegram.ui.Cells.y f18562n;
    public final lp f18563o;
    public final org.telegram.ui.Components.voip.n f18564p;

    public t(v vVar) {
        er erVar = er.h;
        this.f18552b = new u5(vVar, 0L, 320L, erVar);
        this.f18553c = new u5(vVar, 0L, 320L, erVar);
        this.d = new u5(vVar, 0L, 320L, erVar);
        this.f18554e = new u5(vVar, 0L, 320L, erVar);
        this.f18555f = new x4(vVar, 320L, erVar, 0);
        this.f18556g = new x4(vVar, 320L, erVar, 0);
        this.h = new u5(vVar, 0L, 320L, erVar);
        this.f18557i = new u5(vVar, 0L, 320L, erVar);
        this.f18558j = new dc(vVar);
        this.f18559k = new Paint(1);
        g6 g6Var = new g6(true, false, true);
        this.f18560l = g6Var;
        org.telegram.ui.Cells.y a02 = j6.a0(0, 9, 9);
        this.f18562n = a02;
        lp lpVar = new lp(-1);
        this.f18563o = lpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f18564p = nVar;
        g6Var.f34833b = 17;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.N = org.telegram.messenger.g0.f23611q.x * 4;
        g6Var.q(true);
        g6Var.setCallback(vVar);
        lpVar.setCallback(vVar);
        a02.setCallback(vVar);
        nVar.f40803l = true;
        nVar.f40804m = 2.0f;
    }
}
