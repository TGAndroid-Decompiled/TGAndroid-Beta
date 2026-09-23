package ii;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class u2 implements m5, g1 {
    public final x3 f11651a;

    public u2(x3 x3Var) {
        this.f11651a = x3Var;
    }

    public void a(i1 i1Var, l4 l4Var, boolean z10) {
        int spanStart;
        int spanEnd;
        char c10;
        boolean z11;
        boolean z12;
        x3 x3Var = this.f11651a;
        v3 v3Var = x3Var.f11728h3;
        Editable text = i1Var.getText();
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(l4Var);
        }
        if (text == null) {
            spanEnd = -1;
        } else {
            spanEnd = text.getSpanEnd(l4Var);
        }
        if (spanStart >= 0 && spanEnd > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = l4Var.f11487a;
                if (textbutton != null) {
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
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
                    if (text2 != null && text2.getSpanStart(l4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = l4Var.f11488b;
                        if (richButtonSpan != null && l4Var.f11489c == i1Var) {
                            richButtonSpan.detach(i1Var);
                            l4Var.f11489c = null;
                        }
                        text2.removeSpan(l4Var);
                        l4 l4Var2 = new l4(textbutton);
                        l4Var2.a(x3Var.f11724f3, i1Var, x3Var.f11726g3);
                        text2.setSpan(l4Var2, spanStart, spanEnd, 33);
                        i1Var.notifySpansChanged();
                        i1Var.requestLayout();
                        i1Var.invalidateEffects();
                        v3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            x3Var.o3(false);
            v3Var.d(new w3(x3Var, i1Var, spanStart, spanEnd, l4Var), i1Var);
        }
    }
}
