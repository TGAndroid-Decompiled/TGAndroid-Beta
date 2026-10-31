package bi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class a4 {
    public final a f2840a;
    public final int f2841b;
    public final d4 f2842c;

    public a4(d4 d4Var, a aVar, int i10) {
        this.f2842c = d4Var;
        this.f2840a = aVar;
        this.f2841b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && u4.c(inlineButtonType) && (d = d()) != null) {
            int i10 = this.f2841b;
            if (i10 >= 0 && i10 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                d4 d4Var = this.f2842c;
                o2 o2Var = d4Var.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i10);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = s6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                d4Var.f30819f3.O(false);
                o2 o2Var2 = d4Var.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
                d4Var.f2938o3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f2841b) >= 0 && i10 < d.buttons.size()) {
            d4 d4Var = this.f2842c;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            d.buttons.remove(i10);
            d4Var.f30819f3.O(false);
            o2 o2Var2 = d4Var.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            d4Var.f2938o3.onContentChanged();
        }
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i10 = this.f2841b) >= 0 && i10 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f2840a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
