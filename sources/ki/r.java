package ki;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.up;
public final class r {
    public final RectF f18874a = new RectF();
    public final d6 f18875b;
    public final d6 f18876c;
    public final d6 d;
    public final d6 f18877e;
    public final g5 f18878f;
    public final g5 f18879g;
    public final d6 h;
    public final d6 f18880i;
    public final mc f18881j;
    public final Paint f18882k;
    public final n6 f18883l;
    public int f18884m;
    public final org.telegram.ui.Cells.y f18885n;
    public final up f18886o;
    public final org.telegram.ui.Components.voip.n f18887p;

    public r(t tVar) {
        nr nrVar = nr.h;
        this.f18875b = new d6(tVar, 0L, 320L, nrVar);
        this.f18876c = new d6(tVar, 0L, 320L, nrVar);
        this.d = new d6(tVar, 0L, 320L, nrVar);
        this.f18877e = new d6(tVar, 0L, 320L, nrVar);
        this.f18878f = new g5(tVar, 320L, nrVar, 0);
        this.f18879g = new g5(tVar, 320L, nrVar, 0);
        this.h = new d6(tVar, 0L, 320L, nrVar);
        this.f18880i = new d6(tVar, 0L, 320L, nrVar);
        this.f18881j = new mc(tVar);
        this.f18882k = new Paint(1);
        n6 n6Var = new n6(true, false, true);
        this.f18883l = n6Var;
        org.telegram.ui.Cells.y a02 = m6.a0(0, 9, 9);
        this.f18885n = a02;
        up upVar = new up(-1);
        this.f18886o = upVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f18887p = nVar;
        n6Var.f37795b = 17;
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.N = org.telegram.messenger.g0.f24046q.x * 4;
        n6Var.q(true);
        n6Var.setCallback(tVar);
        upVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.f41191l = true;
        nVar.f41192m = 2.0f;
    }
}
