package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f4 extends ClickableSpan {
    public final long f8786a;
    public final f6 f8787b;

    public f4(f6 f6Var, long j3) {
        this.f8787b = f6Var;
        this.f8786a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8787b.h2(this.f8786a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
