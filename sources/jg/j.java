package jg;

import android.content.Context;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
public final class j extends d {
    public final l5 f10044r;
    public Object f10045s;

    public j(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        float f10;
        float f11;
        this.f10020c.setVisibility(8);
        l5 l5Var = this.f10021e;
        int i11 = k6.B6;
        l5Var.setTextColor(k6.v0(i11, g6Var));
        l5 l5Var2 = new l5(context);
        this.f10044r = l5Var2;
        l5Var2.setTextSize(16);
        l5Var2.setTextColor(k6.v0(i11, g6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        l5Var2.setGravity(i10);
        addView(l5Var2);
        boolean z4 = LocaleController.isRTL;
        int i12 = (z4 ? 3 : 5) | 16;
        if (z4) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        l5Var2.setLayoutParams(c6.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f10045s;
    }
}
