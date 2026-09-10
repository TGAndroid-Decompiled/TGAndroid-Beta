package hi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class y3 {
    public final k1 f9980a;
    public final int f9981b;
    public final int f9982c;
    public final n4 d;
    public final TL_iv.RichText e;
    public final z3 f9983f;

    public y3(z3 z3Var, k1 k1Var, int i10, int i11, n4 n4Var) {
        TL_iv.textButton textbutton;
        this.f9983f = z3Var;
        this.f9980a = k1Var;
        this.f9981b = i10;
        this.f9982c = i11;
        this.d = n4Var;
        if (n4Var != null && (textbutton = n4Var.f9758a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = i6.f(new SpannableStringBuilder(k1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        k1 k1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (n4.c(inlineButtonType) && (text = (k1Var = this.f9980a).getText()) != null && (i10 = this.f9981b) >= 0) {
            int length = text.length();
            int i11 = this.f9982c;
            if (i11 <= length && i10 < i11) {
                z3 z3Var = this.f9983f;
                k2 k2Var = z3Var.J3;
                if (k2Var != null) {
                    k2Var.d();
                }
                m3 m3Var = z3Var.f10011n3;
                if (m3Var != null) {
                    m3Var.f(false);
                }
                k1Var.setLocked(false);
                for (n4 n4Var : (n4[]) text.getSpans(i10, i11, n4.class)) {
                    text.removeSpan(n4Var);
                }
                i6.n(text, i10, i11);
                i6.m(text, i10, i11);
                n4 n4Var2 = this.d;
                if (n4Var2 == null || (textbutton = n4Var2.f9758a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                n4 n4Var3 = new n4(textbutton);
                n4Var3.a(z3Var.f9997f3, k1Var, z3Var.f9999g3);
                text.setSpan(n4Var3, i10, i11, 33);
                n4Var3.d(text);
                k1Var.setSelection(Math.min(i11, k1Var.length()));
                z3Var.I3 = true;
                try {
                    k1Var.notifySpansChanged();
                    k1Var.requestLayout();
                    k1Var.invalidateEffects();
                    z3Var.I3 = false;
                    k2 k2Var2 = z3Var.J3;
                    if (k2Var2 != null) {
                        k2Var2.h();
                    }
                    z3Var.f10001h3.onContentChanged();
                } catch (Throwable th2) {
                    z3Var.I3 = false;
                    throw th2;
                }
            }
        }
    }
}
