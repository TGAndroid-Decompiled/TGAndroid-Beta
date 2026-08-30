package kh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class y implements Runnable {
    public final int f10949a;
    public final Context f10950b;
    public final org.telegram.ui.ActionBar.f6 f10951c;
    public final TL_stars.StarGift d;

    public y(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.StarGift starGift, int i10) {
        this.f10949a = i10;
        this.f10950b = context;
        this.f10951c = f6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f10949a) {
            case 0:
                org.telegram.ui.ActionBar.f6 f6Var = this.f10951c;
                f0.U(this.f10950b, this.d, f6Var);
                return;
            default:
                org.telegram.ui.ActionBar.f6 f6Var2 = this.f10951c;
                f0.U(this.f10950b, this.d, f6Var2);
                return;
        }
    }
}
