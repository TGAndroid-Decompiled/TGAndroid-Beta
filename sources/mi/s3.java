package mi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.vs;
public final class s3 {
    public final h1 f19880a;
    public final int f19881b;
    public final int f19882c;
    public final j4 d;
    public final TL_iv.RichText f19883e;
    public final t3 f19884f;

    public s3(t3 t3Var, h1 h1Var, int i3, int i10, j4 j4Var) {
        TL_iv.textButton textbutton;
        this.f19884f = t3Var;
        this.f19880a = h1Var;
        this.f19881b = i3;
        this.f19882c = i10;
        this.d = j4Var;
        if (j4Var != null && (textbutton = j4Var.f19703a) != null) {
            this.f19883e = textbutton.text;
        } else {
            this.f19883e = d6.f(new SpannableStringBuilder(h1Var.getText().subSequence(i3, i10)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        h1 h1Var;
        Editable text;
        int i3;
        TL_iv.textButton textbutton;
        if (j4.c(inlineButtonType) && (text = (h1Var = this.f19880a).getText()) != null && (i3 = this.f19881b) >= 0) {
            int length = text.length();
            int i10 = this.f19882c;
            if (i10 <= length && i3 < i10) {
                t3 t3Var = this.f19884f;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                h3 h3Var = t3Var.f19928v3;
                if (h3Var != null) {
                    h3Var.f(false);
                }
                h1Var.setLocked(false);
                for (j4 j4Var : (j4[]) text.getSpans(i3, i10, j4.class)) {
                    text.removeSpan(j4Var);
                }
                d6.n(text, i3, i10);
                d6.m(text, i3, i10);
                j4 j4Var2 = this.d;
                if (j4Var2 == null || (textbutton = j4Var2.f19703a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f19883e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                j4 j4Var3 = new j4(textbutton);
                j4Var3.a(t3Var.f19913n3, h1Var, t3Var.f19914o3);
                text.setSpan(j4Var3, i3, i10, 33);
                j4Var3.d(text);
                h1Var.setSelection(Math.min(i10, h1Var.length()));
                t3Var.Q3 = true;
                try {
                    vs vsVar = h1Var.O1;
                    if (vsVar != null) {
                        vsVar.m();
                    }
                    h1Var.f19661q2 = true;
                    h1Var.invalidate();
                    h1Var.requestLayout();
                    h1Var.f();
                    t3Var.Q3 = false;
                    g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var.f19916p3.onContentChanged();
                } catch (Throwable th2) {
                    t3Var.Q3 = false;
                    throw th2;
                }
            }
        }
    }
}
