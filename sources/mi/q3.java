package mi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class q3 {
    public final a f19837a;
    public final int f19838b;
    public final t3 f19839c;

    public q3(t3 t3Var, a aVar, int i3) {
        this.f19839c = t3Var;
        this.f19837a = aVar;
        this.f19838b = i3;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && j4.c(inlineButtonType) && (d = d()) != null) {
            int i3 = this.f19838b;
            if (i3 >= 0 && i3 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                t3 t3Var = this.f19839c;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i3);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = d6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                t3Var.f35594g3.O(false);
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var.f19916p3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i3;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i3 = this.f19838b) >= 0 && i3 < d.buttons.size()) {
            t3 t3Var = this.f19839c;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            d.buttons.remove(i3);
            t3Var.f35594g3.O(false);
            g2 g2Var2 = t3Var.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            t3Var.f19916p3.onContentChanged();
        }
    }

    public final boolean c() {
        int i3;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i3 = this.f19838b) >= 0 && i3 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f19837a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
