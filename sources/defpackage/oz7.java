package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class oz7 extends ClickableSpan {
    public final xz7 a;

    public oz7(xz7 xz7Var) {
        this.a = xz7Var;
    }

    @Override
    public final void onClick(View view) {
        xz7 xz7Var = this.a;
        l11.u(xz7Var.getParentActivity(), xz7Var.E.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(gm.o());
    }
}
