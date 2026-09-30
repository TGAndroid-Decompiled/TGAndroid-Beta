package ii;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class w3 {
    public final i1 f11699a;
    public final int f11700b;
    public final int f11701c;
    public final l4 d;
    public final TL_iv.RichText e;
    public final x3 f11702f;

    public w3(x3 x3Var, i1 i1Var, int i10, int i11, l4 l4Var) {
        TL_iv.textButton textbutton;
        this.f11702f = x3Var;
        this.f11699a = i1Var;
        this.f11700b = i10;
        this.f11701c = i11;
        this.d = l4Var;
        if (l4Var != null && (textbutton = l4Var.f11487a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = g6.f(new SpannableStringBuilder(i1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        i1 i1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (l4.c(inlineButtonType) && (text = (i1Var = this.f11699a).getText()) != null && (i10 = this.f11700b) >= 0) {
            int length = text.length();
            int i11 = this.f11701c;
            if (i11 <= length && i10 < i11) {
                x3 x3Var = this.f11702f;
                i2 i2Var = x3Var.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                k3 k3Var = x3Var.f11738n3;
                if (k3Var != null) {
                    k3Var.f(false);
                }
                i1Var.setLocked(false);
                for (l4 l4Var : (l4[]) text.getSpans(i10, i11, l4.class)) {
                    text.removeSpan(l4Var);
                }
                g6.n(text, i10, i11);
                g6.m(text, i10, i11);
                l4 l4Var2 = this.d;
                if (l4Var2 == null || (textbutton = l4Var2.f11487a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                l4 l4Var3 = new l4(textbutton);
                l4Var3.a(x3Var.f11724f3, i1Var, x3Var.f11726g3);
                text.setSpan(l4Var3, i10, i11, 33);
                l4Var3.d(text);
                i1Var.setSelection(Math.min(i11, i1Var.length()));
                x3Var.I3 = true;
                try {
                    i1Var.notifySpansChanged();
                    i1Var.requestLayout();
                    i1Var.invalidateEffects();
                    x3Var.I3 = false;
                    i2 i2Var2 = x3Var.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.f11728h3.onContentChanged();
                } catch (Throwable th2) {
                    x3Var.I3 = false;
                    throw th2;
                }
            }
        }
    }
}
