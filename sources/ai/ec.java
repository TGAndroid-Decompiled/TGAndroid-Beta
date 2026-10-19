package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class ec extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f1259a;
    public final long f1260b;

    public ec(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10) {
        this.f1259a = f3VarArr;
        this.f1260b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1259a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(qn.W9(this.f1260b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
