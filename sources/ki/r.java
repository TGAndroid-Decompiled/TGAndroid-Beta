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
    public final RectF f18840a = new RectF();
    public final d6 f18841b;
    public final d6 f18842c;
    public final d6 d;
    public final d6 f18843e;
    public final g5 f18844f;
    public final g5 f18845g;
    public final d6 h;
    public final d6 f18846i;
    public final mc f18847j;
    public final Paint f18848k;
    public final n6 f18849l;
    public int f18850m;
    public final org.telegram.ui.Cells.y f18851n;
    public final up f18852o;
    public final org.telegram.ui.Components.voip.n f18853p;

    public r(t tVar) {
        nr nrVar = nr.h;
        this.f18841b = new d6(tVar, 0L, 320L, nrVar);
        this.f18842c = new d6(tVar, 0L, 320L, nrVar);
        this.d = new d6(tVar, 0L, 320L, nrVar);
        this.f18843e = new d6(tVar, 0L, 320L, nrVar);
        this.f18844f = new g5(tVar, 320L, nrVar, 0);
        this.f18845g = new g5(tVar, 320L, nrVar, 0);
        this.h = new d6(tVar, 0L, 320L, nrVar);
        this.f18846i = new d6(tVar, 0L, 320L, nrVar);
        this.f18847j = new mc(tVar);
        this.f18848k = new Paint(1);
        n6 n6Var = new n6(true, false, true);
        this.f18849l = n6Var;
        org.telegram.ui.Cells.y a02 = m6.a0(0, 9, 9);
        this.f18851n = a02;
        up upVar = new up(-1);
        this.f18852o = upVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f18853p = nVar;
        n6Var.f37751b = 17;
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.N = org.telegram.messenger.g0.f24010q.x * 4;
        n6Var.q(true);
        n6Var.setCallback(tVar);
        upVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.f41153l = true;
        nVar.f41154m = 2.0f;
    }
}
