package kh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k81;
import org.telegram.ui.ProfileActivity;
public final class j2 implements Utilities.Callback {
    public final int f10789a;
    public final w3 f10790b;

    public j2(w3 w3Var, int i10) {
        this.f10789a = i10;
        this.f10790b = w3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10789a) {
            case 0:
                w3 w3Var = this.f10790b;
                w3Var.e.b((String) obj, new j2(w3Var, 1));
                return;
            default:
                w3 w3Var2 = this.f10790b;
                w3Var2.f(true);
                k81 k81Var = w3Var2.f11019n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k81Var.d(i10, w3Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = w3Var2.f11015a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                w3Var2.n();
                return;
        }
    }
}
