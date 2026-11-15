package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class a4 extends ClickableSpan {
    public final boolean[] f8191a;
    public final int f8192b;
    public final Context f8193c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long f8194e;
    public final String f8195f;
    public final String h;

    public a4(boolean[] zArr, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, String str2) {
        this.f8191a = zArr;
        this.f8192b = i7;
        this.f8193c = context;
        this.d = e6Var;
        this.f8194e = j3;
        this.f8195f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f8191a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i7 = this.f8192b;
        k0 k0Var = new k0(zArr, i7, this.f8193c, this.d, 1);
        long j3 = this.f8194e;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        String str = this.f8195f;
        if (i10 != 0) {
            k0Var.a(Long.valueOf(j3), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new bi.v2(7, k0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
