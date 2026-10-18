package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class ec extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f1263a;
    public final long f1264b;

    public ec(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10) {
        this.f1263a = f3VarArr;
        this.f1264b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1263a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(sn.W9(this.f1264b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
