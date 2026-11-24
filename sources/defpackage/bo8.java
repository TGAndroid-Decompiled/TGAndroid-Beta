package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class bo8 extends URLSpan {
    public final String a;
    public final ko8 b;

    public bo8(ko8 ko8Var, String str, String str2) {
        super(str);
        this.b = ko8Var;
        this.a = str2;
    }

    @Override
    public final void onClick(View view) {
        d01.t(this.b.e.getParentActivity(), this.a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
