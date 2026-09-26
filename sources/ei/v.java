package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.yc;
public final class v {
    public final RectF f8639a = new RectF();
    public final e6 f8640b;
    public final e6 f8641c;
    public final e6 d;
    public final e6 e;
    public final h5 f8642f;
    public final h5 f8643g;
    public final e6 h;
    public final e6 f8644i;
    public final yc f8645j;
    public final Paint f8646k;
    public final o6 f8647l;
    public int f8648m;
    public final org.telegram.ui.Cells.z f8649n;
    public final vp f8650o;
    public final org.telegram.ui.Components.voip.h f8651p;

    public v(x xVar) {
        sr srVar = sr.h;
        this.f8640b = new e6(xVar, 0L, 320L, srVar);
        this.f8641c = new e6(xVar, 0L, 320L, srVar);
        this.d = new e6(xVar, 0L, 320L, srVar);
        this.e = new e6(xVar, 0L, 320L, srVar);
        this.f8642f = new h5(xVar, 320L, srVar, 0);
        this.f8643g = new h5(xVar, 320L, srVar, 0);
        this.h = new e6(xVar, 0L, 320L, srVar);
        this.f8644i = new e6(xVar, 0L, 320L, srVar);
        this.f8645j = new yc(xVar);
        this.f8646k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.f8647l = o6Var;
        org.telegram.ui.Cells.z Y = h6.Y(0, 9, 9);
        this.f8649n = Y;
        vp vpVar = new vp(-1);
        this.f8650o = vpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8651p = hVar;
        o6Var.f26962b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(xVar);
        vpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f29289l = true;
        hVar.f29290m = 2.0f;
    }
}
