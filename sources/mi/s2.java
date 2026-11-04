package mi;

import android.text.Editable;
import org.telegram.messenger.au;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.vs;
public final class s2 implements k5, f1 {
    public final t3 f19879a;

    public s2(t3 t3Var) {
        this.f19879a = t3Var;
    }

    public void a(h1 h1Var, j4 j4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t3 t3Var = this.f19879a;
        r3 r3Var = t3Var.f19916p3;
        Editable text = h1Var.getText();
        int i3 = -1;
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(j4Var);
        }
        if (text != null) {
            i3 = text.getSpanEnd(j4Var);
        }
        int i10 = i3;
        if (spanStart >= 0 && i10 > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = j4Var.f19703a;
                if (textbutton != null) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    if (richButtonStyle != null && richButtonStyle.bg_primary) {
                        z11 = true;
                    } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                        z11 = true;
                    } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (richButtonStyle == null) {
                        richButtonStyle = new TL_keyboard.RichButtonStyle();
                    }
                    richButtonStyle.flags = 0;
                    if (z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    richButtonStyle.bg_primary = z12;
                    if (z11) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    richButtonStyle.bg_danger = z13;
                    if (z11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    richButtonStyle.bg_success = z14;
                    richButtonStyle.link = false;
                    textbutton.style = richButtonStyle;
                    Editable text2 = h1Var.getText();
                    if (text2 != null && text2.getSpanStart(j4Var) >= 0) {
                        au auVar = j4Var.f19704b;
                        if (auVar != null && j4Var.f19705c == h1Var) {
                            auVar.h = null;
                            auVar.f21585a.f26633a.f(h1Var);
                            j4Var.f19705c = null;
                        }
                        text2.removeSpan(j4Var);
                        j4 j4Var2 = new j4(textbutton);
                        j4Var2.a(t3Var.f19913n3, h1Var, t3Var.f19914o3);
                        text2.setSpan(j4Var2, spanStart, i10, 33);
                        vs vsVar = h1Var.O1;
                        if (vsVar != null) {
                            vsVar.m();
                        }
                        h1Var.f19661q2 = true;
                        h1Var.invalidate();
                        h1Var.requestLayout();
                        h1Var.f();
                        r3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            t3Var.r3(false);
            r3Var.W(new s3(t3Var, h1Var, spanStart, i10, j4Var), h1Var);
        }
    }
}
