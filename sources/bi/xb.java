package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class xb extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f5050a;
    public final Context f5051b;
    public final boolean f5052c;

    public xb(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, boolean z9) {
        this.f5050a = w2VarArr;
        this.f5051b = context;
        this.f5052c = z9;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        this.f5050a[0].dismiss();
        if (this.f5052c) {
            i7 = 2131744927;
        } else {
            i7 = 2131744924;
        }
        vf.c.t(this.f5051b, org.telegram.messenger.id.M0(i7, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
