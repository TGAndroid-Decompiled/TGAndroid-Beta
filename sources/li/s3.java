package li;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ws;
public final class s3 {
    public final g1 f18833a;
    public final int f18834b;
    public final int f18835c;
    public final i4 d;
    public final TL_iv.RichText f18836e;
    public final t3 f18837f;

    public s3(t3 t3Var, g1 g1Var, int i7, int i10, i4 i4Var) {
        TL_iv.textButton textbutton;
        this.f18837f = t3Var;
        this.f18833a = g1Var;
        this.f18834b = i7;
        this.f18835c = i10;
        this.d = i4Var;
        if (i4Var != null && (textbutton = i4Var.f18638a) != null) {
            this.f18836e = textbutton.text;
        } else {
            this.f18836e = c6.f(new SpannableStringBuilder(g1Var.getText().subSequence(i7, i10)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        g1 g1Var;
        Editable text;
        int i7;
        TL_iv.textButton textbutton;
        if (i4.c(inlineButtonType) && (text = (g1Var = this.f18833a).getText()) != null && (i7 = this.f18834b) >= 0) {
            int length = text.length();
            int i10 = this.f18835c;
            if (i10 <= length && i7 < i10) {
                t3 t3Var = this.f18837f;
                f2 f2Var = t3Var.Q3;
                if (f2Var != null) {
                    f2Var.d();
                }
                g3 g3Var = t3Var.f18898u3;
                if (g3Var != null) {
                    g3Var.f(false);
                }
                g1Var.setLocked(false);
                for (i4 i4Var : (i4[]) text.getSpans(i7, i10, i4.class)) {
                    text.removeSpan(i4Var);
                }
                c6.n(text, i7, i10);
                c6.m(text, i7, i10);
                i4 i4Var2 = this.d;
                if (i4Var2 == null || (textbutton = i4Var2.f18638a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f18836e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                i4 i4Var3 = new i4(textbutton);
                i4Var3.a(t3Var.f18883m3, g1Var, t3Var.f18885n3);
                text.setSpan(i4Var3, i7, i10, 33);
                i4Var3.d(text);
                g1Var.setSelection(Math.min(i10, g1Var.length()));
                t3Var.P3 = true;
                try {
                    ws wsVar = g1Var.N1;
                    if (wsVar != null) {
                        wsVar.m();
                    }
                    g1Var.f18595p2 = true;
                    g1Var.invalidate();
                    g1Var.requestLayout();
                    g1Var.f();
                    t3Var.P3 = false;
                    f2 f2Var2 = t3Var.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    t3Var.f18887o3.onContentChanged();
                } catch (Throwable th2) {
                    t3Var.P3 = false;
                    throw th2;
                }
            }
        }
    }
}
