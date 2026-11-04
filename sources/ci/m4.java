package ci;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class m4 extends ClickableSpan {
    public final long f5538a;
    public final l6 f5539b;

    public m4(l6 l6Var, long j10) {
        this.f5539b = l6Var;
        this.f5538a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f5539b.U1(this.f5538a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
