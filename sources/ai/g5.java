package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g5 extends ClickableSpan {
    public final long f1342a;
    public final k7 f1343b;

    public g5(k7 k7Var, long j10) {
        this.f1343b = k7Var;
        this.f1342a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1343b.o2(this.f1342a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
