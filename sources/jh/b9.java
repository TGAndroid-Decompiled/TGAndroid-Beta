package jh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f11812a;
    public final Context f11813b;
    public final boolean f11814c;

    public b9(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f11812a = f3VarArr;
        this.f11813b = context;
        this.f11814c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f11812a[0].dismiss();
        if (this.f11814c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        ye.d.s(this.f11813b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
