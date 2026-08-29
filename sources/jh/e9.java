package jh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class e9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f12029a;
    public final long f12030b;

    public e9(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10) {
        this.f12029a = f3VarArr;
        this.f12030b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12029a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(tn.R9(this.f12030b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
