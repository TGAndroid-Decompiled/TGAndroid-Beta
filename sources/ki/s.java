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
    public final RectF f18864a = new RectF();
    public final c6 f18865b;
    public final c6 f18866c;
    public final c6 d;
    public final c6 f18867e;
    public final f5 f18868f;
    public final f5 f18869g;
    public final c6 h;
    public final c6 f18870i;
    public final mc f18871j;
    public final Paint f18872k;
    public final m6 f18873l;
    public int f18874m;
    public final org.telegram.ui.Cells.y f18875n;
    public final sp f18876o;
    public final org.telegram.ui.Components.voip.n f18877p;

    public s(u uVar) {
        lr lrVar = lr.h;
        this.f18865b = new c6(uVar, 0L, 320L, lrVar);
        this.f18866c = new c6(uVar, 0L, 320L, lrVar);
        this.d = new c6(uVar, 0L, 320L, lrVar);
        this.f18867e = new c6(uVar, 0L, 320L, lrVar);
        this.f18868f = new f5(uVar, 320L, lrVar, 0);
        this.f18869g = new f5(uVar, 320L, lrVar, 0);
        this.h = new c6(uVar, 0L, 320L, lrVar);
        this.f18870i = new c6(uVar, 0L, 320L, lrVar);
        this.f18871j = new mc(uVar);
        this.f18872k = new Paint(1);
        m6 m6Var = new m6(true, false, true);
        this.f18873l = m6Var;
        org.telegram.ui.Cells.y a02 = n6.a0(0, 9, 9);
        this.f18875n = a02;
        sp spVar = new sp(-1);
        this.f18876o = spVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f18877p = nVar;
        m6Var.f37377b = 17;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.N = org.telegram.messenger.g0.f24121q.x * 4;
        m6Var.q(true);
        m6Var.setCallback(uVar);
        spVar.setCallback(uVar);
        a02.setCallback(uVar);
        nVar.f41055l = true;
        nVar.f41056m = 2.0f;
    }
}
