package dg;

import android.content.Context;
import g7.e6;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
public final class j extends d {
    public final h5 f4530r;
    public Object f4531s;

    public j(Context context, b6 b6Var) {
        super(context, b6Var);
        int i9;
        float f10;
        float f11;
        this.f4500c.setVisibility(8);
        h5 h5Var = this.f4501e;
        int i10 = f6.B6;
        h5Var.setTextColor(f6.v0(i10, b6Var));
        h5 h5Var2 = new h5(context);
        this.f4530r = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(f6.v0(i10, b6Var));
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        h5Var2.setGravity(i9);
        addView(h5Var2);
        boolean z10 = LocaleController.isRTL;
        int i11 = (z10 ? 3 : 5) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        h5Var2.setLayoutParams(e6.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f4531s;
    }
}
