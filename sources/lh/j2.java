package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l81;
import org.telegram.ui.ProfileActivity;
public final class j2 implements Utilities.Callback {
    public final int f12819a;
    public final x3 f12820b;

    public j2(x3 x3Var, int i10) {
        this.f12819a = i10;
        this.f12820b = x3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12819a) {
            case 0:
                x3 x3Var = this.f12820b;
                x3Var.f13101e.b((String) obj, new j2(x3Var, 1));
                return;
            default:
                x3 x3Var2 = this.f12820b;
                x3Var2.f(true);
                l81 l81Var = x3Var2.f13103n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                l81Var.d(i10, x3Var2.f13101e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = x3Var2.f13098a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                x3Var2.n();
                return;
        }
    }
}
