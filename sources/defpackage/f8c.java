package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class f8c extends URLSpan {
    public final boolean a;
    public final rmb b;
    public TLObject c;
    public String d;

    public f8c(String str, rmb rmbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = rmbVar;
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            m01.r(view.getContext(), Uri.parse("https://t.me/".concat(url.substring(1))), true, true);
            return;
        }
        m01.u(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z;
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        rmb rmbVar = this.b;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        }
        if (i == color && !this.a) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setUnderlineText(z);
    }

    public f8c(String str, int i) {
        this(str, (rmb) null);
        this.a = true;
    }

    public f8c(String str) {
        this(str, (rmb) null);
    }
}
