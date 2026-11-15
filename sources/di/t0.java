package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t0 {
    public final long f9442a;
    public final TLRPC.Document f9443b;
    public final long f9444c;
    public final int d;
    public final String f9445e;
    public bc f9446f;
    public int f9447g = -1;
    public RadialGradient h;
    public Paint f9448i;
    public org.telegram.ui.Components.g5 f9449j;
    public org.telegram.ui.Components.u5 f9450k;
    public final RectF f9451l;
    public final org.telegram.ui.Components.dc f9452m;

    public t0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f9451l = new RectF();
        this.f9452m = new org.telegram.ui.Components.dc(u0Var);
        this.f9442a = tL_starGiftUnique.f28280id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f9443b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28057id;
        }
        this.f9444c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) v8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f9445e = tL_starGiftUnique.slug;
        this.f9446f = new bc(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f9446f.f8268c.set(f10, f10, f11, f11);
    }
}
