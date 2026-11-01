package og;

import android.content.Context;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import w7.b6;
public final class j extends d {
    public final u5 f14205s;
    public Object f14206w;

    public j(Context context, p6 p6Var) {
        super(context, p6Var);
        int i10;
        float f7;
        float f10;
        this.f14179c.setVisibility(8);
        u5 u5Var = this.e;
        int i11 = t6.B6;
        a7.Y(u5Var, i11, p6Var);
        u5 u5Var2 = new u5(context);
        this.f14205s = u5Var2;
        u5Var2.setTextSize(16);
        a7.Y(u5Var2, i11, p6Var);
        if (dd.X) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        u5Var2.setGravity(i10);
        addView(u5Var2);
        boolean z10 = dd.X;
        int i12 = (z10 ? 3 : 5) | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 20.0f;
        }
        u5Var2.setLayoutParams(b6.d(-1, -2.0f, i12, f7, 0.0f, f10, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f14206w;
    }
}
