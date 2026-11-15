package oi;

import android.text.Editable;
import org.telegram.messenger.fu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.dt;
public final class p2 implements h5, c1 {
    public final q3 f21873a;

    public p2(q3 q3Var) {
        this.f21873a = q3Var;
    }

    public void a(e1 e1Var, f4 f4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        q3 q3Var = this.f21873a;
        o3 o3Var = q3Var.f21931p3;
        Editable text = e1Var.getText();
        int i7 = -1;
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(f4Var);
        }
        if (text != null) {
            i7 = text.getSpanEnd(f4Var);
        }
        int i10 = i7;
        if (spanStart >= 0 && i10 > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = f4Var.f21697a;
                if (textbutton != null) {
                    d2 d2Var = q3Var.R3;
                    if (d2Var != null) {
                        d2Var.d();
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
                    Editable text2 = e1Var.getText();
                    if (text2 != null && text2.getSpanStart(f4Var) >= 0) {
                        fu fuVar = f4Var.f21698b;
                        if (fuVar != null && f4Var.f21699c == e1Var) {
                            fuVar.b(e1Var);
                            f4Var.f21699c = null;
                        }
                        text2.removeSpan(f4Var);
                        f4 f4Var2 = new f4(textbutton);
                        f4Var2.a(q3Var.f21928n3, e1Var, q3Var.f21930o3);
                        text2.setSpan(f4Var2, spanStart, i10, 33);
                        dt dtVar = e1Var.T1;
                        if (dtVar != null) {
                            dtVar.E();
                        }
                        e1Var.f21670v2 = true;
                        e1Var.invalidate();
                        e1Var.requestLayout();
                        e1Var.f();
                        o3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            q3Var.r3(false);
            o3Var.k0(new p3(q3Var, e1Var, spanStart, i10, f4Var), e1Var);
        }
    }
}
