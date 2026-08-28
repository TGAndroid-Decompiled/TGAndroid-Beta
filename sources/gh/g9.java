package gh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f8161a;
    public final Context f8162b;
    public final boolean f8163c;

    public g9(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f8161a = f3VarArr;
        this.f8162b = context;
        this.f8163c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        this.f8161a[0].dismiss();
        if (this.f8163c) {
            i9 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i9 = R.string.StarsTransactionUnknownLink;
        }
        ve.e.s(this.f8162b, LocaleController.getString(i9));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
