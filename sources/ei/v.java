package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wc;
public final class v {
    public final RectF f8652a = new RectF();
    public final c6 f8653b;
    public final c6 f8654c;
    public final c6 d;
    public final c6 e;
    public final org.telegram.ui.Components.f5 f8655f;
    public final org.telegram.ui.Components.f5 f8656g;
    public final c6 h;
    public final c6 f8657i;
    public final wc f8658j;
    public final Paint f8659k;
    public final m6 f8660l;
    public int f8661m;
    public final org.telegram.ui.Cells.z f8662n;
    public final tp f8663o;
    public final org.telegram.ui.Components.voip.h f8664p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.f8653b = new c6(xVar, 0L, 320L, qrVar);
        this.f8654c = new c6(xVar, 0L, 320L, qrVar);
        this.d = new c6(xVar, 0L, 320L, qrVar);
        this.e = new c6(xVar, 0L, 320L, qrVar);
        this.f8655f = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.f8656g = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.h = new c6(xVar, 0L, 320L, qrVar);
        this.f8657i = new c6(xVar, 0L, 320L, qrVar);
        this.f8658j = new wc(xVar);
        this.f8659k = new Paint(1);
        m6 m6Var = new m6(true, false, true, false);
        this.f8660l = m6Var;
        org.telegram.ui.Cells.z Y = i6.Y(0, 9, 9);
        this.f8662n = Y;
        tp tpVar = new tp(-1);
        this.f8663o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8664p = hVar;
        m6Var.f26086b = 17;
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.G = AndroidUtilities.displaySize.x * 4;
        m6Var.n(true);
        m6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f28970l = true;
        hVar.f28971m = 2.0f;
    }
}
