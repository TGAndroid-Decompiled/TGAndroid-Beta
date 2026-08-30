package lh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rc;
public final class t0 {
    public final long f13103a;
    public final TLRPC.Document f13104b;
    public final long f13105c;
    public final int d;
    public final String e;
    public wa f13106f;
    public int f13107g = -1;
    public RadialGradient h;
    public Paint f13108i;
    public org.telegram.ui.Components.l5 f13109j;
    public org.telegram.ui.Components.z5 f13110k;
    public final RectF f13111l;
    public final rc f13112m;

    public t0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f13111l = new RectF();
        this.f13112m = new rc(u0Var);
        this.f13103a = tL_starGiftUnique.f19409id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f13104b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19190id;
        }
        this.f13105c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f13106f = new wa(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f10 = (-dp) / 2.0f;
        float f11 = dp / 2.0f;
        this.f13106f.f13314c.set(f10, f10, f11, f11);
    }
}
