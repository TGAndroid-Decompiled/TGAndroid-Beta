package oi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.dt;
public final class p3 {
    public final e1 f21874a;
    public final int f21875b;
    public final int f21876c;
    public final f4 d;
    public final TL_iv.RichText f21877e;
    public final q3 f21878f;

    public p3(q3 q3Var, e1 e1Var, int i7, int i10, f4 f4Var) {
        TL_iv.textButton textbutton;
        this.f21878f = q3Var;
        this.f21874a = e1Var;
        this.f21875b = i7;
        this.f21876c = i10;
        this.d = f4Var;
        if (f4Var != null && (textbutton = f4Var.f21697a) != null) {
            this.f21877e = textbutton.text;
        } else {
            this.f21877e = a6.f(new SpannableStringBuilder(e1Var.getText().subSequence(i7, i10)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        e1 e1Var;
        Editable text;
        int i7;
        TL_iv.textButton textbutton;
        if (f4.c(inlineButtonType) && (text = (e1Var = this.f21874a).getText()) != null && (i7 = this.f21875b) >= 0) {
            int length = text.length();
            int i10 = this.f21876c;
            if (i10 <= length && i7 < i10) {
                q3 q3Var = this.f21878f;
                d2 d2Var = q3Var.R3;
                if (d2Var != null) {
                    d2Var.d();
                }
                e3 e3Var = q3Var.f21943v3;
                if (e3Var != null) {
                    e3Var.f(false);
                }
                e1Var.setLocked(false);
                for (f4 f4Var : (f4[]) text.getSpans(i7, i10, f4.class)) {
                    text.removeSpan(f4Var);
                }
                a6.n(text, i7, i10);
                a6.m(text, i7, i10);
                f4 f4Var2 = this.d;
                if (f4Var2 == null || (textbutton = f4Var2.f21697a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f21877e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                f4 f4Var3 = new f4(textbutton);
                f4Var3.a(q3Var.f21928n3, e1Var, q3Var.f21930o3);
                text.setSpan(f4Var3, i7, i10, 33);
                f4Var3.d(text);
                e1Var.setSelection(Math.min(i10, e1Var.length()));
                q3Var.Q3 = true;
                try {
                    dt dtVar = e1Var.T1;
                    if (dtVar != null) {
                        dtVar.E();
                    }
                    e1Var.f21670v2 = true;
                    e1Var.invalidate();
                    e1Var.requestLayout();
                    e1Var.f();
                    q3Var.Q3 = false;
                    d2 d2Var2 = q3Var.R3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    q3Var.f21931p3.onContentChanged();
                } catch (Throwable th2) {
                    q3Var.Q3 = false;
                    throw th2;
                }
            }
        }
    }
}
