package ji;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class u3 {
    public final h1 f14241a;
    public final int f14242b;
    public final int f14243c;
    public final k4 d;
    public final TL_iv.RichText f14244e;
    public final v3 f14245f;

    public u3(v3 v3Var, h1 h1Var, int i10, int i11, k4 k4Var) {
        TL_iv.textButton textbutton;
        this.f14245f = v3Var;
        this.f14241a = h1Var;
        this.f14242b = i10;
        this.f14243c = i11;
        this.d = k4Var;
        if (k4Var != null && (textbutton = k4Var.f14043a) != null) {
            this.f14244e = textbutton.text;
        } else {
            this.f14244e = i6.f(new SpannableStringBuilder(h1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        h1 h1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (k4.c(inlineButtonType) && (text = (h1Var = this.f14241a).getText()) != null && (i10 = this.f14242b) >= 0) {
            int length = text.length();
            int i11 = this.f14243c;
            if (i11 <= length && i10 < i11) {
                v3 v3Var = this.f14245f;
                g2 g2Var = v3Var.J3;
                if (g2Var != null) {
                    g2Var.d();
                }
                i3 i3Var = v3Var.f14285n3;
                if (i3Var != null) {
                    i3Var.f(false);
                }
                h1Var.setLocked(false);
                for (k4 k4Var : (k4[]) text.getSpans(i10, i11, k4.class)) {
                    text.removeSpan(k4Var);
                }
                i6.n(text, i10, i11);
                i6.m(text, i10, i11);
                k4 k4Var2 = this.d;
                if (k4Var2 == null || (textbutton = k4Var2.f14043a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f14244e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                k4 k4Var3 = new k4(textbutton);
                k4Var3.a(v3Var.f14271f3, h1Var, v3Var.f14273g3);
                text.setSpan(k4Var3, i10, i11, 33);
                k4Var3.d(text);
                h1Var.setSelection(Math.min(i11, h1Var.length()));
                v3Var.I3 = true;
                try {
                    h1Var.notifySpansChanged();
                    h1Var.requestLayout();
                    h1Var.invalidateEffects();
                    v3Var.I3 = false;
                    g2 g2Var2 = v3Var.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    v3Var.f14275h3.onContentChanged();
                } catch (Throwable th2) {
                    v3Var.I3 = false;
                    throw th2;
                }
            }
        }
    }
}
