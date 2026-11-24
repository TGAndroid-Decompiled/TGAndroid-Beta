package defpackage;

import android.text.TextPaint;
public final class d6c extends g6c {
    public static boolean h = true;
    public final int e;
    public final wkb f;

    public d6c(String str, int i, wkb wkbVar) {
        super(str, (wkb) null);
        this.e = i;
        this.f = wkbVar;
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
                    i2 = cmb.Xc;
                } else {
                    i2 = cmb.Vc;
                }
                textPaint.setColor(cmb.w0(null, i2, false));
            } else {
                if (z) {
                    i = cmb.Wc;
                } else {
                    i = cmb.Uc;
                }
                textPaint.setColor(cmb.w0(null, i, false));
            }
        }
        wkb wkbVar = this.f;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
