package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s0 {
    public final long f9689a;
    public final TLRPC.Document f9690b;
    public final long f9691c;
    public final int d;
    public final String f9692e;
    public ec f9693f;
    public int f9694g = -1;
    public RadialGradient h;
    public Paint f9695i;
    public org.telegram.ui.Components.o5 f9696j;
    public org.telegram.ui.Components.c6 f9697k;
    public final RectF f9698l;
    public final org.telegram.ui.Components.mc f9699m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f9698l = new RectF();
        this.f9699m = new org.telegram.ui.Components.mc(t0Var);
        this.f9689a = tL_starGiftUnique.f28634id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f9690b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28411id;
        }
        this.f9691c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f9692e = tL_starGiftUnique.slug;
        this.f9693f = new ec(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f9693f.f8735c.set(f10, f10, f11, f11);
    }
}
