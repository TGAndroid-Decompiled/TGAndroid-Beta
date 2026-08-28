package gh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class j9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f8355a;
    public final long f8356b;

    public j9(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10) {
        this.f8355a = f3VarArr;
        this.f8356b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f8355a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(qn.R9(this.f8356b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
