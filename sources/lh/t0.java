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
    public final long f13087a;
    public final TLRPC.Document f13088b;
    public final long f13089c;
    public final int d;
    public final String e;
    public wa f13090f;
    public int f13091g = -1;
    public RadialGradient h;
    public Paint f13092i;
    public org.telegram.ui.Components.l5 f13093j;
    public org.telegram.ui.Components.z5 f13094k;
    public final RectF f13095l;
    public final rc f13096m;

    public t0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f13095l = new RectF();
        this.f13096m = new rc(u0Var);
        this.f13087a = tL_starGiftUnique.f19384id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f13088b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19165id;
        }
        this.f13089c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f13090f = new wa(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f10 = (-dp) / 2.0f;
        float f11 = dp / 2.0f;
        this.f13090f.f13298c.set(f10, f10, f11, f11);
    }
}
