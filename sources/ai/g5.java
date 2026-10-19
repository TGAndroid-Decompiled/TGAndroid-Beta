package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g5 extends ClickableSpan {
    public final long f1351a;
    public final l7 f1352b;

    public g5(l7 l7Var, long j10) {
        this.f1352b = l7Var;
        this.f1351a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1352b.v2(this.f1351a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
