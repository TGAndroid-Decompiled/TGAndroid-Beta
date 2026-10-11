package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.q6;
public final class v {
    public final RectF f9405a = new RectF();
    public final g6 f9406b;
    public final g6 f9407c;
    public final g6 d;
    public final g6 f9408e;
    public final j5 f9409f;
    public final j5 f9410g;
    public final g6 h;
    public final g6 f9411i;
    public final bd f9412j;
    public final Paint f9413k;
    public final q6 f9414l;
    public int f9415m;
    public final org.telegram.ui.Cells.z f9416n;
    public final jq f9417o;
    public final org.telegram.ui.Components.voip.h f9418p;

    public v(x xVar) {
        is isVar = is.h;
        this.f9406b = new g6(xVar, 0L, 320L, isVar);
        this.f9407c = new g6(xVar, 0L, 320L, isVar);
        this.d = new g6(xVar, 0L, 320L, isVar);
        this.f9408e = new g6(xVar, 0L, 320L, isVar);
        this.f9409f = new j5(xVar, 320L, isVar, 0);
        this.f9410g = new j5(xVar, 320L, isVar, 0);
        this.h = new g6(xVar, 0L, 320L, isVar);
        this.f9411i = new g6(xVar, 0L, 320L, isVar);
        this.f9412j = new bd(xVar);
        this.f9413k = new Paint(1);
        q6 q6Var = new q6(true, false, true);
        this.f9414l = q6Var;
        org.telegram.ui.Cells.z Z = h6.Z(0, 9, 9);
        this.f9416n = Z;
        jq jqVar = new jq(-1);
        this.f9417o = jqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9418p = hVar;
        q6Var.f30134b = 17;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.M = AndroidUtilities.displaySize.x * 4;
        q6Var.q(true);
        q6Var.setCallback(xVar);
        jqVar.setCallback(xVar);
        Z.setCallback(xVar);
        hVar.f32070l = true;
        hVar.f32071m = 2.0f;
    }
}
