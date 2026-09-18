package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wc;
public final class v {
    public final RectF f8657a = new RectF();
    public final c6 f8658b;
    public final c6 f8659c;
    public final c6 d;
    public final c6 e;
    public final org.telegram.ui.Components.f5 f8660f;
    public final org.telegram.ui.Components.f5 f8661g;
    public final c6 h;
    public final c6 f8662i;
    public final wc f8663j;
    public final Paint f8664k;
    public final m6 f8665l;
    public int f8666m;
    public final org.telegram.ui.Cells.z f8667n;
    public final tp f8668o;
    public final org.telegram.ui.Components.voip.h f8669p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.f8658b = new c6(xVar, 0L, 320L, qrVar);
        this.f8659c = new c6(xVar, 0L, 320L, qrVar);
        this.d = new c6(xVar, 0L, 320L, qrVar);
        this.e = new c6(xVar, 0L, 320L, qrVar);
        this.f8660f = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.f8661g = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.h = new c6(xVar, 0L, 320L, qrVar);
        this.f8662i = new c6(xVar, 0L, 320L, qrVar);
        this.f8663j = new wc(xVar);
        this.f8664k = new Paint(1);
        m6 m6Var = new m6(true, false, true, false);
        this.f8665l = m6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.f8667n = Y;
        tp tpVar = new tp(-1);
        this.f8668o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8669p = hVar;
        m6Var.f26070b = 17;
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.G = AndroidUtilities.displaySize.x * 4;
        m6Var.n(true);
        m6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f28950l = true;
        hVar.f28951m = 2.0f;
    }
}
