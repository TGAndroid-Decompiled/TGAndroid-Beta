package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s0 {
    public final long f9717a;
    public final TLRPC.Document f9718b;
    public final long f9719c;
    public final int d;
    public final String f9720e;
    public ec f9721f;
    public int f9722g = -1;
    public RadialGradient h;
    public Paint f9723i;
    public org.telegram.ui.Components.p5 f9724j;
    public org.telegram.ui.Components.d6 f9725k;
    public final RectF f9726l;
    public final org.telegram.ui.Components.mc f9727m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f9726l = new RectF();
        this.f9727m = new org.telegram.ui.Components.mc(t0Var);
        this.f9717a = tL_starGiftUnique.f28660id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f9718b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28437id;
        }
        this.f9719c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f9720e = tL_starGiftUnique.slug;
        this.f9721f = new ec(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f9721f.f8755c.set(f10, f10, f11, f11);
    }
}
