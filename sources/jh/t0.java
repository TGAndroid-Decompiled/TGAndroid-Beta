package jh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.uc;
public final class t0 {
    public final long f12818a;
    public final TLRPC.Document f12819b;
    public final long f12820c;
    public final int d;
    public final String f12821e;
    public va f12822f;
    public int f12823g = -1;
    public RadialGradient h;
    public Paint f12824i;
    public org.telegram.ui.Components.p5 f12825j;
    public org.telegram.ui.Components.d6 f12826k;
    public final RectF f12827l;
    public final uc f12828m;

    public t0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f12827l = new RectF();
        this.f12828m = new uc(u0Var);
        this.f12818a = tL_starGiftUnique.f22619id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f12819b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22398id;
        }
        this.f12820c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f12821e = tL_starGiftUnique.slug;
        this.f12822f = new va(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f9 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f12822f.f12988c.set(f9, f9, f10, f10);
    }
}
