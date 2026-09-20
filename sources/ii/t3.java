package ii;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class t3 {
    public final a f11633a;
    public final int f11634b;
    public final w3 f11635c;

    public t3(w3 w3Var, a aVar, int i10) {
        this.f11635c = w3Var;
        this.f11633a = aVar;
        this.f11634b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && k4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f11634b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                w3 w3Var = this.f11635c;
                h2 h2Var = w3Var.J3;
                if (h2Var != null) {
                    h2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i10);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = f6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                w3Var.Y2.N(false);
                h2 h2Var2 = w3Var.J3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                w3Var.f11715h3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f11634b) >= 0 && i10 < d.buttons.size()) {
            w3 w3Var = this.f11635c;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.d();
            }
            d.buttons.remove(i10);
            w3Var.Y2.N(false);
            h2 h2Var2 = w3Var.J3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            w3Var.f11715h3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f11634b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f11633a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11205b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
