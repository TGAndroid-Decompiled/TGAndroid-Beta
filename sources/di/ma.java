package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.gd;
public final class ma extends ClickableSpan {
    public final org.telegram.ui.ActionBar.x2[] f9331a;
    public final Context f9332b;
    public final boolean f9333c;

    public ma(org.telegram.ui.ActionBar.x2[] x2VarArr, Context context, boolean z10) {
        this.f9331a = x2VarArr;
        this.f9332b = context;
        this.f9333c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f9331a[0].dismiss();
        if (this.f9333c) {
            i7 = 2131744692;
        } else {
            i7 = 2131744689;
        }
        vf.c.t(this.f9332b, gd.M0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
