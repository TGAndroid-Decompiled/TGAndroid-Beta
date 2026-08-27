package hh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nc;

public final class u0 {

    public final long f10119a;

    public final TLRPC.Document f10120b;

    public final long f10121c;
    public final int d;

    public final String f10122e;

    public bb f10123f;

    public int f10124g = -1;
    public RadialGradient h;

    public Paint f10125i;

    public org.telegram.ui.Components.k5 f10126j;

    public org.telegram.ui.Components.y5 f10127k;

    public final RectF f10128l;

    public final nc f10129m;

    public u0(v0 v0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        new Matrix();
        this.f10128l = new RectF();
        this.f10129m = new nc(v0Var);
        this.f10119a = tL_starGiftUnique.f22607id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f10120b = document;
        this.f10121c = document == null ? 0L : document.f22386id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f10122e = tL_starGiftUnique.slug;
        this.f10123f = new bb(1, 6);
        float fDp = AndroidUtilities.dp(36.0f);
        float f10 = (-fDp) / 2.0f;
        float f11 = fDp / 2.0f;
        this.f10123f.f9034c.set(f10, f10, f11, f11);
    }
}
