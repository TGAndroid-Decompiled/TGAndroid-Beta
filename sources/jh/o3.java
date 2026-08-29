package jh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o3 extends ClickableSpan {
    public final long f12540a;
    public final h5 f12541b;

    public o3(h5 h5Var, long j10) {
        this.f12541b = h5Var;
        this.f12540a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12541b.X1(this.f12540a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
