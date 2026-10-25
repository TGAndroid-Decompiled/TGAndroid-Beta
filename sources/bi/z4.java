package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class z4 extends ClickableSpan {
    public final boolean[] f5824a;
    public final int f5825b;
    public final Context f5826c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final long e;
    public final String f5827f;
    public final String h;

    public z4(boolean[] zArr, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, String str2) {
        this.f5824a = zArr;
        this.f5825b = i10;
        this.f5826c = context;
        this.d = u6Var;
        this.e = j10;
        this.f5827f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.f5824a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i10 = this.f5825b;
        v0 v0Var = new v0(zArr, i10, this.f5826c, this.d, 1);
        long j10 = this.e;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        String str = this.f5827f;
        if (i11 != 0) {
            v0Var.run(Long.valueOf(j10), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new j(5, v0Var, str));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
