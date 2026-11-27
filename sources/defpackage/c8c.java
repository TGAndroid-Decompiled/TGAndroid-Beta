package defpackage;

import android.text.TextPaint;
public final class c8c extends f8c {
    public static boolean h = true;
    public final int e;
    public final rmb f;

    public c8c(String str, int i, rmb rmbVar) {
        super(str, (rmb) null);
        this.e = i;
        this.f = rmbVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        int i2;
        super.updateDrawState(textPaint);
        int i3 = this.e;
        if (i3 == 2) {
            textPaint.setColor(-1);
        } else {
            boolean z = h;
            if (i3 == 1) {
                if (z) {
                    i2 = aob.Yc;
                } else {
                    i2 = aob.Wc;
                }
                textPaint.setColor(aob.w0(null, i2, false));
            } else {
                if (z) {
                    i = aob.Xc;
                } else {
                    i = aob.Vc;
                }
                textPaint.setColor(aob.w0(null, i, false));
            }
        }
        rmb rmbVar = this.f;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
