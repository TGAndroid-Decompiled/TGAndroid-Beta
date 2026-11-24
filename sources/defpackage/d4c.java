package defpackage;

import android.text.TextPaint;
public final class d4c extends g4c {
    public static boolean h = true;
    public final int e;
    public final vib f;

    public d4c(String str, int i, vib vibVar) {
        super(str, (vib) null);
        this.e = i;
        this.f = vibVar;
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
                    i2 = bkb.Xc;
                } else {
                    i2 = bkb.Vc;
                }
                textPaint.setColor(bkb.w0(null, i2, false));
            } else {
                if (z) {
                    i = bkb.Wc;
                } else {
                    i = bkb.Uc;
                }
                textPaint.setColor(bkb.w0(null, i, false));
            }
        }
        vib vibVar = this.f;
        if (vibVar != null) {
            vibVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
