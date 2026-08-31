package mh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n3 extends ClickableSpan {
    public final long f14471a;
    public final g5 f14472b;

    public n3(g5 g5Var, long j10) {
        this.f14472b = g5Var;
        this.f14471a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f14472b.X1(this.f14471a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
