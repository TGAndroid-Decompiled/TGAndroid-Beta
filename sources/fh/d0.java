package fh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class d0 implements Runnable {
    public final int f6404a;
    public final Context f6405b;
    public final org.telegram.ui.ActionBar.b6 f6406c;
    public final TL_stars.StarGift d;

    public d0(Context context, org.telegram.ui.ActionBar.b6 b6Var, TL_stars.StarGift starGift, int i9) {
        this.f6404a = i9;
        this.f6405b = context;
        this.f6406c = b6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f6404a) {
            case 0:
                org.telegram.ui.ActionBar.b6 b6Var = this.f6406c;
                k0.T(this.f6405b, this.d, b6Var);
                return;
            default:
                org.telegram.ui.ActionBar.b6 b6Var2 = this.f6406c;
                k0.T(this.f6405b, this.d, b6Var2);
                return;
        }
    }
}
