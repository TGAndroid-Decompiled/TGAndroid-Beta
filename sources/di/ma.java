package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.gd;
public final class ma extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f9319a;
    public final Context f9320b;
    public final boolean f9321c;

    public ma(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, boolean z10) {
        this.f9319a = w2VarArr;
        this.f9320b = context;
        this.f9321c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f9319a[0].dismiss();
        if (this.f9321c) {
            i7 = 2131744686;
        } else {
            i7 = 2131744683;
        }
        vf.c.t(this.f9320b, gd.N0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
