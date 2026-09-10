package hi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class w3 {
    public final a f9925a;
    public final int f9926b;
    public final z3 f9927c;

    public w3(z3 z3Var, a aVar, int i10) {
        this.f9927c = z3Var;
        this.f9925a = aVar;
        this.f9926b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && n4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f9926b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                z3 z3Var = this.f9927c;
                k2 k2Var = z3Var.J3;
                if (k2Var != null) {
                    k2Var.d();
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
                z3Var.Y2.N(false);
                k2 k2Var2 = z3Var.J3;
                if (k2Var2 != null) {
                    k2Var2.h();
                }
                z3Var.f10001h3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f9926b) >= 0 && i10 < d.buttons.size()) {
            z3 z3Var = this.f9927c;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.d();
            }
            d.buttons.remove(i10);
            z3Var.Y2.N(false);
            k2 k2Var2 = z3Var.J3;
            if (k2Var2 != null) {
                k2Var2.h();
            }
            z3Var.f10001h3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f9926b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f9925a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
