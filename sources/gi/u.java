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
    public final RectF f11482a = new RectF();
    public final f6 f11483b;
    public final f6 f11484c;
    public final f6 d;
    public final f6 e;
    public final i5 f11485f;
    public final i5 f11486g;
    public final f6 h;
    public final f6 f11487i;
    public final yc f11488j;
    public final Paint f11489k;
    public final p6 f11490l;
    public int f11491m;
    public final org.telegram.ui.Cells.z f11492n;
    public final dq f11493o;
    public final org.telegram.ui.Components.voip.h f11494p;

    public u(w wVar) {
        bs bsVar = bs.h;
        this.f11483b = new f6(wVar, 0L, 320L, bsVar);
        this.f11484c = new f6(wVar, 0L, 320L, bsVar);
        this.d = new f6(wVar, 0L, 320L, bsVar);
        this.e = new f6(wVar, 0L, 320L, bsVar);
        this.f11485f = new i5(wVar, 320L, bsVar, 0);
        this.f11486g = new i5(wVar, 320L, bsVar, 0);
        this.h = new f6(wVar, 0L, 320L, bsVar);
        this.f11487i = new f6(wVar, 0L, 320L, bsVar);
        this.f11488j = new yc(wVar);
        this.f11489k = new Paint(1);
        p6 p6Var = new p6(true, false, true);
        this.f11490l = p6Var;
        org.telegram.ui.Cells.z Z = h6.Z(0, 9, 9);
        this.f11492n = Z;
        dq dqVar = new dq(-1);
        this.f11493o = dqVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f11494p = hVar;
        p6Var.f29182b = 17;
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.M = AndroidUtilities.displaySize.x * 4;
        p6Var.q(true);
        p6Var.setCallback(wVar);
        dqVar.setCallback(wVar);
        Z.setCallback(wVar);
        hVar.f31483l = true;
        hVar.f31484m = 2.0f;
    }
}
