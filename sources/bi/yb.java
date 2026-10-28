package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class yb extends ClickableSpan {
    public final org.telegram.ui.ActionBar.k3[] f5779a;
    public final long f5780b;

    public yb(org.telegram.ui.ActionBar.k3[] k3VarArr, long j10) {
        this.f5779a = k3VarArr;
        this.f5780b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f5779a[0].dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(wn.ea(this.f5780b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
