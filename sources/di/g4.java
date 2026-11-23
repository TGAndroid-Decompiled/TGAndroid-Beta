package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g4 extends ClickableSpan {
    public final long f8851a;
    public final f6 f8852b;

    public g4(f6 f6Var, long j3) {
        this.f8852b = f6Var;
        this.f8851a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8852b.h2(this.f8851a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
