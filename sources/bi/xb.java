package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class xb extends ClickableSpan {
    public final org.telegram.ui.ActionBar.v2[] f5045a;
    public final Context f5046b;
    public final boolean f5047c;

    public xb(org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, boolean z9) {
        this.f5045a = v2VarArr;
        this.f5046b = context;
        this.f5047c = z9;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f5045a[0].dismiss();
        if (this.f5047c) {
            i7 = 2131744927;
        } else {
            i7 = 2131744924;
        }
        vf.c.t(this.f5046b, org.telegram.messenger.id.M0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
