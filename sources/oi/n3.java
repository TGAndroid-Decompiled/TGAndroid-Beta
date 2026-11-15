package oi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class n3 {
    public final a f21839a;
    public final int f21840b;
    public final q3 f21841c;

    public n3(q3 q3Var, a aVar, int i7) {
        this.f21841c = q3Var;
        this.f21839a = aVar;
        this.f21840b = i7;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        boolean z10;
        TL_keyboard.PageButton pageButton;
        if (!TextUtils.isEmpty(str) && f4.c(inlineButtonType) && (d = d()) != null) {
            int i7 = this.f21840b;
            if (i7 >= 0 && i7 < d.buttons.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || d.buttons.size() < 8) {
                q3 q3Var = this.f21841c;
                d2 d2Var = q3Var.R3;
                if (d2Var != null) {
                    d2Var.d();
                }
                if (z10) {
                    pageButton = d.buttons.get(i7);
                } else {
                    pageButton = new TL_keyboard.PageButton();
                }
                pageButton.text = a6.f(str);
                pageButton.type = inlineButtonType;
                if (pageButton.style == null) {
                    pageButton.style = new TL_keyboard.RichButtonStyle();
                }
                if (!z10) {
                    d.buttons.add(pageButton);
                }
                q3Var.f39892g3.O(false);
                d2 d2Var2 = q3Var.R3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                q3Var.f21931p3.onContentChanged();
            }
        }
    }

    public final void b() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f21840b) >= 0 && i7 < d.buttons.size()) {
            q3 q3Var = this.f21841c;
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.d();
            }
            d.buttons.remove(i7);
            q3Var.f39892g3.O(false);
            d2 d2Var2 = q3Var.R3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            q3Var.f21931p3.onContentChanged();
        }
    }

    public final boolean c() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d != null && (i7 = this.f21840b) >= 0 && i7 < d.buttons.size()) {
            return true;
        }
        return false;
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.f21839a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                return (TL_iv.pageBlockButtonRow) pageBlock;
            }
            return null;
        }
        return null;
    }
}
