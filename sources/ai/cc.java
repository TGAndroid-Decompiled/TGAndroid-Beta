package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class cc extends ClickableSpan {
    public final la f1104a;

    public cc(la laVar) {
        this.f1104a = laVar;
    }

    @Override
    public final void onClick(View view) {
        this.f1104a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
