package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class nya extends ClickableSpan {
    public final nx0[] a;
    public final Context b;
    public final boolean c;

    public nya(nx0[] nx0VarArr, Context context, boolean z) {
        this.a = nx0VarArr;
        this.b = context;
        this.c = z;
    }

    @Override
    public final void onClick(View view) {
        int i;
        this.a[0].dismiss();
        if (this.c) {
            i = 2131744584;
        } else {
            i = 2131744581;
        }
        m01.u(this.b, ob6.M0(i, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
