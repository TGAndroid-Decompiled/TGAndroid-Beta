package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class g6c extends URLSpan {
    public final boolean a;
    public final wkb b;
    public TLObject c;
    public String d;

    public g6c(String str, wkb wkbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = wkbVar;
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            l11.r(view.getContext(), Uri.parse("https://t.me/".concat(url.substring(1))), true, true);
            return;
        }
        l11.u(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z;
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wkb wkbVar = this.b;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        }
        if (i == color && !this.a) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setUnderlineText(z);
    }

    public g6c(String str, int i) {
        this(str, (wkb) null);
        this.a = true;
    }

    public g6c(String str) {
        this(str, (wkb) null);
    }
}
