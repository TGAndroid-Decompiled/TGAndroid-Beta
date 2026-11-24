package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class nwa extends ClickableSpan {
    public final my0[] a;
    public final Context b;
    public final boolean c;

    public nwa(my0[] my0VarArr, Context context, boolean z) {
        this.a = my0VarArr;
        this.b = context;
        this.c = z;
    }

    @Override
    public final void onClick(View view) {
        int i;
        this.a[0].dismiss();
        if (this.c) {
            i = 2131744616;
        } else {
            i = 2131744613;
        }
        l11.u(this.b, jb6.M0(i, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
