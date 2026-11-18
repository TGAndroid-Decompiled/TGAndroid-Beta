package bi;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
public final class f0 implements Runnable {
    public final int f3562a;
    public final Context f3563b;
    public final org.telegram.ui.ActionBar.i6 f3564c;
    public final TL_stars.StarGift d;

    public f0(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f3562a = i7;
        this.f3563b = context;
        this.f3564c = i6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f3562a) {
            case 0:
                org.telegram.ui.ActionBar.i6 i6Var = this.f3564c;
                m0.h1(this.f3563b, this.d, i6Var);
                return;
            default:
                org.telegram.ui.ActionBar.i6 i6Var2 = this.f3564c;
                m0.h1(this.f3563b, this.d, i6Var2);
                return;
        }
    }
}
