package oi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class q3 {
    public final a f22400a;
    public final int f22401b;
    public final t3 f22402c;

    public q3(t3 t3Var, a aVar, int i7) {
        this.f22402c = t3Var;
        this.f22400a = aVar;
        this.f22401b = i7;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && i4.c(inlineButtonType) && (d = d()) != null) {
            int i7 = this.f22401b;
            if (i7 >= 0 && i7 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                t3 t3Var = this.f22402c;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i7);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = c6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                t3Var.f35323g3.O(false);
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var.f22495p3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f22401b) >= 0 && i7 < d.buttons.size()) {
            t3 t3Var = this.f22402c;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            d.buttons.remove(i7);
            t3Var.f35323g3.O(false);
            g2 g2Var2 = t3Var.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            t3Var.f22495p3.onContentChanged();
        }
    }

    public final boolean c() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f22401b) >= 0 && i7 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f22400a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f22001b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
