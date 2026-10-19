package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f5 extends ClickableSpan {
    public final long f1278a;
    public final k7 f1279b;

    public f5(k7 k7Var, long j10) {
        this.f1279b = k7Var;
        this.f1278a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1279b.v2(this.f1278a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
