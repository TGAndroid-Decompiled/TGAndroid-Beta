package defpackage;

import android.text.TextPaint;
public final class h4c extends g4c {
    public h4c(String str) {
        super(str.replace((char) 8238, ' '), (vib) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(gl.o());
        textPaint.setUnderlineText(false);
    }
}
