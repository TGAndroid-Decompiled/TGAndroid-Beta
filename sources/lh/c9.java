package lh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f12259a;
    public final Context f12260b;
    public final boolean f12261c;

    public c9(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, boolean z4) {
        this.f12259a = g3VarArr;
        this.f12260b = context;
        this.f12261c = z4;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f12259a[0].dismiss();
        if (this.f12261c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        af.g.s(this.f12260b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
