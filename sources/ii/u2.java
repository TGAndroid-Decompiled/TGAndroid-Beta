package ii;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class u2 implements n5, g1 {
    public final x3 f12729a;

    public u2(x3 x3Var) {
        this.f12729a = x3Var;
    }

    public void a(i1 i1Var, m4 m4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        x3 x3Var = this.f12729a;
        v3 v3Var = x3Var.f12808f3;
        Editable text = i1Var.getText();
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
                TL_iv.textButton textbutton = m4Var.f12569a;
                if (textbutton != null) {
                    i2 i2Var = x3Var.H3;
                    if (i2Var != null) {
                        i2Var.d();
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
                    Editable text2 = i1Var.getText();
                    if (text2 != null && text2.getSpanStart(m4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = m4Var.f12570b;
                        if (richButtonSpan != null && m4Var.f12571c == i1Var) {
                            richButtonSpan.detach(i1Var);
                            m4Var.f12571c = null;
                        }
                        text2.removeSpan(m4Var);
                        m4 m4Var2 = new m4(textbutton);
                        m4Var2.a(x3Var.f12804d3, i1Var, x3Var.f12806e3);
                        text2.setSpan(m4Var2, spanStart, i11, 33);
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
            x3Var.p3(false);
            v3Var.e(new w3(x3Var, i1Var, spanStart, i11, m4Var), i1Var);
        }
    }
}
