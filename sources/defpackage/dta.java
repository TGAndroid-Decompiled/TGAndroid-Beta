package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class dta extends ClickableSpan {
    public final long a;
    public final wua b;

    public dta(wua wuaVar, long j) {
        this.b = wuaVar;
        this.a = j;
    }

    @Override
    public final void onClick(View view) {
        this.b.Z1(this.a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
