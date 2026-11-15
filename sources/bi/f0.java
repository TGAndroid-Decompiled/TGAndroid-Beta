package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class f0 implements Runnable {
    public final int f3496a;
    public final Context f3497b;
    public final org.telegram.ui.ActionBar.e6 f3498c;
    public final TL_stars.StarGift d;

    public f0(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift, int i7) {
        this.f3496a = i7;
        this.f3497b = context;
        this.f3498c = e6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f3496a) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = this.f3498c;
                m0.g1(this.f3497b, this.d, e6Var);
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = this.f3498c;
                m0.g1(this.f3497b, this.d, e6Var2);
                return;
        }
    }
}
