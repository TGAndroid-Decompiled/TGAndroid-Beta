package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class owa extends ClickableSpan {
    public final qva a;

    public owa(qva qvaVar) {
        this.a = qvaVar;
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
