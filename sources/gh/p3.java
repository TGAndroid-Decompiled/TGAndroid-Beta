package gh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p3 extends ClickableSpan {
    public final long f8709a;
    public final k5 f8710b;

    public p3(k5 k5Var, long j10) {
        this.f8710b = k5Var;
        this.f8709a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f8710b.X1(this.f8709a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
