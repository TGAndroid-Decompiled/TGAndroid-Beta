package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class na extends ClickableSpan {
    public final h9 f9418a;

    public na(h9 h9Var) {
        this.f9418a = h9Var;
    }

    @Override
    public final void onClick(View view) {
        this.f9418a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
