package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class d4 extends ClickableSpan {
    public final long f8393a;
    public final c6 f8394b;

    public d4(c6 c6Var, long j3) {
        this.f8394b = c6Var;
        this.f8393a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8394b.V1(this.f8393a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
