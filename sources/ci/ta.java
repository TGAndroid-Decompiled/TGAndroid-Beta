package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.bd;
public final class ta extends ClickableSpan {
    public final org.telegram.ui.ActionBar.t2[] f6046a;
    public final Context f6047b;
    public final boolean f6048c;

    public ta(org.telegram.ui.ActionBar.t2[] t2VarArr, Context context, boolean z10) {
        this.f6046a = t2VarArr;
        this.f6047b = context;
        this.f6048c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        this.f6046a[0].dismiss();
        if (this.f6048c) {
            i3 = 2131744937;
        } else {
            i3 = 2131744934;
        }
        sf.c.t(this.f6047b, bd.M0(i3, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
