package hh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class i9 extends ClickableSpan {

    public final org.telegram.ui.ActionBar.e3[] f9494a;

    public final long f9495b;

    public i9(org.telegram.ui.ActionBar.e3[] e3VarArr, long j10) {
        this.f9494a = e3VarArr;
        this.f9495b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f9494a[0].dismiss();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            n2VarU.presentFragment(rn.R9(this.f9495b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
