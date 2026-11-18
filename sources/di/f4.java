package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f4 extends ClickableSpan {
    public final long f8765a;
    public final f6 f8766b;

    public f4(f6 f6Var, long j3) {
        this.f8766b = f6Var;
        this.f8765a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8766b.h2(this.f8765a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
