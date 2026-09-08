package fi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.zc;
public final class v {
    public final RectF f10034a = new RectF();
    public final e6 f10035b;
    public final e6 f10036c;
    public final e6 d;
    public final e6 f10037e;
    public final h5 f10038f;
    public final h5 f10039g;
    public final e6 h;
    public final e6 f10040i;
    public final zc f10041j;
    public final Paint f10042k;
    public final p6 f10043l;
    public int f10044m;
    public final org.telegram.ui.Cells.z f10045n;
    public final sp f10046o;
    public final org.telegram.ui.Components.voip.h f10047p;

    public v(x xVar) {
        pr prVar = pr.h;
        this.f10035b = new e6(xVar, 0L, 320L, prVar);
        this.f10036c = new e6(xVar, 0L, 320L, prVar);
        this.d = new e6(xVar, 0L, 320L, prVar);
        this.f10037e = new e6(xVar, 0L, 320L, prVar);
        this.f10038f = new h5(xVar, 320L, prVar, 0);
        this.f10039g = new h5(xVar, 320L, prVar, 0);
        this.h = new e6(xVar, 0L, 320L, prVar);
        this.f10040i = new e6(xVar, 0L, 320L, prVar);
        this.f10041j = new zc(xVar);
        this.f10042k = new Paint(1);
        p6 p6Var = new p6(true, false, true, false);
        this.f10043l = p6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.f10045n = Y;
        sp spVar = new sp(-1);
        this.f10046o = spVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f10047p = hVar;
        p6Var.f29312b = 17;
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.G = AndroidUtilities.displaySize.x * 4;
        p6Var.n(true);
        p6Var.setCallback(xVar);
        spVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f31535l = true;
        hVar.f31536m = 2.0f;
    }
}
