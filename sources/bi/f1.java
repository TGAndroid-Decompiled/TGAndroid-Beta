package bi;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f1 {
    public final long f3842a;
    public final TLRPC.Document f3843b;
    public final long f3844c;
    public final int d;
    public final String f3845e;
    public ud f3846f;
    public int f3847g = -1;
    public RadialGradient h;
    public Paint f3848i;
    public org.telegram.ui.Components.h5 f3849j;
    public org.telegram.ui.Components.v5 f3850k;
    public final RectF f3851l;
    public final org.telegram.ui.Components.hc f3852m;

    public f1(g1 g1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f3851l = new RectF();
        this.f3852m = new org.telegram.ui.Components.hc(g1Var);
        this.f3842a = tL_starGiftUnique.f27189id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f3843b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f26966id;
        }
        this.f3844c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f3845e = tL_starGiftUnique.slug;
        this.f3846f = new ud(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f3846f.f4844c.set(f10, f10, f11, f11);
    }
}
