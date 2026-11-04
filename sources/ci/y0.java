package ci;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y0 {
    public final long f6374a;
    public final TLRPC.Document f6375b;
    public final long f6376c;
    public final int d;
    public final String f6377e;
    public lc f6378f;
    public int f6379g = -1;
    public RadialGradient h;
    public Paint f6380i;
    public org.telegram.ui.Components.g5 f6381j;
    public org.telegram.ui.Components.u5 f6382k;
    public final RectF f6383l;
    public final org.telegram.ui.Components.gc f6384m;

    public y0(z0 z0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f6383l = new RectF();
        this.f6384m = new org.telegram.ui.Components.gc(z0Var);
        this.f6374a = tL_starGiftUnique.f27230id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f6375b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f27007id;
        }
        this.f6376c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f6377e = tL_starGiftUnique.slug;
        this.f6378f = new lc(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f6378f.f5515c.set(f10, f10, f11, f11);
    }
}
