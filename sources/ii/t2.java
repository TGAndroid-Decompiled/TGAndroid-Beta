package ii;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class t2 implements l5, g1 {
    public final w3 f11628a;

    public t2(w3 w3Var) {
        this.f11628a = w3Var;
    }

    public void a(i1 i1Var, k4 k4Var, boolean z10) {
        int spanStart;
        int spanEnd;
        char c10;
        boolean z11;
        boolean z12;
        w3 w3Var = this.f11628a;
        u3 u3Var = w3Var.f11711h3;
        Editable text = i1Var.getText();
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
                TL_iv.textButton textbutton = k4Var.f11473a;
                if (textbutton != null) {
                    h2 h2Var = w3Var.J3;
                    if (h2Var != null) {
                        h2Var.d();
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
                    Editable text2 = i1Var.getText();
                    if (text2 != null && text2.getSpanStart(k4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.f11474b;
                        if (richButtonSpan != null && k4Var.f11475c == i1Var) {
                            richButtonSpan.detach(i1Var);
                            k4Var.f11475c = null;
                        }
                        text2.removeSpan(k4Var);
                        k4 k4Var2 = new k4(textbutton);
                        k4Var2.a(w3Var.f11707f3, i1Var, w3Var.f11709g3);
                        text2.setSpan(k4Var2, spanStart, spanEnd, 33);
                        i1Var.notifySpansChanged();
                        i1Var.requestLayout();
                        i1Var.invalidateEffects();
                        u3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            w3Var.o3(false);
            u3Var.d(new v3(w3Var, i1Var, spanStart, spanEnd, k4Var), i1Var);
        }
    }
}
