package mh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rc;
public final class s0 {
    public final long f14717a;
    public final TLRPC.Document f14718b;
    public final long f14719c;
    public final int d;
    public final String f14720e;
    public wa f14721f;
    public int f14722g = -1;
    public RadialGradient h;
    public Paint f14723i;
    public org.telegram.ui.Components.l5 f14724j;
    public org.telegram.ui.Components.z5 f14725k;
    public final RectF f14726l;
    public final rc f14727m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f14726l = new RectF();
        this.f14727m = new rc(t0Var);
        this.f14717a = tL_starGiftUnique.f21072id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f14718b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20851id;
        }
        this.f14719c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f14720e = tL_starGiftUnique.slug;
        this.f14721f = new wa(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f10 = (-dp) / 2.0f;
        float f11 = dp / 2.0f;
        this.f14721f.f15009c.set(f10, f10, f11, f11);
    }
}
