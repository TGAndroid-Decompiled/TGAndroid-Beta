package ci;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class ua extends ClickableSpan {
    public final n9 f6119a;

    public ua(n9 n9Var) {
        this.f6119a = n9Var;
    }

    @Override
    public final void onClick(View view) {
        this.f6119a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
