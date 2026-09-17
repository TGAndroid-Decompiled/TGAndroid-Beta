package ji;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class s2 implements p5, f1 {
    public final v3 f14160a;

    public s2(v3 v3Var) {
        this.f14160a = v3Var;
    }

    public void a(h1 h1Var, k4 k4Var, boolean z10) {
        int spanStart;
        int spanEnd;
        char c10;
        boolean z11;
        boolean z12;
        v3 v3Var = this.f14160a;
        t3 t3Var = v3Var.f14249h3;
        Editable text = h1Var.getText();
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(k4Var);
        }
        if (text == null) {
            spanEnd = -1;
        } else {
            spanEnd = text.getSpanEnd(k4Var);
        }
        if (spanStart >= 0 && spanEnd > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = k4Var.f14017a;
                if (textbutton != null) {
                    g2 g2Var = v3Var.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    boolean z13 = true;
                    if (richButtonStyle != null && richButtonStyle.bg_primary) {
                        c10 = 2;
                    } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                        c10 = 3;
                    } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (richButtonStyle == null) {
                        richButtonStyle = new TL_keyboard.RichButtonStyle();
                    }
                    richButtonStyle.flags = 0;
                    if (c10 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    richButtonStyle.bg_primary = z11;
                    if (c10 == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    richButtonStyle.bg_danger = z12;
                    if (c10 != 3) {
                        z13 = false;
                    }
                    richButtonStyle.bg_success = z13;
                    richButtonStyle.link = false;
                    textbutton.style = richButtonStyle;
                    Editable text2 = h1Var.getText();
                    if (text2 != null && text2.getSpanStart(k4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.f14018b;
                        if (richButtonSpan != null && k4Var.f14019c == h1Var) {
                            richButtonSpan.detach(h1Var);
                            k4Var.f14019c = null;
                        }
                        text2.removeSpan(k4Var);
                        k4 k4Var2 = new k4(textbutton);
                        k4Var2.a(v3Var.f14245f3, h1Var, v3Var.f14247g3);
                        text2.setSpan(k4Var2, spanStart, spanEnd, 33);
                        h1Var.notifySpansChanged();
                        h1Var.requestLayout();
                        h1Var.invalidateEffects();
                        t3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            v3Var.n3(false);
            t3Var.d(new u3(v3Var, h1Var, spanStart, spanEnd, k4Var), h1Var);
        }
    }
}
