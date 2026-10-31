package bi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.kt;
public final class c4 {
    public final n1 f2898a;
    public final int f2899b;
    public final int f2900c;
    public final u4 d;
    public final TL_iv.RichText e;
    public final d4 f2901f;

    public c4(d4 d4Var, n1 n1Var, int i10, int i11, u4 u4Var) {
        TL_iv.textButton textbutton;
        this.f2901f = d4Var;
        this.f2898a = n1Var;
        this.f2899b = i10;
        this.f2900c = i11;
        this.d = u4Var;
        if (u4Var != null && (textbutton = u4Var.f3385a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = s6.f(new SpannableStringBuilder(n1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        n1 n1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (u4.c(inlineButtonType) && (text = (n1Var = this.f2898a).getText()) != null && (i10 = this.f2899b) >= 0) {
            int length = text.length();
            int i11 = this.f2900c;
            if (i11 <= length && i10 < i11) {
                d4 d4Var = this.f2901f;
                o2 o2Var = d4Var.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                q3 q3Var = d4Var.f2950u3;
                if (q3Var != null) {
                    q3Var.f(false);
                }
                n1Var.setLocked(false);
                for (u4 u4Var : (u4[]) text.getSpans(i10, i11, u4.class)) {
                    text.removeSpan(u4Var);
                }
                s6.n(text, i10, i11);
                s6.m(text, i10, i11);
                u4 u4Var2 = this.d;
                if (u4Var2 == null || (textbutton = u4Var2.f3385a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                u4 u4Var3 = new u4(textbutton);
                u4Var3.a(d4Var.f2934m3, n1Var, d4Var.f2936n3);
                text.setSpan(u4Var3, i10, i11, 33);
                u4Var3.d(text);
                n1Var.setSelection(Math.min(i11, n1Var.length()));
                d4Var.P3 = true;
                try {
                    kt ktVar = n1Var.N1;
                    if (ktVar != null) {
                        ktVar.m();
                    }
                    n1Var.f3231p2 = true;
                    n1Var.invalidate();
                    n1Var.requestLayout();
                    n1Var.f();
                    d4Var.P3 = false;
                    o2 o2Var2 = d4Var.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    d4Var.f2938o3.onContentChanged();
                } catch (Throwable th2) {
                    d4Var.P3 = false;
                    throw th2;
                }
            }
        }
    }
}
