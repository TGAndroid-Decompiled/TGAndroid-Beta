package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f4 extends ClickableSpan {
    public final long f8750a;
    public final f6 f8751b;

    public f4(f6 f6Var, long j3) {
        this.f8751b = f6Var;
        this.f8750a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f8751b.h2(this.f8750a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
