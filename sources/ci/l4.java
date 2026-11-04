package ci;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class l4 extends ClickableSpan {
    public final long f5440a;
    public final l6 f5441b;

    public l4(l6 l6Var, long j10) {
        this.f5441b = l6Var;
        this.f5440a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f5441b.U1(this.f5440a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
