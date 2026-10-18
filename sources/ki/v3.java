package ki;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class v3 {
    public final h1 f15576a;
    public final int f15577b;
    public final int f15578c;
    public final k4 d;
    public final TL_iv.RichText e;
    public final w3 f15579f;

    public v3(w3 w3Var, h1 h1Var, int i10, int i11, k4 k4Var) {
        TL_iv.textButton textbutton;
        this.f15579f = w3Var;
        this.f15576a = h1Var;
        this.f15577b = i10;
        this.f15578c = i11;
        this.d = k4Var;
        if (k4Var != null && (textbutton = k4Var.f15363a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = e6.f(new SpannableStringBuilder(h1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        h1 h1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (k4.c(inlineButtonType) && (text = (h1Var = this.f15576a).getText()) != null && (i10 = this.f15577b) >= 0) {
            int length = text.length();
            int i11 = this.f15578c;
            if (i11 <= length && i10 < i11) {
                w3 w3Var = this.f15579f;
                h2 h2Var = w3Var.H3;
                if (h2Var != null) {
                    h2Var.d();
                }
                j3 j3Var = w3Var.f15605l3;
                if (j3Var != null) {
                    j3Var.f(false);
                }
                h1Var.setLocked(false);
                for (k4 k4Var : (k4[]) text.getSpans(i10, i11, k4.class)) {
                    text.removeSpan(k4Var);
                }
                e6.n(text, i10, i11);
                e6.m(text, i10, i11);
                k4 k4Var2 = this.d;
                if (k4Var2 == null || (textbutton = k4Var2.f15363a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                k4 k4Var3 = new k4(textbutton);
                k4Var3.a(w3Var.f15589d3, h1Var, w3Var.f15591e3);
                text.setSpan(k4Var3, i10, i11, 33);
                k4Var3.d(text);
                h1Var.setSelection(Math.min(i11, h1Var.length()));
                w3Var.G3 = true;
                try {
                    h1Var.notifySpansChanged();
                    h1Var.requestLayout();
                    h1Var.invalidateEffects();
                    w3Var.G3 = false;
                    h2 h2Var2 = w3Var.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    w3Var.f15593f3.onContentChanged();
                } catch (Throwable th2) {
                    w3Var.G3 = false;
                    throw th2;
                }
            }
        }
    }
}
