package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class ve9 {
    public final lk0 a;
    public final int b;
    public final ye9 c;

    public ve9(ye9 ye9Var, lk0 lk0Var, int i) {
        this.c = ye9Var;
        this.a = lk0Var;
        this.b = i;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && mf9.c(inlineButtonType) && (d = d()) != null) {
            int i = this.b;
            if (i >= 0 && i < d.buttons.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z || d.buttons.size() < 8) {
                ye9 ye9Var = this.c;
                ld9 ld9Var = ye9Var.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                if (z) {
                    pageButton = d.buttons.get(i);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = yi9.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z) {
                    d.buttons.add(pageButton);
                }
                ye9Var.g3.O(false);
                ld9 ld9Var2 = ye9Var.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                ye9Var.p3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i = this.b) >= 0 && i < d.buttons.size()) {
            ye9 ye9Var = this.c;
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            d.buttons.remove(i);
            ye9Var.g3.O(false);
            ld9 ld9Var2 = ye9Var.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            ye9Var.p3.onContentChanged();
        }
    }

    public final boolean c() {
        int i;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i = this.b) >= 0 && i < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        lk0 lk0Var = this.a;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
