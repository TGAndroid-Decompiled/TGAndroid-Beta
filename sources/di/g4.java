package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g4 extends ClickableSpan {
    public final long f8890a;
    public final f6 f8891b;

    public g4(f6 f6Var, long j3) {
        this.f8891b = f6Var;
        this.f8890a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8891b.h2(this.f8890a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
