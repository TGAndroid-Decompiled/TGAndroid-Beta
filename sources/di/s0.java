package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s0 {
    public final long f9684a;
    public final TLRPC.Document f9685b;
    public final long f9686c;
    public final int d;
    public final String f9687e;
    public ec f9688f;
    public int f9689g = -1;
    public RadialGradient h;
    public Paint f9690i;
    public org.telegram.ui.Components.p5 f9691j;
    public org.telegram.ui.Components.d6 f9692k;
    public final RectF f9693l;
    public final org.telegram.ui.Components.mc f9694m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f9693l = new RectF();
        this.f9694m = new org.telegram.ui.Components.mc(t0Var);
        this.f9684a = tL_starGiftUnique.f28627id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f9685b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28404id;
        }
        this.f9686c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f9687e = tL_starGiftUnique.slug;
        this.f9688f = new ec(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f9688f.f8721c.set(f10, f10, f11, f11);
    }
}
