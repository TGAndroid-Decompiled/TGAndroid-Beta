package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class ec extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f1260a;
    public final long f1261b;

    public ec(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10) {
        this.f1260a = f3VarArr;
        this.f1261b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1260a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(sn.W9(this.f1261b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
