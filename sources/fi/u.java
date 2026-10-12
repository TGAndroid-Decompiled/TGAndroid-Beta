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
    public final RectF f9558a = new RectF();
    public final g6 f9559b;
    public final g6 f9560c;
    public final g6 d;
    public final g6 e;
    public final j5 f9561f;
    public final j5 f9562g;
    public final g6 h;
    public final g6 f9563i;
    public final ad f9564j;
    public final Paint f9565k;
    public final r6 f9566l;
    public int f9567m;
    public final org.telegram.ui.Cells.z f9568n;
    public final gq f9569o;
    public final org.telegram.ui.Components.voip.h f9570p;

    public u(w wVar) {
        es esVar = es.h;
        this.f9559b = new g6(wVar, 0L, 320L, esVar);
        this.f9560c = new g6(wVar, 0L, 320L, esVar);
        this.d = new g6(wVar, 0L, 320L, esVar);
        this.e = new g6(wVar, 0L, 320L, esVar);
        this.f9561f = new j5(wVar, 320L, esVar, 0);
        this.f9562g = new j5(wVar, 320L, esVar, 0);
        this.h = new g6(wVar, 0L, 320L, esVar);
        this.f9563i = new g6(wVar, 0L, 320L, esVar);
        this.f9564j = new ad(wVar);
        this.f9565k = new Paint(1);
        r6 r6Var = new r6(true, false, true);
        this.f9566l = r6Var;
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.g6.Z(0, 9, 9);
        this.f9568n = Z;
        gq gqVar = new gq(-1);
        this.f9569o = gqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9570p = hVar;
        r6Var.f28748b = 17;
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.M = AndroidUtilities.displaySize.x * 4;
        r6Var.q(true);
        r6Var.setCallback(wVar);
        gqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.f30201l = true;
        hVar.f30202m = 2.0f;
    }
}
