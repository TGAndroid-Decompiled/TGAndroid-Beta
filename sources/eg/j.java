package eg;

import android.content.Context;
import h7.z5;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;

public final class j extends d {

    public final h5 f5421r;

    public Object f5422s;

    public j(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f5394c.setVisibility(8);
        h5 h5Var = this.f5395e;
        int i10 = g6.B6;
        h5Var.setTextColor(g6.v0(i10, c6Var));
        h5 h5Var2 = new h5(context);
        this.f5421r = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(g6.v0(i10, c6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        boolean z10 = LocaleController.isRTL;
        h5Var2.setLayoutParams(z5.d(-1, -2.0f, (z10 ? 3 : 5) | 16, z10 ? 20.0f : 0.0f, 0.0f, z10 ? 0.0f : 20.0f, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f5422s;
    }
}
