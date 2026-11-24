package defpackage;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class uq8 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public vva f;
    public RadialGradient h;
    public Paint i;
    public vl j;
    public lm k;
    public final n41 m;
    public int g = -1;
    public final RectF l = new RectF();

    public uq8(vq8 vq8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j;
        this.m = new n41(vq8Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        if (document == null) {
            j = 0;
        } else {
            j = document.id;
        }
        this.c = j;
        this.d = ((TL_stars.starGiftAttributeBackdrop) gta.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new vva(1, 6);
        float L = gl.L(36.0f);
        float f = (-L) / 2.0f;
        float f2 = L / 2.0f;
        this.f.c.set(f, f, f2, f2);
    }
}
