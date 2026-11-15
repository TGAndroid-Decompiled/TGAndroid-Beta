package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class d4 extends ClickableSpan {
    public final long f8401a;
    public final c6 f8402b;

    public d4(c6 c6Var, long j3) {
        this.f8402b = c6Var;
        this.f8401a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8402b.V1(this.f8401a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
