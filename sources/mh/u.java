package mh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.y5;
public final class u {
    public final RectF f18134a = new RectF();
    public final y5 f18135b;
    public final y5 f18136c;
    public final y5 d;
    public final y5 f18137e;
    public final b5 f18138f;
    public final b5 f18139g;
    public final y5 h;
    public final y5 f18140i;
    public final pc f18141j;
    public final Paint f18142k;
    public final i6 f18143l;
    public int f18144m;
    public final org.telegram.ui.Cells.z f18145n;
    public final jp f18146o;
    public final org.telegram.ui.Components.voip.h f18147p;

    public u(w wVar) {
        gr grVar = gr.h;
        this.f18135b = new y5(wVar, 0L, 320L, grVar);
        this.f18136c = new y5(wVar, 0L, 320L, grVar);
        this.d = new y5(wVar, 0L, 320L, grVar);
        this.f18137e = new y5(wVar, 0L, 320L, grVar);
        this.f18138f = new b5(wVar, 320L, grVar, 0);
        this.f18139g = new b5(wVar, 320L, grVar, 0);
        this.h = new y5(wVar, 0L, 320L, grVar);
        this.f18140i = new y5(wVar, 0L, 320L, grVar);
        this.f18141j = new pc(wVar);
        this.f18142k = new Paint(1);
        i6 i6Var = new i6(true, false, true, false);
        this.f18143l = i6Var;
        org.telegram.ui.Cells.z Y = f6.Y(0, 9, 9);
        this.f18145n = Y;
        jp jpVar = new jp(-1);
        this.f18146o = jpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f18147p = hVar;
        i6Var.f29333b = 17;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x * 4;
        i6Var.n(true);
        i6Var.setCallback(wVar);
        jpVar.setCallback(wVar);
        Y.setCallback(wVar);
        hVar.f33546l = true;
        hVar.f33547m = 2.0f;
    }
}
