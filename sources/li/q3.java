package li;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class q3 {
    public final a f18791a;
    public final int f18792b;
    public final t3 f18793c;

    public q3(t3 t3Var, a aVar, int i7) {
        this.f18793c = t3Var;
        this.f18791a = aVar;
        this.f18792b = i7;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z9;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && i4.c(inlineButtonType) && (d = d()) != null) {
            int i7 = this.f18792b;
            if (i7 >= 0 && i7 < d.buttons.size()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 || d.buttons.size() < 8) {
                t3 t3Var = this.f18793c;
                f2 f2Var = t3Var.Q3;
                if (f2Var != null) {
                    f2Var.d();
                }
                if (z9) {
                    pageButton = d.buttons.get(i7);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = c6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z9) {
                    d.buttons.add(pageButton);
                }
                t3Var.f37496f3.O(false);
                f2 f2Var2 = t3Var.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                t3Var.f18893o3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f18792b) >= 0 && i7 < d.buttons.size()) {
            t3 t3Var = this.f18793c;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            d.buttons.remove(i7);
            t3Var.f37496f3.O(false);
            f2 f2Var2 = t3Var.Q3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            t3Var.f18893o3.onContentChanged();
        }
    }

    public final boolean c() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f18792b) >= 0 && i7 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f18791a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18395b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
