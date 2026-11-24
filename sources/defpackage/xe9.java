package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class xe9 {
    public final mc9 a;
    public final int b;
    public final int c;
    public final mf9 d;
    public final TL_iv.RichText e;
    public final ye9 f;

    public xe9(ye9 ye9Var, mc9 mc9Var, int i, int i2, mf9 mf9Var) {
        TL_iv.textButton textbutton;
        this.f = ye9Var;
        this.a = mc9Var;
        this.b = i;
        this.c = i2;
        this.d = mf9Var;
        if (mf9Var != null && (textbutton = mf9Var.a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = yi9.f(new SpannableStringBuilder(mc9Var.getText().subSequence(i, i2)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        mc9 mc9Var;
        Editable text;
        int i;
        TL_iv.textButton textbutton;
        if (mf9.c(inlineButtonType) && (text = (mc9Var = this.a).getText()) != null && (i = this.b) >= 0) {
            int length = text.length();
            int i2 = this.c;
            if (i2 <= length && i < i2) {
                ye9 ye9Var = this.f;
                ld9 ld9Var = ye9Var.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                me9 me9Var = ye9Var.v3;
                if (me9Var != null) {
                    me9Var.e(false);
                }
                mc9Var.setLocked(false);
                for (mf9 mf9Var : (mf9[]) text.getSpans(i, i2, mf9.class)) {
                    text.removeSpan(mf9Var);
                }
                yi9.n(text, i, i2);
                yi9.m(text, i, i2);
                mf9 mf9Var2 = this.d;
                if (mf9Var2 == null || (textbutton = mf9Var2.a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                mf9 mf9Var3 = new mf9(textbutton);
                mf9Var3.a(ye9Var.n3, ye9Var.o3, mc9Var);
                text.setSpan(mf9Var3, i, i2, 33);
                mf9Var3.d(text);
                mc9Var.setSelection(Math.min(i2, mc9Var.length()));
                ye9Var.Q3 = true;
                try {
                    et3 et3Var = mc9Var.T1;
                    if (et3Var != null) {
                        et3Var.m();
                    }
                    mc9Var.v2 = true;
                    mc9Var.invalidate();
                    mc9Var.requestLayout();
                    mc9Var.f();
                    ye9Var.Q3 = false;
                    ld9 ld9Var2 = ye9Var.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                    ye9Var.p3.onContentChanged();
                } catch (Throwable th) {
                    ye9Var.Q3 = false;
                    throw th;
                }
            }
        }
    }
}
