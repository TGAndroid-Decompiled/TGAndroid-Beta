package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class i4c extends URLSpan {
    public final vib a;
    public boolean b;

    public i4c(String str, vib vibVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = vibVar;
    }

    @Override
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        d01.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vib vibVar = this.a;
        if (vibVar != null) {
            vibVar.a(textPaint);
            if (textPaint.linkColor == color) {
                z = true;
            } else {
                z = false;
            }
            textPaint.setUnderlineText(z);
        }
    }
}
