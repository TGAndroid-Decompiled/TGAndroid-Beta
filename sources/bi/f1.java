package bi;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f1 {
    public final long f3845a;
    public final TLRPC.Document f3846b;
    public final long f3847c;
    public final int d;
    public final String f3848e;
    public ud f3849f;
    public int f3850g = -1;
    public RadialGradient h;
    public Paint f3851i;
    public org.telegram.ui.Components.i5 f3852j;
    public org.telegram.ui.Components.w5 f3853k;
    public final RectF f3854l;
    public final org.telegram.ui.Components.ic f3855m;

    public f1(g1 g1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f3854l = new RectF();
        this.f3855m = new org.telegram.ui.Components.ic(g1Var);
        this.f3845a = tL_starGiftUnique.f27185id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f3846b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f26962id;
        }
        this.f3847c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f3848e = tL_starGiftUnique.slug;
        this.f3849f = new ud(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f3849f.f4845c.set(f10, f10, f11, f11);
    }
}
