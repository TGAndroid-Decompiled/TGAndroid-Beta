package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class pa extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f9562a;
    public final long f9563b;

    public pa(org.telegram.ui.ActionBar.w2[] w2VarArr, long j3) {
        this.f9562a = w2VarArr;
        this.f9563b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f9562a[0].dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(bn.ua(this.f9563b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
