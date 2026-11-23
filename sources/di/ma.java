package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.hd;
public final class ma extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f9323a;
    public final Context f9324b;
    public final boolean f9325c;

    public ma(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, boolean z10) {
        this.f9323a = w2VarArr;
        this.f9324b = context;
        this.f9325c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f9323a[0].dismiss();
        if (this.f9325c) {
            i7 = 2131744686;
        } else {
            i7 = 2131744683;
        }
        vf.c.t(this.f9324b, hd.N0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
