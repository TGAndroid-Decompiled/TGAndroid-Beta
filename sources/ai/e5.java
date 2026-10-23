package ai;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class e5 extends ClickableSpan {
    public final boolean[] f1191a;
    public final int f1192b;
    public final Context f1193c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final long e;
    public final String f1194f;
    public final String h;

    public e5(boolean[] zArr, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, String str2) {
        this.f1191a = zArr;
        this.f1192b = i10;
        this.f1193c = context;
        this.d = g6Var;
        this.e = j10;
        this.f1194f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f1191a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i10 = this.f1192b;
        u0 u0Var = new u0(zArr, i10, this.f1193c, this.d, 1);
        long j10 = this.e;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        String str = this.f1194f;
        if (i11 != 0) {
            u0Var.run(Long.valueOf(j10), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new g(4, u0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
