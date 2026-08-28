package gh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h9 extends ClickableSpan {
    public final z7 f8234a;

    public h9(z7 z7Var) {
        this.f8234a = z7Var;
    }

    @Override
    public final void onClick(View view) {
        this.f8234a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
