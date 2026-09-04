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
    public final RectF f10006a = new RectF();
    public final e6 f10007b;
    public final e6 f10008c;
    public final e6 d;
    public final e6 f10009e;
    public final h5 f10010f;
    public final h5 f10011g;
    public final e6 h;
    public final e6 f10012i;
    public final zc f10013j;
    public final Paint f10014k;
    public final p6 f10015l;
    public int f10016m;
    public final org.telegram.ui.Cells.z f10017n;
    public final sp f10018o;
    public final org.telegram.ui.Components.voip.h f10019p;

    public v(x xVar) {
        pr prVar = pr.h;
        this.f10007b = new e6(xVar, 0L, 320L, prVar);
        this.f10008c = new e6(xVar, 0L, 320L, prVar);
        this.d = new e6(xVar, 0L, 320L, prVar);
        this.f10009e = new e6(xVar, 0L, 320L, prVar);
        this.f10010f = new h5(xVar, 320L, prVar, 0);
        this.f10011g = new h5(xVar, 320L, prVar, 0);
        this.h = new e6(xVar, 0L, 320L, prVar);
        this.f10012i = new e6(xVar, 0L, 320L, prVar);
        this.f10013j = new zc(xVar);
        this.f10014k = new Paint(1);
        p6 p6Var = new p6(true, false, true, false);
        this.f10015l = p6Var;
        org.telegram.ui.Cells.z Y = j6.Y(0, 9, 9);
        this.f10017n = Y;
        sp spVar = new sp(-1);
        this.f10018o = spVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f10019p = hVar;
        p6Var.f29285b = 17;
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.G = AndroidUtilities.displaySize.x * 4;
        p6Var.n(true);
        p6Var.setCallback(xVar);
        spVar.setCallback(xVar);
        Y.setCallback(xVar);
        hVar.f31508l = true;
        hVar.f31509m = 2.0f;
    }
}
