package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class era extends ClickableSpan {
    public final long a;
    public final wsa b;

    public era(wsa wsaVar, long j) {
        this.b = wsaVar;
        this.a = j;
    }

    @Override
    public final void onClick(View view) {
        this.b.Y1(this.a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
