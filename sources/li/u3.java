package li;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class u3 {
    public final g1 f17511a;
    public final int f17512b;
    public final int f17513c;
    public final k4 d;
    public final TL_iv.RichText e;
    public final v3 f17514f;

    public u3(v3 v3Var, g1 g1Var, int i10, int i11, k4 k4Var) {
        TL_iv.textButton textbutton;
        this.f17514f = v3Var;
        this.f17511a = g1Var;
        this.f17512b = i10;
        this.f17513c = i11;
        this.d = k4Var;
        if (k4Var != null && (textbutton = k4Var.f17329a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = f6.f(new SpannableStringBuilder(g1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        g1 g1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (k4.c(inlineButtonType) && (text = (g1Var = this.f17511a).getText()) != null && (i10 = this.f17512b) >= 0) {
            int length = text.length();
            int i11 = this.f17513c;
            if (i11 <= length && i10 < i11) {
                v3 v3Var = this.f17514f;
                f2 f2Var = v3Var.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                j3 j3Var = v3Var.f17568v3;
                if (j3Var != null) {
                    j3Var.f(false);
                }
                g1Var.setLocked(false);
                for (k4 k4Var : (k4[]) text.getSpans(i10, i11, k4.class)) {
                    text.removeSpan(k4Var);
                }
                f6.n(text, i10, i11);
                f6.m(text, i10, i11);
                k4 k4Var2 = this.d;
                if (k4Var2 == null || (textbutton = k4Var2.f17329a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                k4 k4Var3 = new k4(textbutton);
                k4Var3.a(v3Var.f17552n3, g1Var, v3Var.f17554o3);
                text.setSpan(k4Var3, i10, i11, 33);
                k4Var3.d(text);
                g1Var.setSelection(Math.min(i11, g1Var.length()));
                v3Var.Q3 = true;
                try {
                    g1Var.notifySpansChanged();
                    g1Var.requestLayout();
                    g1Var.invalidateEffects();
                    v3Var.Q3 = false;
                    f2 f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    v3Var.f17556p3.onContentChanged();
                } catch (Throwable th2) {
                    v3Var.Q3 = false;
                    throw th2;
                }
            }
        }
    }
}
