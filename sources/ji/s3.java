package ji;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class s3 {
    public final a f14187a;
    public final int f14188b;
    public final v3 f14189c;

    public s3(v3 v3Var, a aVar, int i10) {
        this.f14189c = v3Var;
        this.f14187a = aVar;
        this.f14188b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && k4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f14188b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                v3 v3Var = this.f14189c;
                g2 g2Var = v3Var.J3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i10);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = i6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                v3Var.Y2.N(false);
                g2 g2Var2 = v3Var.J3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                v3Var.f14275h3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f14188b) >= 0 && i10 < d.buttons.size()) {
            v3 v3Var = this.f14189c;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            d.buttons.remove(i10);
            v3Var.Y2.N(false);
            g2 g2Var2 = v3Var.J3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            v3Var.f14275h3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f14188b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f14187a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13758b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
