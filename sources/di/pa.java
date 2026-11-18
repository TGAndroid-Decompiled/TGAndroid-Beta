package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class pa extends ClickableSpan {
    public final org.telegram.ui.ActionBar.x2[] f9527a;
    public final long f9528b;

    public pa(org.telegram.ui.ActionBar.x2[] x2VarArr, long j3) {
        this.f9527a = x2VarArr;
        this.f9528b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f9527a[0].dismiss();
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(bn.ua(this.f9528b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
