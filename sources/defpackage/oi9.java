package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class oi9 {
    public final dg9 a;
    public final int b;
    public final int c;
    public final dj9 d;
    public final TL_iv.RichText e;
    public final pi9 f;

    public oi9(pi9 pi9Var, dg9 dg9Var, int i, int i2, dj9 dj9Var) {
        TL_iv.textButton textbutton;
        this.f = pi9Var;
        this.a = dg9Var;
        this.b = i;
        this.c = i2;
        this.d = dj9Var;
        if (dj9Var != null && (textbutton = dj9Var.a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = mm9.f(new SpannableStringBuilder(dg9Var.getText().subSequence(i, i2)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        dg9 dg9Var;
        Editable text;
        int i;
        TL_iv.textButton textbutton;
        if (dj9.c(inlineButtonType) && (text = (dg9Var = this.a).getText()) != null && (i = this.b) >= 0) {
            int length = text.length();
            int i2 = this.c;
            if (i2 <= length && i < i2) {
                pi9 pi9Var = this.f;
                ch9 ch9Var = pi9Var.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                di9 di9Var = pi9Var.v3;
                if (di9Var != null) {
                    di9Var.e(false);
                }
                dg9Var.setLocked(false);
                for (dj9 dj9Var : (dj9[]) text.getSpans(i, i2, dj9.class)) {
                    text.removeSpan(dj9Var);
                }
                mm9.n(text, i, i2);
                mm9.m(text, i, i2);
                dj9 dj9Var2 = this.d;
                if (dj9Var2 == null || (textbutton = dj9Var2.a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                dj9 dj9Var3 = new dj9(textbutton);
                dj9Var3.a(pi9Var.n3, pi9Var.o3, dg9Var);
                text.setSpan(dj9Var3, i, i2, 33);
                dj9Var3.d(text);
                dg9Var.setSelection(Math.min(i2, dg9Var.length()));
                pi9Var.Q3 = true;
                try {
                    vt3 vt3Var = dg9Var.U1;
                    if (vt3Var != null) {
                        vt3Var.c();
                    }
                    dg9Var.w2 = true;
                    dg9Var.invalidate();
                    dg9Var.requestLayout();
                    dg9Var.f();
                    pi9Var.Q3 = false;
                    ch9 ch9Var2 = pi9Var.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                    pi9Var.p3.onContentChanged();
                } catch (Throwable th) {
                    pi9Var.Q3 = false;
                    throw th;
                }
            }
        }
    }
}
