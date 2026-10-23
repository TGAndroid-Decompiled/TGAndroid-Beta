package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class dc extends ClickableSpan {
    public final ma f1157a;

    public dc(ma maVar) {
        this.f1157a = maVar;
    }

    @Override
    public final void onClick(View view) {
        this.f1157a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
