package oi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.mt;
public final class r3 {
    public final e1 f22313a;
    public final int f22314b;
    public final int f22315c;
    public final h4 d;
    public final TL_iv.RichText f22316e;
    public final s3 f22317f;

    public r3(s3 s3Var, e1 e1Var, int i7, int i10, h4 h4Var) {
        TL_iv.textButton textbutton;
        this.f22317f = s3Var;
        this.f22313a = e1Var;
        this.f22314b = i7;
        this.f22315c = i10;
        this.d = h4Var;
        if (h4Var != null && (textbutton = h4Var.f22119a) != null) {
            this.f22316e = textbutton.text;
        } else {
            this.f22316e = b6.f(new SpannableStringBuilder(e1Var.getText().subSequence(i7, i10)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        e1 e1Var;
        Editable text;
        int i7;
        TL_iv.textButton textbutton;
        if (h4.c(inlineButtonType) && (text = (e1Var = this.f22313a).getText()) != null && (i7 = this.f22314b) >= 0) {
            int length = text.length();
            int i10 = this.f22315c;
            if (i10 <= length && i7 < i10) {
                s3 s3Var = this.f22317f;
                e2 e2Var = s3Var.R3;
                if (e2Var != null) {
                    e2Var.d();
                }
                g3 g3Var = s3Var.f22377v3;
                if (g3Var != null) {
                    g3Var.f(false);
                }
                e1Var.setLocked(false);
                for (h4 h4Var : (h4[]) text.getSpans(i7, i10, h4.class)) {
                    text.removeSpan(h4Var);
                }
                b6.n(text, i7, i10);
                b6.m(text, i7, i10);
                h4 h4Var2 = this.d;
                if (h4Var2 == null || (textbutton = h4Var2.f22119a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f22316e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                h4 h4Var3 = new h4(textbutton);
                h4Var3.a(s3Var.f22362n3, e1Var, s3Var.f22364o3);
                text.setSpan(h4Var3, i7, i10, 33);
                h4Var3.d(text);
                e1Var.setSelection(Math.min(i10, e1Var.length()));
                s3Var.Q3 = true;
                try {
                    mt mtVar = e1Var.T1;
                    if (mtVar != null) {
                        mtVar.g();
                    }
                    e1Var.f22053v2 = true;
                    e1Var.invalidate();
                    e1Var.requestLayout();
                    e1Var.f();
                    s3Var.Q3 = false;
                    e2 e2Var2 = s3Var.R3;
                    if (e2Var2 != null) {
                        e2Var2.h();
                    }
                    s3Var.f22365p3.onContentChanged();
                } catch (Throwable th2) {
                    s3Var.Q3 = false;
                    throw th2;
                }
            }
        }
    }
}
