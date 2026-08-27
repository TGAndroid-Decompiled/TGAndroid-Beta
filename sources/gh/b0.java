package gh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

public final class b0 implements Runnable {

    public final int f7143a;

    public final Context f7144b;

    public final org.telegram.ui.ActionBar.c6 f7145c;
    public final TL_stars.StarGift d;

    public b0(Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.StarGift starGift, int i10) {
        this.f7143a = i10;
        this.f7144b = context;
        this.f7145c = c6Var;
        this.d = starGift;
    }

    @Override
    public final void run() {
        switch (this.f7143a) {
            case 0:
                org.telegram.ui.ActionBar.c6 c6Var = this.f7145c;
                i0.U(this.f7144b, this.d, c6Var);
                break;
            default:
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f7145c;
                i0.U(this.f7144b, this.d, c6Var2);
                break;
        }
    }
}
