package hi;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class w2 implements o5, i1 {
    public final z3 f9924a;

    public w2(z3 z3Var) {
        this.f9924a = z3Var;
    }

    public void a(k1 k1Var, n4 n4Var, boolean z10) {
        int spanStart;
        int spanEnd;
        char c10;
        boolean z11;
        boolean z12;
        z3 z3Var = this.f9924a;
        x3 x3Var = z3Var.f10001h3;
        Editable text = k1Var.getText();
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(n4Var);
        }
        if (text == null) {
            spanEnd = -1;
        } else {
            spanEnd = text.getSpanEnd(n4Var);
        }
        if (spanStart >= 0 && spanEnd > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = n4Var.f9758a;
                if (textbutton != null) {
                    k2 k2Var = z3Var.J3;
                    if (k2Var != null) {
                        k2Var.d();
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
                    Editable text2 = k1Var.getText();
                    if (text2 != null && text2.getSpanStart(n4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = n4Var.f9759b;
                        if (richButtonSpan != null && n4Var.f9760c == k1Var) {
                            richButtonSpan.detach(k1Var);
                            n4Var.f9760c = null;
                        }
                        text2.removeSpan(n4Var);
                        n4 n4Var2 = new n4(textbutton);
                        n4Var2.a(z3Var.f9997f3, k1Var, z3Var.f9999g3);
                        text2.setSpan(n4Var2, spanStart, spanEnd, 33);
                        k1Var.notifySpansChanged();
                        k1Var.requestLayout();
                        k1Var.invalidateEffects();
                        x3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            z3Var.n3(false);
            x3Var.o(new y3(z3Var, k1Var, spanStart, spanEnd, n4Var), k1Var);
        }
    }
}
