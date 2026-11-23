package oi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.kt;
public final class s3 {
    public final f1 f22438a;
    public final int f22439b;
    public final int f22440c;
    public final i4 d;
    public final TL_iv.RichText f22441e;
    public final t3 f22442f;

    public s3(t3 t3Var, f1 f1Var, int i7, int i10, i4 i4Var) {
        TL_iv.textButton textbutton;
        this.f22442f = t3Var;
        this.f22438a = f1Var;
        this.f22439b = i7;
        this.f22440c = i10;
        this.d = i4Var;
        if (i4Var != null && (textbutton = i4Var.f22250a) != null) {
            this.f22441e = textbutton.text;
        } else {
            this.f22441e = c6.f(new SpannableStringBuilder(f1Var.getText().subSequence(i7, i10)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        f1 f1Var;
        Editable text;
        int i7;
        TL_iv.textButton textbutton;
        if (i4.c(inlineButtonType) && (text = (f1Var = this.f22438a).getText()) != null && (i7 = this.f22439b) >= 0) {
            int length = text.length();
            int i10 = this.f22440c;
            if (i10 <= length && i7 < i10) {
                t3 t3Var = this.f22442f;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                h3 h3Var = t3Var.f22507v3;
                if (h3Var != null) {
                    h3Var.f(false);
                }
                f1Var.setLocked(false);
                for (i4 i4Var : (i4[]) text.getSpans(i7, i10, i4.class)) {
                    text.removeSpan(i4Var);
                }
                c6.n(text, i7, i10);
                c6.m(text, i7, i10);
                i4 i4Var2 = this.d;
                if (i4Var2 == null || (textbutton = i4Var2.f22250a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f22441e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                i4 i4Var3 = new i4(textbutton);
                i4Var3.a(t3Var.f22492n3, f1Var, t3Var.f22494o3);
                text.setSpan(i4Var3, i7, i10, 33);
                i4Var3.d(text);
                f1Var.setSelection(Math.min(i10, f1Var.length()));
                t3Var.Q3 = true;
                try {
                    kt ktVar = f1Var.T1;
                    if (ktVar != null) {
                        ktVar.u();
                    }
                    f1Var.f22183v2 = true;
                    f1Var.invalidate();
                    f1Var.requestLayout();
                    f1Var.f();
                    t3Var.Q3 = false;
                    g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var.f22495p3.onContentChanged();
                } catch (Throwable th2) {
                    t3Var.Q3 = false;
                    throw th2;
                }
            }
        }
    }
}
