package li;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class r2 implements m5, e1 {
    public final v3 f17441a;

    public r2(v3 v3Var) {
        this.f17441a = v3Var;
    }

    public void a(g1 g1Var, k4 k4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        v3 v3Var = this.f17441a;
        t3 t3Var = v3Var.f17556p3;
        Editable text = g1Var.getText();
        int i10 = -1;
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(k4Var);
        }
        if (text != null) {
            i10 = text.getSpanEnd(k4Var);
        }
        int i11 = i10;
        if (spanStart >= 0 && i11 > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = k4Var.f17329a;
                if (textbutton != null) {
                    f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.d();
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
                    Editable text2 = g1Var.getText();
                    if (text2 != null && text2.getSpanStart(k4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.f17330b;
                        if (richButtonSpan != null && k4Var.f17331c == g1Var) {
                            richButtonSpan.detach(g1Var);
                            k4Var.f17331c = null;
                        }
                        text2.removeSpan(k4Var);
                        k4 k4Var2 = new k4(textbutton);
                        k4Var2.a(v3Var.f17552n3, g1Var, v3Var.f17554o3);
                        text2.setSpan(k4Var2, spanStart, i11, 33);
                        g1Var.notifySpansChanged();
                        g1Var.requestLayout();
                        g1Var.invalidateEffects();
                        t3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            v3Var.u3(false);
            t3Var.i(new u3(v3Var, g1Var, spanStart, i11, k4Var), g1Var);
        }
    }
}
