package gi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.yc;
public final class u {
    public final RectF f11481a = new RectF();
    public final f6 f11482b;
    public final f6 f11483c;
    public final f6 d;
    public final f6 e;
    public final i5 f11484f;
    public final i5 f11485g;
    public final f6 h;
    public final f6 f11486i;
    public final yc f11487j;
    public final Paint f11488k;
    public final p6 f11489l;
    public int f11490m;
    public final org.telegram.ui.Cells.z f11491n;
    public final dq f11492o;
    public final org.telegram.ui.Components.voip.h f11493p;

    public u(w wVar) {
        bs bsVar = bs.h;
        this.f11482b = new f6(wVar, 0L, 320L, bsVar);
        this.f11483c = new f6(wVar, 0L, 320L, bsVar);
        this.d = new f6(wVar, 0L, 320L, bsVar);
        this.e = new f6(wVar, 0L, 320L, bsVar);
        this.f11484f = new i5(wVar, 320L, bsVar, 0);
        this.f11485g = new i5(wVar, 320L, bsVar, 0);
        this.h = new f6(wVar, 0L, 320L, bsVar);
        this.f11486i = new f6(wVar, 0L, 320L, bsVar);
        this.f11487j = new yc(wVar);
        this.f11488k = new Paint(1);
        p6 p6Var = new p6(true, false, true);
        this.f11489l = p6Var;
        org.telegram.ui.Cells.z Z = h6.Z(0, 9, 9);
        this.f11491n = Z;
        dq dqVar = new dq(-1);
        this.f11492o = dqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f11493p = hVar;
        p6Var.f29192b = 17;
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.M = AndroidUtilities.displaySize.x * 4;
        p6Var.q(true);
        p6Var.setCallback(wVar);
        dqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.f31472l = true;
        hVar.f31473m = 2.0f;
    }
}
