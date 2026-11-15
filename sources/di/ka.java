package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class ka extends ClickableSpan {
    public final e9 f8932a;

    public ka(e9 e9Var) {
        this.f8932a = e9Var;
    }

    @Override
    public final void onClick(View view) {
        this.f8932a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
