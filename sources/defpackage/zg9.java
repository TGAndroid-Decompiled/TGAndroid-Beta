package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class zg9 {
    public final ll0 a;
    public final int b;
    public final ch9 c;

    public zg9(ch9 ch9Var, ll0 ll0Var, int i) {
        this.c = ch9Var;
        this.a = ll0Var;
        this.b = i;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && qh9.c(inlineButtonType) && (d = d()) != null) {
            int i = this.b;
            if (i >= 0 && i < d.buttons.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z || d.buttons.size() < 8) {
                ch9 ch9Var = this.c;
                of9 of9Var = ch9Var.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                if (z) {
                    pageButton = d.buttons.get(i);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = zk9.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z) {
                    d.buttons.add(pageButton);
                }
                ch9Var.g3.O(false);
                of9 of9Var2 = ch9Var.R3;
                if (of9Var2 != null) {
                    of9Var2.h();
                }
                ch9Var.p3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i = this.b) >= 0 && i < d.buttons.size()) {
            ch9 ch9Var = this.c;
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.d();
            }
            d.buttons.remove(i);
            ch9Var.g3.O(false);
            of9 of9Var2 = ch9Var.R3;
            if (of9Var2 != null) {
                of9Var2.h();
            }
            ch9Var.p3.onContentChanged();
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
        ll0 ll0Var = this.a;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
