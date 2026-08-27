package hh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class o3 extends ClickableSpan {

    public final long f9822a;

    public final i5 f9823b;

    public o3(i5 i5Var, long j10) {
        this.f9823b = i5Var;
        this.f9822a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f9823b.X1(this.f9822a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
