package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g4 extends ClickableSpan {
    public final long f8887a;
    public final f6 f8888b;

    public g4(f6 f6Var, long j3) {
        this.f8888b = f6Var;
        this.f8887a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8888b.h2(this.f8887a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
