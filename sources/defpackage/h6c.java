package defpackage;

import android.text.TextPaint;
public final class h6c extends g6c {
    public h6c(String str) {
        super(str.replace((char) 8238, ' '), (wkb) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(gm.o());
        textPaint.setUnderlineText(false);
    }
}
