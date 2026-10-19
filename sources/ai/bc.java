package ai;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bc extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f1043a;
    public final Context f1044b;
    public final boolean f1045c;

    public bc(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f1043a = f3VarArr;
        this.f1044b = context;
        this.f1045c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f1043a[0].dismiss();
        if (this.f1045c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        pf.d.r(this.f1044b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
