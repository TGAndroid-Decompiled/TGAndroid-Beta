package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class fc extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f1324a;
    public final long f1325b;

    public fc(org.telegram.ui.ActionBar.h3[] h3VarArr, long j10) {
        this.f1324a = h3VarArr;
        this.f1325b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f1324a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(sn.W9(this.f1325b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
