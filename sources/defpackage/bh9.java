package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class bh9 {
    public final ne9 a;
    public final int b;
    public final int c;
    public final qh9 d;
    public final TL_iv.RichText e;
    public final ch9 f;

    public bh9(ch9 ch9Var, ne9 ne9Var, int i, int i2, qh9 qh9Var) {
        TL_iv.textButton textbutton;
        this.f = ch9Var;
        this.a = ne9Var;
        this.b = i;
        this.c = i2;
        this.d = qh9Var;
        if (qh9Var != null && (textbutton = qh9Var.a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = zk9.f(new SpannableStringBuilder(ne9Var.getText().subSequence(i, i2)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        ne9 ne9Var;
        Editable text;
        int i;
        TL_iv.textButton textbutton;
        if (qh9.c(inlineButtonType) && (text = (ne9Var = this.a).getText()) != null && (i = this.b) >= 0) {
            int length = text.length();
            int i2 = this.c;
            if (i2 <= length && i < i2) {
                ch9 ch9Var = this.f;
                of9 of9Var = ch9Var.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                qg9 qg9Var = ch9Var.v3;
                if (qg9Var != null) {
                    qg9Var.e(false);
                }
                ne9Var.setLocked(false);
                for (qh9 qh9Var : (qh9[]) text.getSpans(i, i2, qh9.class)) {
                    text.removeSpan(qh9Var);
                }
                zk9.n(text, i, i2);
                zk9.m(text, i, i2);
                qh9 qh9Var2 = this.d;
                if (qh9Var2 == null || (textbutton = qh9Var2.a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                qh9 qh9Var3 = new qh9(textbutton);
                qh9Var3.a(ch9Var.n3, ch9Var.o3, ne9Var);
                text.setSpan(qh9Var3, i, i2, 33);
                qh9Var3.d(text);
                ne9Var.setSelection(Math.min(i2, ne9Var.length()));
                ch9Var.Q3 = true;
                try {
                    ou3 ou3Var = ne9Var.T1;
                    if (ou3Var != null) {
                        ou3Var.m();
                    }
                    ne9Var.v2 = true;
                    ne9Var.invalidate();
                    ne9Var.requestLayout();
                    ne9Var.f();
                    ch9Var.Q3 = false;
                    of9 of9Var2 = ch9Var.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                    ch9Var.p3.onContentChanged();
                } catch (Throwable th) {
                    ch9Var.Q3 = false;
                    throw th;
                }
            }
        }
    }
}
