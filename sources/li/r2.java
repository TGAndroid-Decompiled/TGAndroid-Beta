package li;

import android.text.Editable;
import org.telegram.messenger.iu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.xs;
public final class r2 implements j5, e1 {
    public final t3 f18810a;

    public r2(t3 t3Var) {
        this.f18810a = t3Var;
    }

    public void a(g1 g1Var, i4 i4Var, boolean z9) {
        int spanStart;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        t3 t3Var = this.f18810a;
        r3 r3Var = t3Var.f18890o3;
        Editable text = g1Var.getText();
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
            if (!z9) {
                TL_iv.textButton textbutton = i4Var.f18641a;
                if (textbutton != null) {
                    f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    if (richButtonStyle != null && richButtonStyle.bg_primary) {
                        z10 = true;
                    } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                        z10 = true;
                    } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (richButtonStyle == null) {
                        richButtonStyle = new TL_keyboard.RichButtonStyle();
                    }
                    richButtonStyle.flags = 0;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    richButtonStyle.bg_primary = z11;
                    if (z10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    richButtonStyle.bg_danger = z12;
                    if (z10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    richButtonStyle.bg_success = z13;
                    richButtonStyle.link = false;
                    textbutton.style = richButtonStyle;
                    Editable text2 = g1Var.getText();
                    if (text2 != null && text2.getSpanStart(i4Var) >= 0) {
                        iu iuVar = i4Var.f18642b;
                        if (iuVar != null && i4Var.f18643c == g1Var) {
                            iuVar.b(g1Var);
                            i4Var.f18643c = null;
                        }
                        text2.removeSpan(i4Var);
                        i4 i4Var2 = new i4(textbutton);
                        i4Var2.a(t3Var.f18886m3, g1Var, t3Var.f18888n3);
                        text2.setSpan(i4Var2, spanStart, i10, 33);
                        xs xsVar = g1Var.N1;
                        if (xsVar != null) {
                            xsVar.m();
                        }
                        g1Var.f18598p2 = true;
                        g1Var.invalidate();
                        g1Var.requestLayout();
                        g1Var.f();
                        r3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            t3Var.r3(false);
            r3Var.d(new s3(t3Var, g1Var, spanStart, i10, i4Var), g1Var);
        }
    }
}
