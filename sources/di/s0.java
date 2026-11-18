package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s0 {
    public final long f9686a;
    public final TLRPC.Document f9687b;
    public final long f9688c;
    public final int d;
    public final String f9689e;
    public ec f9690f;
    public int f9691g = -1;
    public RadialGradient h;
    public Paint f9692i;
    public org.telegram.ui.Components.o5 f9693j;
    public org.telegram.ui.Components.c6 f9694k;
    public final RectF f9695l;
    public final org.telegram.ui.Components.mc f9696m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f9695l = new RectF();
        this.f9696m = new org.telegram.ui.Components.mc(t0Var);
        this.f9686a = tL_starGiftUnique.f28632id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f9687b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28409id;
        }
        this.f9688c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f9689e = tL_starGiftUnique.slug;
        this.f9690f = new ec(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f9690f.f8732c.set(f10, f10, f11, f11);
    }
}
