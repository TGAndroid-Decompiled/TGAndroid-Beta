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
    public final RectF f8654a = new RectF();
    public final c6 f8655b;
    public final c6 f8656c;
    public final c6 d;
    public final c6 e;
    public final org.telegram.ui.Components.f5 f8657f;
    public final org.telegram.ui.Components.f5 f8658g;
    public final c6 h;
    public final c6 f8659i;
    public final wc f8660j;
    public final Paint f8661k;
    public final m6 f8662l;
    public int f8663m;
    public final org.telegram.ui.Cells.z f8664n;
    public final tp f8665o;
    public final org.telegram.ui.Components.voip.h f8666p;

    public v(x xVar) {
        qr qrVar = qr.h;
        this.f8655b = new c6(xVar, 0L, 320L, qrVar);
        this.f8656c = new c6(xVar, 0L, 320L, qrVar);
        this.d = new c6(xVar, 0L, 320L, qrVar);
        this.e = new c6(xVar, 0L, 320L, qrVar);
        this.f8657f = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.f8658g = new org.telegram.ui.Components.f5(xVar, 320L, qrVar, 0);
        this.h = new c6(xVar, 0L, 320L, qrVar);
        this.f8659i = new c6(xVar, 0L, 320L, qrVar);
        this.f8660j = new wc(xVar);
        this.f8661k = new Paint(1);
        m6 m6Var = new m6(true, false, true, false);
        this.f8662l = m6Var;
        org.telegram.ui.Cells.z Y = i6.Y(0, 9, 9);
        this.f8664n = Y;
        tp tpVar = new tp(-1);
        this.f8665o = tpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8666p = hVar;
        m6Var.f26085b = 17;
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.G = AndroidUtilities.displaySize.x * 4;
        m6Var.n(true);
        m6Var.setCallback(xVar);
        tpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f28967l = true;
        hVar.f28968m = 2.0f;
    }
}
