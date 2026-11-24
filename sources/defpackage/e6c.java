package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class e6c extends URLSpan {
    public final wkb a;

    public e6c(String str, wkb wkbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = wkbVar;
    }

    @Override
    public final void onClick(View view) {
        l11.r(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        wkb wkbVar = this.a;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
