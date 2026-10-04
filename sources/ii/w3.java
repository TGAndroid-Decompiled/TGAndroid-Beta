package ii;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class w3 {
    public final i1 f12719a;
    public final int f12720b;
    public final int f12721c;
    public final l4 d;
    public final TL_iv.RichText f12722e;
    public final x3 f12723f;

    public w3(x3 x3Var, i1 i1Var, int i10, int i11, l4 l4Var) {
        TL_iv.textButton textbutton;
        this.f12723f = x3Var;
        this.f12719a = i1Var;
        this.f12720b = i10;
        this.f12721c = i11;
        this.d = l4Var;
        if (l4Var != null && (textbutton = l4Var.f12509a) != null) {
            this.f12722e = textbutton.text;
        } else {
            this.f12722e = h6.f(new SpannableStringBuilder(i1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        i1 i1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (l4.c(inlineButtonType) && (text = (i1Var = this.f12719a).getText()) != null && (i10 = this.f12720b) >= 0) {
            int length = text.length();
            int i11 = this.f12721c;
            if (i11 <= length && i10 < i11) {
                x3 x3Var = this.f12723f;
                i2 i2Var = x3Var.Q3;
                if (i2Var != null) {
                    i2Var.d();
                }
                k3 k3Var = x3Var.f12782u3;
                if (k3Var != null) {
                    k3Var.f(false);
                }
                i1Var.setLocked(false);
                for (l4 l4Var : (l4[]) text.getSpans(i10, i11, l4.class)) {
                    text.removeSpan(l4Var);
                }
                h6.n(text, i10, i11);
                h6.m(text, i10, i11);
                l4 l4Var2 = this.d;
                if (l4Var2 == null || (textbutton = l4Var2.f12509a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f12722e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                l4 l4Var3 = new l4(textbutton);
                l4Var3.a(x3Var.f12766m3, i1Var, x3Var.f12768n3);
                text.setSpan(l4Var3, i10, i11, 33);
                l4Var3.d(text);
                i1Var.setSelection(Math.min(i11, i1Var.length()));
                x3Var.P3 = true;
                try {
                    i1Var.notifySpansChanged();
                    i1Var.requestLayout();
                    i1Var.invalidateEffects();
                    x3Var.P3 = false;
                    i2 i2Var2 = x3Var.Q3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.f12770o3.onContentChanged();
                } catch (Throwable th2) {
                    x3Var.P3 = false;
                    throw th2;
                }
            }
        }
    }
}
