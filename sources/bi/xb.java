package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class xb extends ClickableSpan {
    public final org.telegram.ui.ActionBar.v2[] f5047a;
    public final Context f5048b;
    public final boolean f5049c;

    public xb(org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, boolean z9) {
        this.f5047a = v2VarArr;
        this.f5048b = context;
        this.f5049c = z9;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f5047a[0].dismiss();
        if (this.f5049c) {
            i7 = 2131744928;
        } else {
            i7 = 2131744925;
        }
        vf.c.t(this.f5048b, org.telegram.messenger.hd.M0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
