package ii;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class w3 {
    public final i1 f12765a;
    public final int f12766b;
    public final int f12767c;
    public final m4 d;
    public final TL_iv.RichText f12768e;
    public final x3 f12769f;

    public w3(x3 x3Var, i1 i1Var, int i10, int i11, m4 m4Var) {
        TL_iv.textButton textbutton;
        this.f12769f = x3Var;
        this.f12765a = i1Var;
        this.f12766b = i10;
        this.f12767c = i11;
        this.d = m4Var;
        if (m4Var != null && (textbutton = m4Var.f12569a) != null) {
            this.f12768e = textbutton.text;
        } else {
            this.f12768e = h6.f(new SpannableStringBuilder(i1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        i1 i1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (m4.c(inlineButtonType) && (text = (i1Var = this.f12765a).getText()) != null && (i10 = this.f12766b) >= 0) {
            int length = text.length();
            int i11 = this.f12767c;
            if (i11 <= length && i10 < i11) {
                x3 x3Var = this.f12769f;
                i2 i2Var = x3Var.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                k3 k3Var = x3Var.f12819l3;
                if (k3Var != null) {
                    k3Var.f(false);
                }
                i1Var.setLocked(false);
                for (m4 m4Var : (m4[]) text.getSpans(i10, i11, m4.class)) {
                    text.removeSpan(m4Var);
                }
                h6.n(text, i10, i11);
                h6.m(text, i10, i11);
                m4 m4Var2 = this.d;
                if (m4Var2 == null || (textbutton = m4Var2.f12569a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f12768e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                m4 m4Var3 = new m4(textbutton);
                m4Var3.a(x3Var.f12804d3, i1Var, x3Var.f12806e3);
                text.setSpan(m4Var3, i10, i11, 33);
                m4Var3.d(text);
                i1Var.setSelection(Math.min(i11, i1Var.length()));
                x3Var.G3 = true;
                try {
                    i1Var.notifySpansChanged();
                    i1Var.requestLayout();
                    i1Var.invalidateEffects();
                    x3Var.G3 = false;
                    i2 i2Var2 = x3Var.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.f12808f3.onContentChanged();
                } catch (Throwable th2) {
                    x3Var.G3 = false;
                    throw th2;
                }
            }
        }
    }
}
