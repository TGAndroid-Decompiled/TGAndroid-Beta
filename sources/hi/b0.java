package hi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.xc;
public final class b0 {
    public final RectF f12871a = new RectF();
    public final h6 f12872b;
    public final h6 f12873c;
    public final h6 d;
    public final h6 e;
    public final j5 f12874f;
    public final j5 f12875g;
    public final h6 h;
    public final h6 f12876i;
    public final xc f12877j;
    public final Paint f12878k;
    public final r6 f12879l;
    public int f12880m;
    public final org.telegram.ui.Cells.y f12881n;
    public final gq f12882o;
    public final org.telegram.ui.Components.voip.h f12883p;

    public b0(d0 d0Var) {
        ds dsVar = ds.h;
        this.f12872b = new h6(d0Var, 0L, 320L, dsVar);
        this.f12873c = new h6(d0Var, 0L, 320L, dsVar);
        this.d = new h6(d0Var, 0L, 320L, dsVar);
        this.e = new h6(d0Var, 0L, 320L, dsVar);
        this.f12874f = new j5(d0Var, 320L, dsVar, 0);
        this.f12875g = new j5(d0Var, 320L, dsVar, 0);
        this.h = new h6(d0Var, 0L, 320L, dsVar);
        this.f12876i = new h6(d0Var, 0L, 320L, dsVar);
        this.f12877j = new xc(d0Var);
        this.f12878k = new Paint(1);
        r6 r6Var = new r6(true, false, true);
        this.f12879l = r6Var;
        org.telegram.ui.Cells.y Z = y6.Z(0, 9, 9);
        this.f12881n = Z;
        gq gqVar = new gq(-1);
        this.f12882o = gqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f12883p = hVar;
        r6Var.f32121b = 17;
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x * 4;
        r6Var.q(true);
        r6Var.setCallback(d0Var);
        gqVar.setCallback(d0Var);
        Z.setCallback(d0Var);
        hVar.f33825l = true;
        hVar.f33826m = 2.0f;
    }
}
