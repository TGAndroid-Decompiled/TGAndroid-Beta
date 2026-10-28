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
    public final RectF f12870a = new RectF();
    public final h6 f12871b;
    public final h6 f12872c;
    public final h6 d;
    public final h6 e;
    public final j5 f12873f;
    public final j5 f12874g;
    public final h6 h;
    public final h6 f12875i;
    public final xc f12876j;
    public final Paint f12877k;
    public final r6 f12878l;
    public int f12879m;
    public final org.telegram.ui.Cells.y f12880n;
    public final gq f12881o;
    public final org.telegram.ui.Components.voip.h f12882p;

    public b0(d0 d0Var) {
        ds dsVar = ds.h;
        this.f12871b = new h6(d0Var, 0L, 320L, dsVar);
        this.f12872c = new h6(d0Var, 0L, 320L, dsVar);
        this.d = new h6(d0Var, 0L, 320L, dsVar);
        this.e = new h6(d0Var, 0L, 320L, dsVar);
        this.f12873f = new j5(d0Var, 320L, dsVar, 0);
        this.f12874g = new j5(d0Var, 320L, dsVar, 0);
        this.h = new h6(d0Var, 0L, 320L, dsVar);
        this.f12875i = new h6(d0Var, 0L, 320L, dsVar);
        this.f12876j = new xc(d0Var);
        this.f12877k = new Paint(1);
        r6 r6Var = new r6(true, false, true);
        this.f12878l = r6Var;
        org.telegram.ui.Cells.y Z = y6.Z(0, 9, 9);
        this.f12880n = Z;
        gq gqVar = new gq(-1);
        this.f12881o = gqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f12882p = hVar;
        r6Var.f32142b = 17;
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x * 4;
        r6Var.q(true);
        r6Var.setCallback(d0Var);
        gqVar.setCallback(d0Var);
        Z.setCallback(d0Var);
        hVar.f33930l = true;
        hVar.f33931m = 2.0f;
    }
}
