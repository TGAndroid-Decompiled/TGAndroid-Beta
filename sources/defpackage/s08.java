package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class s08 extends ClickableSpan {
    public final b18 a;

    public s08(b18 b18Var) {
        this.a = b18Var;
    }

    @Override
    public final void onClick(View view) {
        b18 b18Var = this.a;
        m01.u(b18Var.getParentActivity(), b18Var.E.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(hl.o());
    }
}
