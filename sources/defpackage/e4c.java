package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class e4c extends URLSpan {
    public final vib a;

    public e4c(String str, vib vibVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = vibVar;
    }

    @Override
    public final void onClick(View view) {
        d01.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        vib vibVar = this.a;
        if (vibVar != null) {
            vibVar.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
