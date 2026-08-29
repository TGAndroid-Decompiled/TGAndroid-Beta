package gg;

import android.content.Context;
import i7.f6;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
public final class j extends d {
    public final h5 f7314r;
    public Object f7315s;

    public j(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        float f9;
        float f10;
        this.f7290c.setVisibility(8);
        h5 h5Var = this.f7291e;
        int i11 = g6.B6;
        h5Var.setTextColor(g6.v0(i11, c6Var));
        h5 h5Var2 = new h5(context);
        this.f7314r = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(g6.v0(i11, c6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        h5Var2.setGravity(i10);
        addView(h5Var2);
        boolean z10 = LocaleController.isRTL;
        int i12 = (z10 ? 3 : 5) | 16;
        if (z10) {
            f9 = 20.0f;
        } else {
            f9 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 20.0f;
        }
        h5Var2.setLayoutParams(f6.d(-1, -2.0f, i12, f9, 0.0f, f10, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f7315s;
    }
}
