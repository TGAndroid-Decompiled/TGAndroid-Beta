package jh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c9 extends ClickableSpan {
    public final w7 f11885a;

    public c9(w7 w7Var) {
        this.f11885a = w7Var;
    }

    @Override
    public final void onClick(View view) {
        this.f11885a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
