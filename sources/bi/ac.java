package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
public final class ac extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f3469a;
    public final long f3470b;

    public ac(org.telegram.ui.ActionBar.w2[] w2VarArr, long j3) {
        this.f3469a = w2VarArr;
        this.f3470b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f3469a[0].dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(cn.ta(this.f3470b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
