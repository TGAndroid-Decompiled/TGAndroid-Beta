package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class bc extends ClickableSpan {
    public final ka f1051a;

    public bc(ka kaVar) {
        this.f1051a = kaVar;
    }

    @Override
    public final void onClick(View view) {
        this.f1051a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
