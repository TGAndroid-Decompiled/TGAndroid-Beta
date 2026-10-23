package ai;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i1 {
    public final long f1456a;
    public final TLRPC.Document f1457b;
    public final long f1458c;
    public final int d;
    public final String e;
    public ee f1459f;
    public int f1460g = -1;
    public RadialGradient h;
    public Paint f1461i;
    public org.telegram.ui.Components.r5 f1462j;
    public org.telegram.ui.Components.f6 f1463k;
    public final RectF f1464l;
    public final org.telegram.ui.Components.yc f1465m;

    public i1(j1 j1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f1464l = new RectF();
        this.f1465m = new org.telegram.ui.Components.yc(j1Var);
        this.f1456a = tL_starGiftUnique.f20567id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f1457b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20349id;
        }
        this.f1458c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f1459f = new ee(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f1459f.f1235c.set(f7, f7, f10, f10);
    }
}
