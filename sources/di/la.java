package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class la extends ClickableSpan {
    public final org.telegram.ui.ActionBar.u2[] f9011a;
    public final long f9012b;

    public la(org.telegram.ui.ActionBar.u2[] u2VarArr, long j3) {
        this.f9011a = u2VarArr;
        this.f9012b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f9011a[0].dismiss();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(an.ua(this.f9012b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
