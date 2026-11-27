package defpackage;

import android.text.TextPaint;
public final class g8c extends f8c {
    public g8c(String str) {
        super(str.replace((char) 8238, ' '), (rmb) null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(hl.o());
        textPaint.setUnderlineText(false);
    }
}
