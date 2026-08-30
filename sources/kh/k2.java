package kh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k81;
import org.telegram.ui.ProfileActivity;
public final class k2 implements Utilities.Callback {
    public final int f10690a;
    public final x3 f10691b;

    public k2(x3 x3Var, int i10) {
        this.f10690a = i10;
        this.f10691b = x3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10690a) {
            case 0:
                x3 x3Var = this.f10691b;
                x3Var.e.b((String) obj, new k2(x3Var, 1));
                return;
            default:
                x3 x3Var2 = this.f10691b;
                x3Var2.f(true);
                k81 k81Var = x3Var2.f10943n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k81Var.d(i10, x3Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = x3Var2.f10939a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                x3Var2.n();
                return;
        }
    }
}
