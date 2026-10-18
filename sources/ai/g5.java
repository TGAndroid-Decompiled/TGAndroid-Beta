package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g5 extends ClickableSpan {
    public final long f1340a;
    public final k7 f1341b;

    public g5(k7 k7Var, long j10) {
        this.f1341b = k7Var;
        this.f1340a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1341b.o2(this.f1340a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
