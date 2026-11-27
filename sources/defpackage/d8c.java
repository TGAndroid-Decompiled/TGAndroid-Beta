package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class d8c extends URLSpan {
    public final rmb a;

    public d8c(String str, rmb rmbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = rmbVar;
    }

    @Override
    public final void onClick(View view) {
        m01.r(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        rmb rmbVar = this.a;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
