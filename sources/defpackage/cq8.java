package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class cq8 extends URLSpan {
    public final String a;
    public final lq8 b;

    public cq8(lq8 lq8Var, String str, String str2) {
        super(str);
        this.b = lq8Var;
        this.a = str2;
    }

    @Override
    public final void onClick(View view) {
        l11.u(this.b.e.getParentActivity(), this.a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
