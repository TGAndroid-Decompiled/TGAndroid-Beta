package ki;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.rp;
public final class r {
    public final RectF f18948a = new RectF();
    public final c6 f18949b;
    public final c6 f18950c;
    public final c6 d;
    public final c6 f18951e;
    public final f5 f18952f;
    public final f5 f18953g;
    public final c6 h;
    public final c6 f18954i;
    public final lc f18955j;
    public final Paint f18956k;
    public final m6 f18957l;
    public int f18958m;
    public final org.telegram.ui.Cells.y f18959n;
    public final rp f18960o;
    public final org.telegram.ui.Components.voip.n f18961p;

    public r(t tVar) {
        kr krVar = kr.h;
        this.f18949b = new c6(tVar, 0L, 320L, krVar);
        this.f18950c = new c6(tVar, 0L, 320L, krVar);
        this.d = new c6(tVar, 0L, 320L, krVar);
        this.f18951e = new c6(tVar, 0L, 320L, krVar);
        this.f18952f = new f5(tVar, 320L, krVar, 0);
        this.f18953g = new f5(tVar, 320L, krVar, 0);
        this.h = new c6(tVar, 0L, 320L, krVar);
        this.f18954i = new c6(tVar, 0L, 320L, krVar);
        this.f18955j = new lc(tVar);
        this.f18956k = new Paint(1);
        m6 m6Var = new m6(true, false, true);
        this.f18957l = m6Var;
        org.telegram.ui.Cells.y a02 = n6.a0(0, 9, 9);
        this.f18959n = a02;
        rp rpVar = new rp(-1);
        this.f18960o = rpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f18961p = nVar;
        m6Var.f37394b = 17;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.N = org.telegram.messenger.g0.f24226q.x * 4;
        m6Var.q(true);
        m6Var.setCallback(tVar);
        rpVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.f41079l = true;
        nVar.f41080m = 2.0f;
    }
}
