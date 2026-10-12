package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q6;
public final class v {
    public final RectF f9403a = new RectF();
    public final g6 f9404b;
    public final g6 f9405c;
    public final g6 d;
    public final g6 f9406e;
    public final j5 f9407f;
    public final j5 f9408g;
    public final g6 h;
    public final g6 f9409i;
    public final ad f9410j;
    public final Paint f9411k;
    public final q6 f9412l;
    public int f9413m;
    public final org.telegram.ui.Cells.z f9414n;
    public final lq f9415o;
    public final org.telegram.ui.Components.voip.h f9416p;

    public v(x xVar) {
        js jsVar = js.h;
        this.f9404b = new g6(xVar, 0L, 320L, jsVar);
        this.f9405c = new g6(xVar, 0L, 320L, jsVar);
        this.d = new g6(xVar, 0L, 320L, jsVar);
        this.f9406e = new g6(xVar, 0L, 320L, jsVar);
        this.f9407f = new j5(xVar, 320L, jsVar, 0);
        this.f9408g = new j5(xVar, 320L, jsVar, 0);
        this.h = new g6(xVar, 0L, 320L, jsVar);
        this.f9409i = new g6(xVar, 0L, 320L, jsVar);
        this.f9410j = new ad(xVar);
        this.f9411k = new Paint(1);
        q6 q6Var = new q6(true, false, true);
        this.f9412l = q6Var;
        org.telegram.ui.Cells.z Z = h6.Z(0, 9, 9);
        this.f9414n = Z;
        lq lqVar = new lq(-1);
        this.f9415o = lqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9416p = hVar;
        q6Var.f29690b = 17;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.M = AndroidUtilities.displaySize.x * 4;
        q6Var.q(true);
        q6Var.setCallback(xVar);
        lqVar.setCallback(xVar);
        Z.setCallback(xVar);
        hVar.f31692l = true;
        hVar.f31693m = 2.0f;
    }
}
