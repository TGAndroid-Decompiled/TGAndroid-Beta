package ii;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class u3 {
    public final a f12730a;
    public final int f12731b;
    public final x3 f12732c;

    public u3(x3 x3Var, a aVar, int i10) {
        this.f12732c = x3Var;
        this.f12730a = aVar;
        this.f12731b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && m4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f12731b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                x3 x3Var = this.f12732c;
                i2 i2Var = x3Var.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i10);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = h6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                x3Var.W2.N(false);
                i2 i2Var2 = x3Var.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.f12808f3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f12731b) >= 0 && i10 < d.buttons.size()) {
            x3 x3Var = this.f12732c;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            d.buttons.remove(i10);
            x3Var.W2.N(false);
            i2 i2Var2 = x3Var.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            x3Var.f12808f3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f12731b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f12730a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12233b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
