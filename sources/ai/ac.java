package ai;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ac extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f977a;
    public final Context f978b;
    public final boolean f979c;

    public ac(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f977a = f3VarArr;
        this.f978b = context;
        this.f979c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f977a[0].dismiss();
        if (this.f979c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        pf.d.r(this.f978b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
