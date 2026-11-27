package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class h8c extends URLSpan {
    public final rmb a;
    public boolean b;

    public h8c(String str, rmb rmbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = rmbVar;
    }

    @Override
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        m01.r(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        rmb rmbVar = this.a;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
            if (textPaint.linkColor == color) {
                z = true;
            } else {
                z = false;
            }
            textPaint.setUnderlineText(z);
        }
    }
}
