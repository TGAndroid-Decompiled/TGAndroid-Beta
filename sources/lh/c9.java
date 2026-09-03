package lh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f12243a;
    public final Context f12244b;
    public final boolean f12245c;

    public c9(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, boolean z4) {
        this.f12243a = g3VarArr;
        this.f12244b = context;
        this.f12245c = z4;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f12243a[0].dismiss();
        if (this.f12245c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        ze.d.s(this.f12244b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
