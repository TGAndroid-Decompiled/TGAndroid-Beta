package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h5 extends ClickableSpan {
    public final long f1421a;
    public final l7 f1422b;

    public h5(l7 l7Var, long j10) {
        this.f1422b = l7Var;
        this.f1421a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1422b.v2(this.f1421a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
