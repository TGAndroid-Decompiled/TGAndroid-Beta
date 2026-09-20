package ii;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class v3 {
    public final i1 f11692a;
    public final int f11693b;
    public final int f11694c;
    public final k4 d;
    public final TL_iv.RichText e;
    public final w3 f11695f;

    public v3(w3 w3Var, i1 i1Var, int i10, int i11, k4 k4Var) {
        TL_iv.textButton textbutton;
        this.f11695f = w3Var;
        this.f11692a = i1Var;
        this.f11693b = i10;
        this.f11694c = i11;
        this.d = k4Var;
        if (k4Var != null && (textbutton = k4Var.f11477a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = f6.f(new SpannableStringBuilder(i1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        i1 i1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (k4.c(inlineButtonType) && (text = (i1Var = this.f11692a).getText()) != null && (i10 = this.f11693b) >= 0) {
            int length = text.length();
            int i11 = this.f11694c;
            if (i11 <= length && i10 < i11) {
                w3 w3Var = this.f11695f;
                h2 h2Var = w3Var.J3;
                if (h2Var != null) {
                    h2Var.d();
                }
                j3 j3Var = w3Var.f11725n3;
                if (j3Var != null) {
                    j3Var.f(false);
                }
                i1Var.setLocked(false);
                for (k4 k4Var : (k4[]) text.getSpans(i10, i11, k4.class)) {
                    text.removeSpan(k4Var);
                }
                f6.n(text, i10, i11);
                f6.m(text, i10, i11);
                k4 k4Var2 = this.d;
                if (k4Var2 == null || (textbutton = k4Var2.f11477a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                k4 k4Var3 = new k4(textbutton);
                k4Var3.a(w3Var.f11711f3, i1Var, w3Var.f11713g3);
                text.setSpan(k4Var3, i10, i11, 33);
                k4Var3.d(text);
                i1Var.setSelection(Math.min(i11, i1Var.length()));
                w3Var.I3 = true;
                try {
                    i1Var.notifySpansChanged();
                    i1Var.requestLayout();
                    i1Var.invalidateEffects();
                    w3Var.I3 = false;
                    h2 h2Var2 = w3Var.J3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    w3Var.f11715h3.onContentChanged();
                } catch (Throwable th2) {
                    w3Var.I3 = false;
                    throw th2;
                }
            }
        }
    }
}
