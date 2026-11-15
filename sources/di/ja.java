package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class ja extends ClickableSpan {
    public final d9 f8877a;

    public ja(d9 d9Var) {
        this.f8877a = d9Var;
    }

    @Override
    public final void onClick(View view) {
        this.f8877a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
