package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class f9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f12440a;
    public final long f12441b;

    public f9(org.telegram.ui.ActionBar.g3[] g3VarArr, long j10) {
        this.f12440a = g3VarArr;
        this.f12441b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12440a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(xn.R9(this.f12441b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
