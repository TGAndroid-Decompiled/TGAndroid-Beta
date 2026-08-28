package gh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class o3 extends ClickableSpan {
    public final long f8666a;
    public final k5 f8667b;

    public o3(k5 k5Var, long j10) {
        this.f8667b = k5Var;
        this.f8666a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f8667b.X1(this.f8666a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
