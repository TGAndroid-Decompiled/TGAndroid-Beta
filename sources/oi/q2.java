package oi;

import android.text.Editable;
import org.telegram.messenger.cu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.kt;
public final class q2 implements i5, c1 {
    public final s3 f22257a;

    public q2(s3 s3Var) {
        this.f22257a = s3Var;
    }

    public void a(e1 e1Var, h4 h4Var, boolean z10) {
        int spanStart;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        s3 s3Var = this.f22257a;
        q3 q3Var = s3Var.f22337p3;
        Editable text = e1Var.getText();
        int i7 = -1;
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(h4Var);
        }
        if (text != null) {
            i7 = text.getSpanEnd(h4Var);
        }
        int i10 = i7;
        if (spanStart >= 0 && i10 > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = h4Var.f22092a;
                if (textbutton != null) {
                    e2 e2Var = s3Var.R3;
                    if (e2Var != null) {
                        e2Var.d();
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
                    if (text2 != null && text2.getSpanStart(h4Var) >= 0) {
                        cu cuVar = h4Var.f22093b;
                        if (cuVar != null && h4Var.f22094c == e1Var) {
                            cuVar.b(e1Var);
                            h4Var.f22094c = null;
                        }
                        text2.removeSpan(h4Var);
                        h4 h4Var2 = new h4(textbutton);
                        h4Var2.a(s3Var.f22334n3, e1Var, s3Var.f22336o3);
                        text2.setSpan(h4Var2, spanStart, i10, 33);
                        kt ktVar = e1Var.T1;
                        if (ktVar != null) {
                            ktVar.g();
                        }
                        e1Var.f22027v2 = true;
                        e1Var.invalidate();
                        e1Var.requestLayout();
                        e1Var.f();
                        q3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            s3Var.r3(false);
            q3Var.R0(new r3(s3Var, e1Var, spanStart, i10, h4Var), e1Var);
        }
    }
}
