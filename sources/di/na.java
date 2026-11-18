package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class na extends ClickableSpan {
    public final g9 f9387a;

    public na(g9 g9Var) {
        this.f9387a = g9Var;
    }

    @Override
    public final void onClick(View view) {
        this.f9387a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
