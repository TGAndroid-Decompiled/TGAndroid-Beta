package gi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zr;
public final class u {
    public final RectF f11506a = new RectF();
    public final d6 f11507b;
    public final d6 f11508c;
    public final d6 d;
    public final d6 e;
    public final g5 f11509f;
    public final g5 f11510g;
    public final d6 h;
    public final d6 f11511i;
    public final wc f11512j;
    public final Paint f11513k;
    public final n6 f11514l;
    public int f11515m;
    public final org.telegram.ui.Cells.y f11516n;
    public final cq f11517o;
    public final org.telegram.ui.Components.voip.h f11518p;

    public u(w wVar) {
        zr zrVar = zr.h;
        this.f11507b = new d6(wVar, 0L, 320L, zrVar);
        this.f11508c = new d6(wVar, 0L, 320L, zrVar);
        this.d = new d6(wVar, 0L, 320L, zrVar);
        this.e = new d6(wVar, 0L, 320L, zrVar);
        this.f11509f = new g5(wVar, 320L, zrVar, 0);
        this.f11510g = new g5(wVar, 320L, zrVar, 0);
        this.h = new d6(wVar, 0L, 320L, zrVar);
        this.f11511i = new d6(wVar, 0L, 320L, zrVar);
        this.f11512j = new wc(wVar);
        this.f11513k = new Paint(1);
        n6 n6Var = new n6(true, false, true);
        this.f11514l = n6Var;
        org.telegram.ui.Cells.y Z = k6.Z(0, 9, 9);
        this.f11516n = Z;
        cq cqVar = new cq(-1);
        this.f11517o = cqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f11518p = hVar;
        n6Var.f28797b = 17;
        n6Var.w(AndroidUtilities.dp(14.0f));
        n6Var.x(AndroidUtilities.bold());
        n6Var.M = AndroidUtilities.displaySize.x * 4;
        n6Var.q(true);
        n6Var.setCallback(wVar);
        cqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.f31588l = true;
        hVar.f31589m = 2.0f;
    }
}
