package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g4 extends ClickableSpan {
    public final long f8860a;
    public final f6 f8861b;

    public g4(f6 f6Var, long j3) {
        this.f8861b = f6Var;
        this.f8860a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8861b.h2(this.f8860a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
