package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class pa extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f9525a;
    public final long f9526b;

    public pa(org.telegram.ui.ActionBar.w2[] w2VarArr, long j3) {
        this.f9525a = w2VarArr;
        this.f9526b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f9525a[0].dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(bn.ua(this.f9526b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
