package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.gd;
public final class ma extends ClickableSpan {
    public final org.telegram.ui.ActionBar.x2[] f9334a;
    public final Context f9335b;
    public final boolean f9336c;

    public ma(org.telegram.ui.ActionBar.x2[] x2VarArr, Context context, boolean z10) {
        this.f9334a = x2VarArr;
        this.f9335b = context;
        this.f9336c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f9334a[0].dismiss();
        if (this.f9336c) {
            i7 = 2131744692;
        } else {
            i7 = 2131744689;
        }
        vf.c.t(this.f9335b, gd.M0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
