package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.yc;
public final class v {
    public final RectF f8657a = new RectF();
    public final d6 f8658b;
    public final d6 f8659c;
    public final d6 d;
    public final d6 e;
    public final g5 f8660f;
    public final g5 f8661g;
    public final d6 h;
    public final d6 f8662i;
    public final yc f8663j;
    public final Paint f8664k;
    public final n6 f8665l;
    public int f8666m;
    public final org.telegram.ui.Cells.z f8667n;
    public final tp f8668o;
    public final org.telegram.ui.Components.voip.h f8669p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.f8658b = new d6(xVar, 0L, 320L, qrVar);
        this.f8659c = new d6(xVar, 0L, 320L, qrVar);
        this.d = new d6(xVar, 0L, 320L, qrVar);
        this.e = new d6(xVar, 0L, 320L, qrVar);
        this.f8660f = new g5(xVar, 320L, qrVar, 0);
        this.f8661g = new g5(xVar, 320L, qrVar, 0);
        this.h = new d6(xVar, 0L, 320L, qrVar);
        this.f8662i = new d6(xVar, 0L, 320L, qrVar);
        this.f8663j = new yc(xVar);
        this.f8664k = new Paint(1);
        n6 n6Var = new n6(true, false, true, false);
        this.f8665l = n6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.f8667n = Y;
        tp tpVar = new tp(-1);
        this.f8668o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8669p = hVar;
        n6Var.f26575b = 17;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x * 4;
        n6Var.n(true);
        n6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f29373l = true;
        hVar.f29374m = 2.0f;
    }
}
