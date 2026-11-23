package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s0 {
    public final long f9681a;
    public final TLRPC.Document f9682b;
    public final long f9683c;
    public final int d;
    public final String f9684e;
    public ec f9685f;
    public int f9686g = -1;
    public RadialGradient h;
    public Paint f9687i;
    public org.telegram.ui.Components.o5 f9688j;
    public org.telegram.ui.Components.c6 f9689k;
    public final RectF f9690l;
    public final org.telegram.ui.Components.lc f9691m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f9690l = new RectF();
        this.f9691m = new org.telegram.ui.Components.lc(t0Var);
        this.f9681a = tL_starGiftUnique.f28721id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f9682b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28498id;
        }
        this.f9683c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f9684e = tL_starGiftUnique.slug;
        this.f9685f = new ec(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f9685f.f8719c.set(f10, f10, f11, f11);
    }
}
