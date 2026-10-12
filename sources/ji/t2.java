package ji;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class t2 implements r5, f1 {
    public final x3 f13525a;

    public t2(x3 x3Var) {
        this.f13525a = x3Var;
    }

    public void a(h1 h1Var, m4 m4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        x3 x3Var = this.f13525a;
        v3 v3Var = x3Var.f13627f3;
        Editable text = h1Var.getText();
        int i10 = -1;
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(m4Var);
        }
        if (text != null) {
            i10 = text.getSpanEnd(m4Var);
        }
        int i11 = i10;
        if (spanStart >= 0 && i11 > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = m4Var.f13407a;
                if (textbutton != null) {
                    h2 h2Var = x3Var.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    boolean z14 = true;
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
                    if (!z11) {
                        z14 = false;
                    }
                    richButtonStyle.bg_success = z14;
                    richButtonStyle.link = false;
                    textbutton.style = richButtonStyle;
                    Editable text2 = h1Var.getText();
                    if (text2 != null && text2.getSpanStart(m4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = m4Var.f13408b;
                        if (richButtonSpan != null && m4Var.f13409c == h1Var) {
                            richButtonSpan.detach(h1Var);
                            m4Var.f13409c = null;
                        }
                        text2.removeSpan(m4Var);
                        m4 m4Var2 = new m4(textbutton);
                        m4Var2.a(x3Var.f13623d3, h1Var, x3Var.f13625e3);
                        text2.setSpan(m4Var2, spanStart, i11, 33);
                        h1Var.notifySpansChanged();
                        h1Var.requestLayout();
                        h1Var.invalidateEffects();
                        v3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            x3Var.p3(false);
            v3Var.l(new w3(x3Var, h1Var, spanStart, i11, m4Var), h1Var);
        }
    }
}
