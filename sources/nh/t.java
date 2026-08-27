package nh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.y5;

public final class t {

    public final RectF f18949a = new RectF();

    public final y5 f18950b;

    public final y5 f18951c;
    public final y5 d;

    public final y5 f18952e;

    public final b5 f18953f;

    public final b5 f18954g;
    public final y5 h;

    public final y5 f18955i;

    public final nc f18956j;

    public final Paint f18957k;

    public final i6 f18958l;

    public int f18959m;

    public final org.telegram.ui.Cells.z f18960n;

    public final hp f18961o;

    public final org.telegram.ui.Components.voip.h f18962p;

    public t(v vVar) {
        er erVar = er.h;
        this.f18950b = new y5(vVar, 0L, 320L, erVar);
        this.f18951c = new y5(vVar, 0L, 320L, erVar);
        this.d = new y5(vVar, 0L, 320L, erVar);
        this.f18952e = new y5(vVar, 0L, 320L, erVar);
        this.f18953f = new b5(vVar, 320L, erVar, 0);
        this.f18954g = new b5(vVar, 320L, erVar, 0);
        this.h = new y5(vVar, 0L, 320L, erVar);
        this.f18955i = new y5(vVar, 0L, 320L, erVar);
        this.f18956j = new nc(vVar);
        this.f18957k = new Paint(1);
        i6 i6Var = new i6(true, false, true, false);
        this.f18958l = i6Var;
        org.telegram.ui.Cells.z zVarY = g6.Y(0, 9, 9);
        this.f18960n = zVarY;
        hp hpVar = new hp(-1);
        this.f18961o = hpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f18962p = hVar;
        i6Var.f29239b = 17;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x * 4;
        i6Var.n(true);
        i6Var.setCallback(vVar);
        hpVar.setCallback(vVar);
        zVarY.setCallback(vVar);
        hVar.f33596l = true;
        hVar.f33597m = 2.0f;
    }
}
