package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class c4 extends ClickableSpan {
    public final boolean[] f8625a;
    public final int f8626b;
    public final Context f8627c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final long f8628e;
    public final String f8629f;
    public final String h;

    public c4(boolean[] zArr, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, String str, String str2) {
        this.f8625a = zArr;
        this.f8626b = i7;
        this.f8627c = context;
        this.d = h6Var;
        this.f8628e = j3;
        this.f8629f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f8625a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i7 = this.f8626b;
        j0 j0Var = new j0(zArr, i7, this.f8627c, this.d, 1);
        long j3 = this.f8628e;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        String str = this.f8629f;
        if (i10 != 0) {
            j0Var.a(Long.valueOf(j3), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new bi.o1(8, j0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
