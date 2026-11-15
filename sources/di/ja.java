package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.hd;
public final class ja extends ClickableSpan {
    public final org.telegram.ui.ActionBar.u2[] f8866a;
    public final Context f8867b;
    public final boolean f8868c;

    public ja(org.telegram.ui.ActionBar.u2[] u2VarArr, Context context, boolean z10) {
        this.f8866a = u2VarArr;
        this.f8867b = context;
        this.f8868c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f8866a[0].dismiss();
        if (this.f8868c) {
            i7 = 2131744927;
        } else {
            i7 = 2131744924;
        }
        vf.c.t(this.f8867b, hd.M0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
