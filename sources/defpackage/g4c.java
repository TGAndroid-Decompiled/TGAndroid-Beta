package defpackage;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class g4c extends URLSpan {
    public final boolean a;
    public final vib b;
    public TLObject c;
    public String d;

    public g4c(String str, vib vibVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = vibVar;
    }

    @Override
    public void onClick(View view) {
        String url = getURL();
        if (url.startsWith("@")) {
            d01.q(view.getContext(), Uri.parse("https://t.me/".concat(url.substring(1))), true, true);
            return;
        }
        d01.t(view.getContext(), url);
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        boolean z;
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vib vibVar = this.b;
        if (vibVar != null) {
            vibVar.a(textPaint);
        }
        if (i == color && !this.a) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setUnderlineText(z);
    }

    public g4c(String str, int i) {
        this(str, (vib) null);
        this.a = true;
    }

    public g4c(String str) {
        this(str, (vib) null);
    }
}
