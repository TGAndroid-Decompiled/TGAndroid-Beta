package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c4 extends ClickableSpan {
    public final long f8301a;
    public final c6 f8302b;

    public c4(c6 c6Var, long j3) {
        this.f8302b = c6Var;
        this.f8301a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8302b.V1(this.f8301a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
