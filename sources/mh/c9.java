package mh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f13843a;
    public final Context f13844b;
    public final boolean f13845c;

    public c9(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, boolean z4) {
        this.f13843a = h3VarArr;
        this.f13844b = context;
        this.f13845c = z4;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f13843a[0].dismiss();
        if (this.f13845c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        af.g.s(this.f13844b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
