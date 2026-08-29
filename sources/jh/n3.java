package jh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n3 extends ClickableSpan {
    public final long f12506a;
    public final h5 f12507b;

    public n3(h5 h5Var, long j10) {
        this.f12507b = h5Var;
        this.f12506a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12507b.X1(this.f12506a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
