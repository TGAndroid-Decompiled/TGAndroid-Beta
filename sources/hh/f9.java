package hh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class f9 extends ClickableSpan {

    public final org.telegram.ui.ActionBar.e3[] f9284a;

    public final Context f9285b;

    public final boolean f9286c;

    public f9(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.f9284a = e3VarArr;
        this.f9285b = context;
        this.f9286c = z10;
    }

    @Override
    public final void onClick(View view) {
        this.f9284a[0].dismiss();
        we.e.s(this.f9285b, LocaleController.getString(this.f9286c ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
