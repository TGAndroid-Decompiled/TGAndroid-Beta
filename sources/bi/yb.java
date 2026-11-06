package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class yb extends ClickableSpan {
    public final oa f5093a;

    public yb(oa oaVar) {
        this.f5093a = oaVar;
    }

    @Override
    public final void onClick(View view) {
        this.f5093a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
