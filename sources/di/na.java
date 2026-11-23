package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class na extends ClickableSpan {
    public final h9 f9379a;

    public na(h9 h9Var) {
        this.f9379a = h9Var;
    }

    @Override
    public final void onClick(View view) {
        this.f9379a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
