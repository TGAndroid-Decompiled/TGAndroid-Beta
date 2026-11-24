package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class i6c extends URLSpan {
    public final wkb a;
    public boolean b;

    public i6c(String str, wkb wkbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = wkbVar;
    }

    @Override
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        l11.r(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wkb wkbVar = this.a;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
            if (textPaint.linkColor == color) {
                z = true;
            } else {
                z = false;
            }
            textPaint.setUnderlineText(z);
        }
    }
}
