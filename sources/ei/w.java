package ei;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zc;
public final class w {
    public final RectF f9403a = new RectF();
    public final e6 f9404b;
    public final e6 f9405c;
    public final e6 d;
    public final e6 f9406e;
    public final h5 f9407f;
    public final h5 f9408g;
    public final e6 h;
    public final e6 f9409i;
    public final zc f9410j;
    public final Paint f9411k;
    public final o6 f9412l;
    public int f9413m;
    public final org.telegram.ui.Cells.z f9414n;
    public final wp f9415o;
    public final org.telegram.ui.Components.voip.h f9416p;

    public w(y yVar) {
        tr trVar = tr.h;
        this.f9404b = new e6(yVar, 0L, 320L, trVar);
        this.f9405c = new e6(yVar, 0L, 320L, trVar);
        this.d = new e6(yVar, 0L, 320L, trVar);
        this.f9406e = new e6(yVar, 0L, 320L, trVar);
        this.f9407f = new h5(yVar, 320L, trVar, 0);
        this.f9408g = new h5(yVar, 320L, trVar, 0);
        this.h = new e6(yVar, 0L, 320L, trVar);
        this.f9409i = new e6(yVar, 0L, 320L, trVar);
        this.f9410j = new zc(yVar);
        this.f9411k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.f9412l = o6Var;
        org.telegram.ui.Cells.z Y = i6.Y(0, 9, 9);
        this.f9414n = Y;
        wp wpVar = new wp(-1);
        this.f9415o = wpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9416p = hVar;
        o6Var.f29245b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(yVar);
        wpVar.setCallback(yVar);
        Y.setCallback(yVar);
        hVar.f31886l = true;
        hVar.f31887m = 2.0f;
    }
}
