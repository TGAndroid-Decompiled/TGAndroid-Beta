package hh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class g9 extends ClickableSpan {

    public final y7 f9341a;

    public g9(y7 y7Var) {
        this.f9341a = y7Var;
    }

    @Override
    public final void onClick(View view) {
        this.f9341a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
