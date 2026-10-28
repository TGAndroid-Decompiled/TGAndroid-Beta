package bi;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h1 {
    public final long f4704a;
    public final TLRPC.Document f4705b;
    public final long f4706c;
    public final int d;
    public final String e;
    public td f4707f;
    public int f4708g = -1;
    public RadialGradient h;
    public Paint f4709i;
    public org.telegram.ui.Components.t5 f4710j;
    public org.telegram.ui.Components.h6 f4711k;
    public final RectF f4712l;
    public final org.telegram.ui.Components.xc f4713m;

    public h1(i1 i1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f4712l = new RectF();
        this.f4713m = new org.telegram.ui.Components.xc(i1Var);
        this.f4704a = tL_starGiftUnique.f22257id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f4705b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22034id;
        }
        this.f4706c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f4707f = new td(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f7 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f4707f.f5491c.set(f7, f7, f10, f10);
    }
}
