package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class qwa extends ClickableSpan {
    public final my0[] a;
    public final long b;

    public qwa(my0[] my0VarArr, long j) {
        this.a = my0VarArr;
        this.b = j;
    }

    @Override
    public final void onClick(View view) {
        this.a[0].dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(yv1.ga(this.b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
