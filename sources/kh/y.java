package kh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
public final class y implements Runnable {
    public final int f11061a;
    public final Context f11062b;
    public final f6 f11063c;
    public final TL_stars.StarGift d;

    public y(Context context, f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.f11061a = i10;
        this.f11062b = context;
        this.f11063c = f6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f11061a) {
            case 0:
                f6 f6Var = this.f11063c;
                f0.U(this.f11062b, this.d, f6Var);
                return;
            default:
                f6 f6Var2 = this.f11063c;
                f0.U(this.f11062b, this.d, f6Var2);
                return;
        }
    }
}
