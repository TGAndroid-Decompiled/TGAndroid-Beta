package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class nr8 extends URLSpan {
    public final String a;
    public final wr8 b;

    public nr8(wr8 wr8Var, String str, String str2) {
        super(str);
        this.b = wr8Var;
        this.a = str2;
    }

    @Override
    public final void onClick(View view) {
        m01.u(this.b.e.getParentActivity(), this.a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
