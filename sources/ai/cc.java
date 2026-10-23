package ai;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cc extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f1108a;
    public final Context f1109b;
    public final boolean f1110c;

    public cc(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, boolean z10) {
        this.f1108a = h3VarArr;
        this.f1109b = context;
        this.f1110c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f1108a[0].dismiss();
        if (this.f1110c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        pf.d.r(this.f1109b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
