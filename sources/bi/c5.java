package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c5 extends ClickableSpan {
    public final long f3570a;
    public final k7 f3571b;

    public c5(k7 k7Var, long j3) {
        this.f3571b = k7Var;
        this.f3570a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f3571b.T1(this.f3570a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
