package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.yc;
public final class v {
    public final RectF f8642a = new RectF();
    public final e6 f8643b;
    public final e6 f8644c;
    public final e6 d;
    public final e6 e;
    public final h5 f8645f;
    public final h5 f8646g;
    public final e6 h;
    public final e6 f8647i;
    public final yc f8648j;
    public final Paint f8649k;
    public final o6 f8650l;
    public int f8651m;
    public final org.telegram.ui.Cells.z f8652n;
    public final vp f8653o;
    public final org.telegram.ui.Components.voip.h f8654p;

    public v(x xVar) {
        sr srVar = sr.h;
        this.f8643b = new e6(xVar, 0L, 320L, srVar);
        this.f8644c = new e6(xVar, 0L, 320L, srVar);
        this.d = new e6(xVar, 0L, 320L, srVar);
        this.e = new e6(xVar, 0L, 320L, srVar);
        this.f8645f = new h5(xVar, 320L, srVar, 0);
        this.f8646g = new h5(xVar, 320L, srVar, 0);
        this.h = new e6(xVar, 0L, 320L, srVar);
        this.f8647i = new e6(xVar, 0L, 320L, srVar);
        this.f8648j = new yc(xVar);
        this.f8649k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.f8650l = o6Var;
        org.telegram.ui.Cells.z Y = i6.Y(0, 9, 9);
        this.f8652n = Y;
        vp vpVar = new vp(-1);
        this.f8653o = vpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8654p = hVar;
        o6Var.f26983b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(xVar);
        vpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f29315l = true;
        hVar.f29316m = 2.0f;
    }
}
