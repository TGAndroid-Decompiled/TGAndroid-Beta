package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class epa extends ClickableSpan {
    public final long a;
    public final vqa b;

    public epa(vqa vqaVar, long j) {
        this.b = vqaVar;
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
