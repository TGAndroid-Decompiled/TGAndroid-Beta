package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n3 extends ClickableSpan {
    public final long f12818a;
    public final g5 f12819b;

    public n3(g5 g5Var, long j10) {
        this.f12819b = g5Var;
        this.f12818a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12819b.X1(this.f12818a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
