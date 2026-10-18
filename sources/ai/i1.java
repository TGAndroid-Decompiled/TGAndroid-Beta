package ai;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i1 {
    public final long f1461a;
    public final TLRPC.Document f1462b;
    public final long f1463c;
    public final int d;
    public final String e;
    public de f1464f;
    public int f1465g = -1;
    public RadialGradient h;
    public Paint f1466i;
    public org.telegram.ui.Components.r5 f1467j;
    public org.telegram.ui.Components.f6 f1468k;
    public final RectF f1469l;
    public final org.telegram.ui.Components.yc f1470m;

    public i1(j1 j1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f1469l = new RectF();
        this.f1470m = new org.telegram.ui.Components.yc(j1Var);
        this.f1461a = tL_starGiftUnique.f20503id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f1462b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20285id;
        }
        this.f1463c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f1464f = new de(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f1464f.f1177c.set(f7, f7, f10, f10);
    }
}
