package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class oya extends ClickableSpan {
    public final qxa a;

    public oya(qxa qxaVar) {
        this.a = qxaVar;
    }

    @Override
    public final void onClick(View view) {
        this.a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
