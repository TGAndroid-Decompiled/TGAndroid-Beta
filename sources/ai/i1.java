package ai;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i1 {
    public final long f1460a;
    public final TLRPC.Document f1461b;
    public final long f1462c;
    public final int d;
    public final String e;
    public de f1463f;
    public int f1464g = -1;
    public RadialGradient h;
    public Paint f1465i;
    public org.telegram.ui.Components.r5 f1466j;
    public org.telegram.ui.Components.f6 f1467k;
    public final RectF f1468l;
    public final org.telegram.ui.Components.yc f1469m;

    public i1(j1 j1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f1468l = new RectF();
        this.f1469m = new org.telegram.ui.Components.yc(j1Var);
        this.f1460a = tL_starGiftUnique.f20496id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f1461b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20278id;
        }
        this.f1462c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f1463f = new de(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f1463f.f1180c.set(f7, f7, f10, f10);
    }
}
