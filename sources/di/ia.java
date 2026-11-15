package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.hd;
public final class ia extends ClickableSpan {
    public final org.telegram.ui.ActionBar.u2[] f8813a;
    public final Context f8814b;
    public final boolean f8815c;

    public ia(org.telegram.ui.ActionBar.u2[] u2VarArr, Context context, boolean z10) {
        this.f8813a = u2VarArr;
        this.f8814b = context;
        this.f8815c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f8813a[0].dismiss();
        if (this.f8815c) {
            i7 = 2131744927;
        } else {
            i7 = 2131744924;
        }
        vf.c.t(this.f8814b, hd.M0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
