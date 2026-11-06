package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class d5 extends ClickableSpan {
    public final long f3652a;
    public final k7 f3653b;

    public d5(k7 k7Var, long j3) {
        this.f3653b = k7Var;
        this.f3652a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f3653b.U1(this.f3652a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
