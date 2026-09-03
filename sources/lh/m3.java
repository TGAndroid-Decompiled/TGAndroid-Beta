package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class m3 extends ClickableSpan {
    public final long f12778a;
    public final g5 f12779b;

    public m3(g5 g5Var, long j10) {
        this.f12779b = g5Var;
        this.f12778a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12779b.X1(this.f12778a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
