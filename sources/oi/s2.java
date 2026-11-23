package oi;

import android.text.Editable;
import org.telegram.messenger.du;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.mt;
public final class s2 implements j5, d1 {
    public final t3 f22369a;

    public s2(t3 t3Var) {
        this.f22369a = t3Var;
    }

    public void a(f1 f1Var, i4 i4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t3 t3Var = this.f22369a;
        r3 r3Var = t3Var.f22428p3;
        Editable text = f1Var.getText();
        int i7 = -1;
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(i4Var);
        }
        if (text != null) {
            i7 = text.getSpanEnd(i4Var);
        }
        int i10 = i7;
        if (spanStart >= 0 && i10 > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = i4Var.f22182a;
                if (textbutton != null) {
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
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
                    Editable text2 = f1Var.getText();
                    if (text2 != null && text2.getSpanStart(i4Var) >= 0) {
                        du duVar = i4Var.f22183b;
                        if (duVar != null && i4Var.f22184c == f1Var) {
                            duVar.b(f1Var);
                            i4Var.f22184c = null;
                        }
                        text2.removeSpan(i4Var);
                        i4 i4Var2 = new i4(textbutton);
                        i4Var2.a(t3Var.f22425n3, f1Var, t3Var.f22427o3);
                        text2.setSpan(i4Var2, spanStart, i10, 33);
                        mt mtVar = f1Var.T1;
                        if (mtVar != null) {
                            mtVar.g();
                        }
                        f1Var.f22117v2 = true;
                        f1Var.invalidate();
                        f1Var.requestLayout();
                        f1Var.f();
                        r3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            t3Var.r3(false);
            r3Var.R0(new s3(t3Var, f1Var, spanStart, i10, i4Var), f1Var);
        }
    }
}
