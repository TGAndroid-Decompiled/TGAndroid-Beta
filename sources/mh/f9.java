package mh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class f9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f14055a;
    public final long f14056b;

    public f9(org.telegram.ui.ActionBar.h3[] h3VarArr, long j10) {
        this.f14055a = h3VarArr;
        this.f14056b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f14055a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(xn.R9(this.f14056b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
