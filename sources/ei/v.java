package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.yc;
public final class v {
    public final RectF f8640a = new RectF();
    public final e6 f8641b;
    public final e6 f8642c;
    public final e6 d;
    public final e6 e;
    public final h5 f8643f;
    public final h5 f8644g;
    public final e6 h;
    public final e6 f8645i;
    public final yc f8646j;
    public final Paint f8647k;
    public final o6 f8648l;
    public int f8649m;
    public final org.telegram.ui.Cells.z f8650n;
    public final up f8651o;
    public final org.telegram.ui.Components.voip.h f8652p;

    public v(x xVar) {
        rr rrVar = rr.h;
        this.f8641b = new e6(xVar, 0L, 320L, rrVar);
        this.f8642c = new e6(xVar, 0L, 320L, rrVar);
        this.d = new e6(xVar, 0L, 320L, rrVar);
        this.e = new e6(xVar, 0L, 320L, rrVar);
        this.f8643f = new h5(xVar, 320L, rrVar, 0);
        this.f8644g = new h5(xVar, 320L, rrVar, 0);
        this.h = new e6(xVar, 0L, 320L, rrVar);
        this.f8645i = new e6(xVar, 0L, 320L, rrVar);
        this.f8646j = new yc(xVar);
        this.f8647k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.f8648l = o6Var;
        org.telegram.ui.Cells.z Y = h6.Y(0, 9, 9);
        this.f8650n = Y;
        up upVar = new up(-1);
        this.f8651o = upVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8652p = hVar;
        o6Var.f26614b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(xVar);
        upVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f28941l = true;
        hVar.f28942m = 2.0f;
    }
}
