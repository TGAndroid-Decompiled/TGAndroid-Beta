package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class wb extends ClickableSpan {
    public final ma f5623a;

    public wb(ma maVar) {
        this.f5623a = maVar;
    }

    @Override
    public final void onClick(View view) {
        this.f5623a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
