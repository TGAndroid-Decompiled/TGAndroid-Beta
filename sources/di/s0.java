package di;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s0 {
    public final long f9720a;
    public final TLRPC.Document f9721b;
    public final long f9722c;
    public final int d;
    public final String f9723e;
    public ec f9724f;
    public int f9725g = -1;
    public RadialGradient h;
    public Paint f9726i;
    public org.telegram.ui.Components.p5 f9727j;
    public org.telegram.ui.Components.d6 f9728k;
    public final RectF f9729l;
    public final org.telegram.ui.Components.mc f9730m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j3;
        new Matrix();
        this.f9729l = new RectF();
        this.f9730m = new org.telegram.ui.Components.mc(t0Var);
        this.f9720a = tL_starGiftUnique.f28663id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f9721b = document;
        if (document == null) {
            j3 = 0;
        } else {
            j3 = document.f28440id;
        }
        this.f9722c = j3;
        this.d = ((TL_stars.starGiftAttributeBackdrop) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f9723e = tL_starGiftUnique.slug;
        this.f9724f = new ec(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f9724f.f8758c.set(f10, f10, f11, f11);
    }
}
