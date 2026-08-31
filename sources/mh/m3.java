package mh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class m3 extends ClickableSpan {
    public final long f14445a;
    public final g5 f14446b;

    public m3(g5 g5Var, long j10) {
        this.f14446b = g5Var;
        this.f14445a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f14446b.X1(this.f14445a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
