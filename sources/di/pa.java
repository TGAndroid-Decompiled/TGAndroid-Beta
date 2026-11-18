package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class pa extends ClickableSpan {
    public final org.telegram.ui.ActionBar.x2[] f9524a;
    public final long f9525b;

    public pa(org.telegram.ui.ActionBar.x2[] x2VarArr, long j3) {
        this.f9524a = x2VarArr;
        this.f9525b = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f9524a[0].dismiss();
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(bn.ua(this.f9525b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
