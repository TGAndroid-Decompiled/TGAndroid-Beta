package ai;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i1 {
    public final long f1468a;
    public final TLRPC.Document f1469b;
    public final long f1470c;
    public final int d;
    public final String e;
    public de f1471f;
    public int f1472g = -1;
    public RadialGradient h;
    public Paint f1473i;
    public org.telegram.ui.Components.r5 f1474j;
    public org.telegram.ui.Components.f6 f1475k;
    public final RectF f1476l;
    public final org.telegram.ui.Components.yc f1477m;

    public i1(j1 j1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f1476l = new RectF();
        this.f1477m = new org.telegram.ui.Components.yc(j1Var);
        this.f1468a = tL_starGiftUnique.f20497id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f1469b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20279id;
        }
        this.f1470c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f1471f = new de(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f1471f.f1168c.set(f7, f7, f10, f10);
    }
}
