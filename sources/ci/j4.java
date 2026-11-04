package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class j4 extends ClickableSpan {
    public final boolean[] f5334a;
    public final int f5335b;
    public final Context f5336c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long f5337e;
    public final String f5338f;
    public final String h;

    public j4(boolean[] zArr, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, String str2) {
        this.f5334a = zArr;
        this.f5335b = i3;
        this.f5336c = context;
        this.d = e6Var;
        this.f5337e = j10;
        this.f5338f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f5334a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i3 = this.f5335b;
        o0 o0Var = new o0(zArr, i3, this.f5336c, this.d, 1);
        long j10 = this.f5337e;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        String str = this.f5338f;
        if (i10 != 0) {
            o0Var.a(Long.valueOf(j10), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i3).sendRequest(getuniquestargift, new ai.f3(7, o0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
