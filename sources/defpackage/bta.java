package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class bta extends ClickableSpan {
    public final boolean[] a;
    public final int b;
    public final Context c;
    public final vnb d;
    public final long e;
    public final String f;
    public final String h;

    public bta(boolean[] zArr, int i, Context context, vnb vnbVar, long j, String str, String str2) {
        this.a = zArr;
        this.b = i;
        this.c = context;
        this.d = vnbVar;
        this.e = j;
        this.f = str;
        this.h = str2;
    }

    @Override
    public final void onClick(View view) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i = this.b;
        f fVar = new f(zArr, i, this.c, this.d, (byte) 9);
        long j = this.e;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        String str = this.f;
        if (i2 != 0) {
            fVar.a(Long.valueOf(j), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i).sendRequest(getuniquestargift, new isa(fVar, str, (byte) 1));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
