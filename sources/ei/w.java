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
    public final RectF f9402a = new RectF();
    public final e6 f9403b;
    public final e6 f9404c;
    public final e6 d;
    public final e6 f9405e;
    public final h5 f9406f;
    public final h5 f9407g;
    public final e6 h;
    public final e6 f9408i;
    public final zc f9409j;
    public final Paint f9410k;
    public final o6 f9411l;
    public int f9412m;
    public final org.telegram.ui.Cells.z f9413n;
    public final wp f9414o;
    public final org.telegram.ui.Components.voip.h f9415p;

    public w(y yVar) {
        tr trVar = tr.h;
        this.f9403b = new e6(yVar, 0L, 320L, trVar);
        this.f9404c = new e6(yVar, 0L, 320L, trVar);
        this.d = new e6(yVar, 0L, 320L, trVar);
        this.f9405e = new e6(yVar, 0L, 320L, trVar);
        this.f9406f = new h5(yVar, 320L, trVar, 0);
        this.f9407g = new h5(yVar, 320L, trVar, 0);
        this.h = new e6(yVar, 0L, 320L, trVar);
        this.f9408i = new e6(yVar, 0L, 320L, trVar);
        this.f9409j = new zc(yVar);
        this.f9410k = new Paint(1);
        o6 o6Var = new o6(true, false, true, false);
        this.f9411l = o6Var;
        org.telegram.ui.Cells.z Y = i6.Y(0, 9, 9);
        this.f9413n = Y;
        wp wpVar = new wp(-1);
        this.f9414o = wpVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9415p = hVar;
        o6Var.f29239b = 17;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.G = AndroidUtilities.displaySize.x * 4;
        o6Var.n(true);
        o6Var.setCallback(yVar);
        wpVar.setCallback(yVar);
        Y.setCallback(yVar);
        hVar.f31879l = true;
        hVar.f31880m = 2.0f;
    }
}
