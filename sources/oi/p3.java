package oi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class p3 {
    public final a f22268a;
    public final int f22269b;
    public final s3 f22270c;

    public p3(s3 s3Var, a aVar, int i7) {
        this.f22270c = s3Var;
        this.f22268a = aVar;
        this.f22269b = i7;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && h4.c(inlineButtonType) && (d = d()) != null) {
            int i7 = this.f22269b;
            if (i7 >= 0 && i7 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                s3 s3Var = this.f22270c;
                e2 e2Var = s3Var.R3;
                if (e2Var != null) {
                    e2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i7);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = b6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                s3Var.f35742g3.O(false);
                e2 e2Var2 = s3Var.R3;
                if (e2Var2 != null) {
                    e2Var2.h();
                }
                s3Var.f22365p3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f22269b) >= 0 && i7 < d.buttons.size()) {
            s3 s3Var = this.f22270c;
            e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.d();
            }
            d.buttons.remove(i7);
            s3Var.f35742g3.O(false);
            e2 e2Var2 = s3Var.R3;
            if (e2Var2 != null) {
                e2Var2.h();
            }
            s3Var.f22365p3.onContentChanged();
        }
    }

    public final boolean c() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f22269b) >= 0 && i7 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f22268a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21901b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
