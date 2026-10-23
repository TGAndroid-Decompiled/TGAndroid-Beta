package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h5 extends ClickableSpan {
    public final long f1401a;
    public final l7 f1402b;

    public h5(l7 l7Var, long j10) {
        this.f1402b = l7Var;
        this.f1401a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1402b.u2(this.f1401a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
