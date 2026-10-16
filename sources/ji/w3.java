package ji;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class w3 {
    public final h1 f13590a;
    public final int f13591b;
    public final int f13592c;
    public final m4 d;
    public final TL_iv.RichText e;
    public final x3 f13593f;

    public w3(x3 x3Var, h1 h1Var, int i10, int i11, m4 m4Var) {
        TL_iv.textButton textbutton;
        this.f13593f = x3Var;
        this.f13590a = h1Var;
        this.f13591b = i10;
        this.f13592c = i11;
        this.d = m4Var;
        if (m4Var != null && (textbutton = m4Var.f13410a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = k6.f(new SpannableStringBuilder(h1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        h1 h1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (m4.c(inlineButtonType) && (text = (h1Var = this.f13590a).getText()) != null && (i10 = this.f13591b) >= 0) {
            int length = text.length();
            int i11 = this.f13592c;
            if (i11 <= length && i10 < i11) {
                x3 x3Var = this.f13593f;
                h2 h2Var = x3Var.H3;
                if (h2Var != null) {
                    h2Var.d();
                }
                k3 k3Var = x3Var.f13642l3;
                if (k3Var != null) {
                    k3Var.f(false);
                }
                h1Var.setLocked(false);
                for (m4 m4Var : (m4[]) text.getSpans(i10, i11, m4.class)) {
                    text.removeSpan(m4Var);
                }
                k6.n(text, i10, i11);
                k6.m(text, i10, i11);
                m4 m4Var2 = this.d;
                if (m4Var2 == null || (textbutton = m4Var2.f13410a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                m4 m4Var3 = new m4(textbutton);
                m4Var3.a(x3Var.f13626d3, h1Var, x3Var.f13628e3);
                text.setSpan(m4Var3, i10, i11, 33);
                m4Var3.d(text);
                h1Var.setSelection(Math.min(i11, h1Var.length()));
                x3Var.G3 = true;
                try {
                    h1Var.notifySpansChanged();
                    h1Var.requestLayout();
                    h1Var.invalidateEffects();
                    x3Var.G3 = false;
                    h2 h2Var2 = x3Var.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    x3Var.f13630f3.onContentChanged();
                } catch (Throwable th2) {
                    x3Var.G3 = false;
                    throw th2;
                }
            }
        }
    }
}
