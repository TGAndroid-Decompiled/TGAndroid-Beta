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
    public final long f14715a;
    public final TLRPC.Document f14716b;
    public final long f14717c;
    public final int d;
    public final String f14718e;
    public wa f14719f;
    public int f14720g = -1;
    public RadialGradient h;
    public Paint f14721i;
    public org.telegram.ui.Components.l5 f14722j;
    public org.telegram.ui.Components.z5 f14723k;
    public final RectF f14724l;
    public final rc f14725m;

    public s0(t0 t0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f14724l = new RectF();
        this.f14725m = new rc(t0Var);
        this.f14715a = tL_starGiftUnique.f21070id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f14716b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20849id;
        }
        this.f14717c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f14718e = tL_starGiftUnique.slug;
        this.f14719f = new wa(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f10 = (-dp) / 2.0f;
        float f11 = dp / 2.0f;
        this.f14719f.f15007c.set(f10, f10, f11, f11);
    }
}
