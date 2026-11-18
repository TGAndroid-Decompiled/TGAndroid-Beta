package ki;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sp;
public final class s {
    public final RectF f18861a = new RectF();
    public final c6 f18862b;
    public final c6 f18863c;
    public final c6 d;
    public final c6 f18864e;
    public final f5 f18865f;
    public final f5 f18866g;
    public final c6 h;
    public final c6 f18867i;
    public final mc f18868j;
    public final Paint f18869k;
    public final m6 f18870l;
    public int f18871m;
    public final org.telegram.ui.Cells.y f18872n;
    public final sp f18873o;
    public final org.telegram.ui.Components.voip.n f18874p;

    public s(u uVar) {
        lr lrVar = lr.h;
        this.f18862b = new c6(uVar, 0L, 320L, lrVar);
        this.f18863c = new c6(uVar, 0L, 320L, lrVar);
        this.d = new c6(uVar, 0L, 320L, lrVar);
        this.f18864e = new c6(uVar, 0L, 320L, lrVar);
        this.f18865f = new f5(uVar, 320L, lrVar, 0);
        this.f18866g = new f5(uVar, 320L, lrVar, 0);
        this.h = new c6(uVar, 0L, 320L, lrVar);
        this.f18867i = new c6(uVar, 0L, 320L, lrVar);
        this.f18868j = new mc(uVar);
        this.f18869k = new Paint(1);
        m6 m6Var = new m6(true, false, true);
        this.f18870l = m6Var;
        org.telegram.ui.Cells.y a02 = n6.a0(0, 9, 9);
        this.f18872n = a02;
        sp spVar = new sp(-1);
        this.f18873o = spVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f18874p = nVar;
        m6Var.f37377b = 17;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.N = org.telegram.messenger.g0.f24118q.x * 4;
        m6Var.q(true);
        m6Var.setCallback(uVar);
        spVar.setCallback(uVar);
        a02.setCallback(uVar);
        nVar.f41055l = true;
        nVar.f41056m = 2.0f;
    }
}
