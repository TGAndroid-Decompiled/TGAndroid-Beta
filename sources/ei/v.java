package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.yc;
public final class v {
    public final RectF f8656a = new RectF();
    public final e6 f8657b;
    public final e6 f8658c;
    public final e6 d;
    public final e6 e;
    public final h5 f8659f;
    public final h5 f8660g;
    public final e6 h;
    public final e6 f8661i;
    public final yc f8662j;
    public final Paint f8663k;
    public final o6 f8664l;
    public int f8665m;
    public final org.telegram.ui.Cells.z f8666n;
    public final tp f8667o;
    public final org.telegram.ui.Components.voip.h f8668p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.f8657b = new e6(xVar, 0L, 320L, qrVar);
        this.f8658c = new e6(xVar, 0L, 320L, qrVar);
        this.d = new e6(xVar, 0L, 320L, qrVar);
        this.e = new e6(xVar, 0L, 320L, qrVar);
        this.f8659f = new h5(xVar, 320L, qrVar, 0);
        this.f8660g = new h5(xVar, 320L, qrVar, 0);
        this.h = new e6(xVar, 0L, 320L, qrVar);
        this.f8661i = new e6(xVar, 0L, 320L, qrVar);
        this.f8662j = new yc(xVar);
        this.f8663k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.f8664l = o6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.f8666n = Y;
        tp tpVar = new tp(-1);
        this.f8667o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8668p = hVar;
        o6Var.f26868b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f29266l = true;
        hVar.f29267m = 2.0f;
    }
}
