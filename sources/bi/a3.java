package bi;

import android.text.Editable;
import org.telegram.messenger.uu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.kt;
public final class a3 implements w5, l1 {
    public final d4 f2839a;

    public a3(d4 d4Var) {
        this.f2839a = d4Var;
    }

    public void a(n1 n1Var, u4 u4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        d4 d4Var = this.f2839a;
        b4 b4Var = d4Var.f2938o3;
        Editable text = n1Var.getText();
        int i10 = -1;
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(u4Var);
        }
        if (text != null) {
            i10 = text.getSpanEnd(u4Var);
        }
        int i11 = i10;
        if (spanStart >= 0 && i11 > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = u4Var.f3385a;
                if (textbutton != null) {
                    o2 o2Var = d4Var.Q3;
                    if (o2Var != null) {
                        o2Var.d();
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
                    Editable text2 = n1Var.getText();
                    if (text2 != null && text2.getSpanStart(u4Var) >= 0) {
                        uu uuVar = u4Var.f3386b;
                        if (uuVar != null && u4Var.f3387c == n1Var) {
                            uuVar.h = null;
                            uuVar.f18476a.f18144a.f(n1Var);
                            u4Var.f3387c = null;
                        }
                        text2.removeSpan(u4Var);
                        u4 u4Var2 = new u4(textbutton);
                        u4Var2.a(d4Var.f2934m3, n1Var, d4Var.f2936n3);
                        text2.setSpan(u4Var2, spanStart, i11, 33);
                        kt ktVar = n1Var.N1;
                        if (ktVar != null) {
                            ktVar.m();
                        }
                        n1Var.f3231p2 = true;
                        n1Var.invalidate();
                        n1Var.requestLayout();
                        n1Var.f();
                        b4Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            d4Var.r3(false);
            b4Var.N(new c4(d4Var, n1Var, spanStart, i11, u4Var), n1Var);
        }
    }
}
