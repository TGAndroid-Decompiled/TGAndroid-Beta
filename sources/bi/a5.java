package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class a5 extends ClickableSpan {
    public final boolean[] f3449a;
    public final int f3450b;
    public final Context f3451c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final long f3452e;
    public final String f3453f;
    public final String h;

    public a5(boolean[] zArr, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, String str, String str2) {
        this.f3449a = zArr;
        this.f3450b = i7;
        this.f3451c = context;
        this.d = h6Var;
        this.f3452e = j3;
        this.f3453f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f3449a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i7 = this.f3450b;
        v0 v0Var = new v0(zArr, i7, this.f3451c, this.d, 1);
        long j3 = this.f3452e;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        String str = this.f3453f;
        if (i10 != 0) {
            v0Var.a(Long.valueOf(j3), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new j(5, v0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
