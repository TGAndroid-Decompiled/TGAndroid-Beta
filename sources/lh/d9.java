package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class d9 extends ClickableSpan {
    public final x7 f12320a;

    public d9(x7 x7Var) {
        this.f12320a = x7Var;
    }

    @Override
    public final void onClick(View view) {
        this.f12320a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
