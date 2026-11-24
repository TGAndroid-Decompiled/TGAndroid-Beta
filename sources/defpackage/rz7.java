package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.p;
public final class rz7 extends ClickableSpan {
    public final p a;

    public rz7(p pVar) {
        this.a = pVar;
    }

    @Override
    public final void onClick(View view) {
        p pVar = this.a;
        pVar.presentFragment(new p3c(6, pVar.b0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
