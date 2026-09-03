package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class f9 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f12424a;
    public final long f12425b;

    public f9(org.telegram.ui.ActionBar.g3[] g3VarArr, long j10) {
        this.f12424a = g3VarArr;
        this.f12425b = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f12424a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(zn.R9(this.f12425b));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
