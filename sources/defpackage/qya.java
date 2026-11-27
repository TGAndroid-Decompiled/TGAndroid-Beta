package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class qya extends ClickableSpan {
    public final nx0[] a;
    public final long b;

    public qya(nx0[] nx0VarArr, long j) {
        this.a = nx0VarArr;
        this.b = j;
    }

    @Override
    public final void onClick(View view) {
        this.a[0].dismiss();
        e S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(zu1.ha(this.b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
