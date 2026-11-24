package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class jua extends ClickableSpan {
    public final fx0[] a;
    public final Context b;
    public final boolean c;

    public jua(fx0[] fx0VarArr, Context context, boolean z) {
        this.a = fx0VarArr;
        this.b = context;
        this.c = z;
    }

    @Override
    public final void onClick(View view) {
        int i;
        this.a[0].dismiss();
        if (this.c) {
            i = 2131744690;
        } else {
            i = 2131744687;
        }
        d01.t(this.b, k96.M0(i, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
