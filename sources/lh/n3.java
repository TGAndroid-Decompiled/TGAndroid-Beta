package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class n3 extends ClickableSpan {
    public final long f12834a;
    public final g5 f12835b;

    public n3(g5 g5Var, long j10) {
        this.f12835b = g5Var;
        this.f12834a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12835b.X1(this.f12834a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
