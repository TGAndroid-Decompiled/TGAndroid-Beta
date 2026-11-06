package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c5 extends ClickableSpan {
    public final long f3567a;
    public final k7 f3568b;

    public c5(k7 k7Var, long j3) {
        this.f3568b = k7Var;
        this.f3567a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f3568b.U1(this.f3567a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
