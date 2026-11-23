package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.hd;
public final class ma extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f9358a;
    public final Context f9359b;
    public final boolean f9360c;

    public ma(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, boolean z10) {
        this.f9358a = w2VarArr;
        this.f9359b = context;
        this.f9360c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f9358a[0].dismiss();
        if (this.f9360c) {
            i7 = 2131744684;
        } else {
            i7 = 2131744681;
        }
        vf.c.t(this.f9359b, hd.N0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
