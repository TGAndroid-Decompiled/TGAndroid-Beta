package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zc;
public final class v {
    public final RectF f8651a = new RectF();
    public final e6 f8652b;
    public final e6 f8653c;
    public final e6 d;
    public final e6 e;
    public final h5 f8654f;
    public final h5 f8655g;
    public final e6 h;
    public final e6 f8656i;
    public final zc f8657j;
    public final Paint f8658k;
    public final o6 f8659l;
    public int f8660m;
    public final org.telegram.ui.Cells.z f8661n;
    public final wp f8662o;
    public final org.telegram.ui.Components.voip.h f8663p;

    public v(x xVar) {
        tr trVar = tr.h;
        this.f8652b = new e6(xVar, 0L, 320L, trVar);
        this.f8653c = new e6(xVar, 0L, 320L, trVar);
        this.d = new e6(xVar, 0L, 320L, trVar);
        this.e = new e6(xVar, 0L, 320L, trVar);
        this.f8654f = new h5(xVar, 320L, trVar, 0);
        this.f8655g = new h5(xVar, 320L, trVar, 0);
        this.h = new e6(xVar, 0L, 320L, trVar);
        this.f8656i = new e6(xVar, 0L, 320L, trVar);
        this.f8657j = new zc(xVar);
        this.f8658k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.f8659l = o6Var;
        org.telegram.ui.Cells.z Y = h6.Y(0, 9, 9);
        this.f8661n = Y;
        wp wpVar = new wp(-1);
        this.f8662o = wpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8663p = hVar;
        o6Var.f26991b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(xVar);
        wpVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f29290l = true;
        hVar.f29291m = 2.0f;
    }
}
