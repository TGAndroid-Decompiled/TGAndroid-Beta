package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class ac extends ClickableSpan {
    public final org.telegram.ui.ActionBar.v2[] f3466a;
    public final long f3467b;

    public ac(org.telegram.ui.ActionBar.v2[] v2VarArr, long j3) {
        this.f3466a = v2VarArr;
        this.f3467b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f3466a[0].dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(an.ra(this.f3467b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
