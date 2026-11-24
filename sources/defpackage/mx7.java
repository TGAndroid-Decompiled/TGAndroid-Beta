package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class mx7 extends ClickableSpan {
    public final vx7 a;

    public mx7(vx7 vx7Var) {
        this.a = vx7Var;
    }

    @Override
    public final void onClick(View view) {
        vx7 vx7Var = this.a;
        d01.t(vx7Var.getParentActivity(), vx7Var.E.privacy_policy_url);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(gl.o());
    }
}
