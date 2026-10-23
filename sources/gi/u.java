package gi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.yc;
public final class u {
    public final RectF f11506a = new RectF();
    public final f6 f11507b;
    public final f6 f11508c;
    public final f6 d;
    public final f6 e;
    public final i5 f11509f;
    public final i5 f11510g;
    public final f6 h;
    public final f6 f11511i;
    public final yc f11512j;
    public final Paint f11513k;
    public final p6 f11514l;
    public int f11515m;
    public final org.telegram.ui.Cells.y f11516n;
    public final eq f11517o;
    public final org.telegram.ui.Components.voip.h f11518p;

    public u(w wVar) {
        bs bsVar = bs.h;
        this.f11507b = new f6(wVar, 0L, 320L, bsVar);
        this.f11508c = new f6(wVar, 0L, 320L, bsVar);
        this.d = new f6(wVar, 0L, 320L, bsVar);
        this.e = new f6(wVar, 0L, 320L, bsVar);
        this.f11509f = new i5(wVar, 320L, bsVar, 0);
        this.f11510g = new i5(wVar, 320L, bsVar, 0);
        this.h = new f6(wVar, 0L, 320L, bsVar);
        this.f11511i = new f6(wVar, 0L, 320L, bsVar);
        this.f11512j = new yc(wVar);
        this.f11513k = new Paint(1);
        p6 p6Var = new p6(true, false, true);
        this.f11514l = p6Var;
        org.telegram.ui.Cells.y Z = k6.Z(0, 9, 9);
        this.f11516n = Z;
        eq eqVar = new eq(-1);
        this.f11517o = eqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f11518p = hVar;
        p6Var.f29437b = 17;
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.M = AndroidUtilities.displaySize.x * 4;
        p6Var.q(true);
        p6Var.setCallback(wVar);
        eqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.f31618l = true;
        hVar.f31619m = 2.0f;
    }
}
