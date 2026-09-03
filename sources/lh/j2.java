package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k81;
import org.telegram.ui.ProfileActivity;
public final class j2 implements Utilities.Callback {
    public final int f12821a;
    public final x3 f12822b;

    public j2(x3 x3Var, int i10) {
        this.f12821a = i10;
        this.f12822b = x3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12821a) {
            case 0:
                x3 x3Var = this.f12822b;
                x3Var.f13103e.b((String) obj, new j2(x3Var, 1));
                return;
            default:
                x3 x3Var2 = this.f12822b;
                x3Var2.f(true);
                k81 k81Var = x3Var2.f13105n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k81Var.d(i10, x3Var2.f13103e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = x3Var2.f13100a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                x3Var2.n();
                return;
        }
    }
}
