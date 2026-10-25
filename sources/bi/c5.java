package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c5 extends ClickableSpan {
    public final long f4428a;
    public final h7 f4429b;

    public c5(h7 h7Var, long j10) {
        this.f4429b = h7Var;
        this.f4428a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f4429b.u2(this.f4428a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
