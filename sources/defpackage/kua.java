package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class kua extends ClickableSpan {
    public final nta a;

    public kua(nta ntaVar) {
        this.a = ntaVar;
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
