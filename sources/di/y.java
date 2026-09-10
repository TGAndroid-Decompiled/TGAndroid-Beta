package di;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zp;
public final class y {
    public final RectF f7009a = new RectF();
    public final d6 f7010b;
    public final d6 f7011c;
    public final d6 d;
    public final d6 e;
    public final org.telegram.ui.Components.g5 f7012f;
    public final org.telegram.ui.Components.g5 f7013g;
    public final d6 h;
    public final d6 f7014i;
    public final xc f7015j;
    public final Paint f7016k;
    public final n6 f7017l;
    public int f7018m;
    public final org.telegram.ui.Cells.z f7019n;
    public final zp f7020o;
    public final org.telegram.ui.Components.voip.h f7021p;

    public y(a0 a0Var) {
        wr wrVar = wr.h;
        this.f7010b = new d6(a0Var, 0L, 320L, wrVar);
        this.f7011c = new d6(a0Var, 0L, 320L, wrVar);
        this.d = new d6(a0Var, 0L, 320L, wrVar);
        this.e = new d6(a0Var, 0L, 320L, wrVar);
        this.f7012f = new org.telegram.ui.Components.g5(a0Var, 320L, wrVar, 0);
        this.f7013g = new org.telegram.ui.Components.g5(a0Var, 320L, wrVar, 0);
        this.h = new d6(a0Var, 0L, 320L, wrVar);
        this.f7014i = new d6(a0Var, 0L, 320L, wrVar);
        this.f7015j = new xc(a0Var);
        this.f7016k = new Paint(1);
        n6 n6Var = new n6(true, false, true, false);
        this.f7017l = n6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.f7019n = Y;
        zp zpVar = new zp(-1);
        this.f7020o = zpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f7021p = hVar;
        n6Var.f25425b = 17;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x * 4;
        n6Var.n(true);
        n6Var.setCallback(a0Var);
        zpVar.setCallback(a0Var);
        Y.setCallback(a0Var);
        hVar.f28152l = true;
        hVar.f28153m = 2.0f;
    }
}
