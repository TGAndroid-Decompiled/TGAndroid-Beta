package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class c4 extends ClickableSpan {
    public final boolean[] f8600a;
    public final int f8601b;
    public final Context f8602c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final long f8603e;
    public final String f8604f;
    public final String h;

    public c4(boolean[] zArr, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, String str, String str2) {
        this.f8600a = zArr;
        this.f8601b = i7;
        this.f8602c = context;
        this.d = i6Var;
        this.f8603e = j3;
        this.f8604f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f8600a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i7 = this.f8601b;
        j0 j0Var = new j0(zArr, i7, this.f8602c, this.d, 1);
        long j3 = this.f8603e;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        String str = this.f8604f;
        if (i10 != 0) {
            j0Var.a(Long.valueOf(j3), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new bi.k1(8, j0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
