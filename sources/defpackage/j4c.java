package defpackage;

import android.text.TextPaint;
public final class j4c extends g4c {
    public final int e;
    public final vib f;

    public j4c(String str, int i, vib vibVar) {
        super(str, (vib) null);
        this.e = i;
        this.f = vibVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.e;
        if (i == 3) {
            textPaint.setColor(bkb.w0(null, bkb.I6, false));
        } else if (i == 2) {
            textPaint.setColor(-1);
        } else if (i == 1) {
            textPaint.setColor(bkb.w0(null, bkb.Xc, false));
        } else {
            textPaint.setColor(bkb.w0(null, bkb.Wc, false));
        }
        vib vibVar = this.f;
        if (vibVar != null) {
            vibVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
