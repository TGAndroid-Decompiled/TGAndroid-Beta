package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.q6;
public final class v {
    public final RectF f9406a = new RectF();
    public final g6 f9407b;
    public final g6 f9408c;
    public final g6 d;
    public final g6 f9409e;
    public final j5 f9410f;
    public final j5 f9411g;
    public final g6 h;
    public final g6 f9412i;
    public final bd f9413j;
    public final Paint f9414k;
    public final q6 f9415l;
    public int f9416m;
    public final org.telegram.ui.Cells.z f9417n;
    public final jq f9418o;
    public final org.telegram.ui.Components.voip.h f9419p;

    public v(x xVar) {
        hs hsVar = hs.h;
        this.f9407b = new g6(xVar, 0L, 320L, hsVar);
        this.f9408c = new g6(xVar, 0L, 320L, hsVar);
        this.d = new g6(xVar, 0L, 320L, hsVar);
        this.f9409e = new g6(xVar, 0L, 320L, hsVar);
        this.f9410f = new j5(xVar, 320L, hsVar, 0);
        this.f9411g = new j5(xVar, 320L, hsVar, 0);
        this.h = new g6(xVar, 0L, 320L, hsVar);
        this.f9412i = new g6(xVar, 0L, 320L, hsVar);
        this.f9413j = new bd(xVar);
        this.f9414k = new Paint(1);
        q6 q6Var = new q6(true, false, true);
        this.f9415l = q6Var;
        org.telegram.ui.Cells.z Z = i6.Z(0, 9, 9);
        this.f9417n = Z;
        jq jqVar = new jq(-1);
        this.f9418o = jqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9419p = hVar;
        q6Var.f30065b = 17;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.M = AndroidUtilities.displaySize.x * 4;
        q6Var.q(true);
        q6Var.setCallback(xVar);
        jqVar.setCallback(xVar);
        Z.setCallback(xVar);
        hVar.f31960l = true;
        hVar.f31961m = 2.0f;
    }
}
