package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c4 extends ClickableSpan {
    public final long f8302a;
    public final c6 f8303b;

    public c4(c6 c6Var, long j3) {
        this.f8303b = c6Var;
        this.f8302a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8303b.V1(this.f8302a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
