package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b5 extends ClickableSpan {
    public final long f4338a;
    public final h7 f4339b;

    public b5(h7 h7Var, long j10) {
        this.f4339b = h7Var;
        this.f4338a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f4339b.u2(this.f4338a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
