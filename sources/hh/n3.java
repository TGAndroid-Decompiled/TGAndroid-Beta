package hh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class n3 extends ClickableSpan {

    public final long f9779a;

    public final i5 f9780b;

    public n3(i5 i5Var, long j10) {
        this.f9780b = i5Var;
        this.f9779a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f9780b.X1(this.f9779a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
