package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vb extends ClickableSpan {
    public final org.telegram.ui.ActionBar.k3[] f5576a;
    public final Context f5577b;
    public final boolean f5578c;

    public vb(org.telegram.ui.ActionBar.k3[] k3VarArr, Context context, boolean z10) {
        this.f5576a = k3VarArr;
        this.f5577b = context;
        this.f5578c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f5576a[0].dismiss();
        if (this.f5578c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        qf.d.r(this.f5577b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
