package ki;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class t2 implements l5, f1 {
    public final w3 f15520a;

    public t2(w3 w3Var) {
        this.f15520a = w3Var;
    }

    public void a(h1 h1Var, k4 k4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        w3 w3Var = this.f15520a;
        u3 u3Var = w3Var.f15586f3;
        Editable text = h1Var.getText();
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
                TL_iv.textButton textbutton = k4Var.f15356a;
                if (textbutton != null) {
                    h2 h2Var = w3Var.H3;
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
                    if (text2 != null && text2.getSpanStart(k4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.f15357b;
                        if (richButtonSpan != null && k4Var.f15358c == h1Var) {
                            richButtonSpan.detach(h1Var);
                            k4Var.f15358c = null;
                        }
                        text2.removeSpan(k4Var);
                        k4 k4Var2 = new k4(textbutton);
                        k4Var2.a(w3Var.f15582d3, h1Var, w3Var.f15584e3);
                        text2.setSpan(k4Var2, spanStart, i11, 33);
                        h1Var.notifySpansChanged();
                        h1Var.requestLayout();
                        h1Var.invalidateEffects();
                        u3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            w3Var.p3(false);
            u3Var.H(new v3(w3Var, h1Var, spanStart, i11, k4Var), h1Var);
        }
    }
}
