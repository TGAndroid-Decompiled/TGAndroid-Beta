package ci;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class wa extends ClickableSpan {
    public final org.telegram.ui.ActionBar.t2[] f6272a;
    public final long f6273b;

    public wa(org.telegram.ui.ActionBar.t2[] t2VarArr, long j10) {
        this.f6272a = t2VarArr;
        this.f6273b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f6272a[0].dismiss();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(wm.ra(this.f6273b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
