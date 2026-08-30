package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class m3 extends ClickableSpan {
    public final long f12794a;
    public final g5 f12795b;

    public m3(g5 g5Var, long j10) {
        this.f12795b = g5Var;
        this.f12794a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12795b.X1(this.f12794a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
