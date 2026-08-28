package gh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pc;
public final class u0 {
    public final long f8934a;
    public final TLRPC.Document f8935b;
    public final long f8936c;
    public final int d;
    public final String f8937e;
    public bb f8938f;
    public int f8939g = -1;
    public RadialGradient h;
    public Paint f8940i;
    public org.telegram.ui.Components.k5 f8941j;
    public org.telegram.ui.Components.y5 f8942k;
    public final RectF f8943l;
    public final pc f8944m;

    public u0(v0 v0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long j10;
        new Matrix();
        this.f8943l = new RectF();
        this.f8944m = new pc(v0Var);
        this.f8934a = tL_starGiftUnique.f22607id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.f8935b = document;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f22386id;
        }
        this.f8936c = j10;
        this.d = ((TL_stars.starGiftAttributeBackdrop) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.f8937e = tL_starGiftUnique.slug;
        this.f8938f = new bb(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f10 = (-dp) / 2.0f;
        float f11 = dp / 2.0f;
        this.f8938f.f7879c.set(f10, f10, f11, f11);
    }
}
