package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.r6;
public final class u {
    public final RectF f9561a = new RectF();
    public final g6 f9562b;
    public final g6 f9563c;
    public final g6 d;
    public final g6 e;
    public final j5 f9564f;
    public final j5 f9565g;
    public final g6 h;
    public final g6 f9566i;
    public final ad f9567j;
    public final Paint f9568k;
    public final r6 f9569l;
    public int f9570m;
    public final org.telegram.ui.Cells.z f9571n;
    public final gq f9572o;
    public final org.telegram.ui.Components.voip.h f9573p;

    public u(w wVar) {
        es esVar = es.h;
        this.f9562b = new g6(wVar, 0L, 320L, esVar);
        this.f9563c = new g6(wVar, 0L, 320L, esVar);
        this.d = new g6(wVar, 0L, 320L, esVar);
        this.e = new g6(wVar, 0L, 320L, esVar);
        this.f9564f = new j5(wVar, 320L, esVar, 0);
        this.f9565g = new j5(wVar, 320L, esVar, 0);
        this.h = new g6(wVar, 0L, 320L, esVar);
        this.f9566i = new g6(wVar, 0L, 320L, esVar);
        this.f9567j = new ad(wVar);
        this.f9568k = new Paint(1);
        r6 r6Var = new r6(true, false, true);
        this.f9569l = r6Var;
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.g6.Z(0, 9, 9);
        this.f9571n = Z;
        gq gqVar = new gq(-1);
        this.f9572o = gqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9573p = hVar;
        r6Var.f28435b = 17;
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x * 4;
        r6Var.q(true);
        r6Var.setCallback(wVar);
        gqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.f29870l = true;
        hVar.f29871m = 2.0f;
    }
}
