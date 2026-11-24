package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class mua extends ClickableSpan {
    public final fx0[] a;
    public final long b;

    public mua(fx0[] fx0VarArr, long j) {
        this.a = fx0VarArr;
        this.b = j;
    }

    @Override
    public final void onClick(View view) {
        this.a[0].dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(mu1.W9(this.b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
