package fh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m71;
import org.telegram.ui.ProfileActivity;
public final class s2 implements Utilities.Callback {
    public final int f6749a;
    public final j4 f6750b;

    public s2(j4 j4Var, int i9) {
        this.f6749a = i9;
        this.f6750b = j4Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6749a) {
            case 0:
                j4 j4Var = this.f6750b;
                j4Var.f6548e.b((String) obj, new s2(j4Var, 1));
                return;
            default:
                j4 j4Var2 = this.f6750b;
                j4Var2.f(true);
                m71 m71Var = j4Var2.f6550n;
                int i9 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                m71Var.d(i9, j4Var2.f6548e.f(i9) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = j4Var2.f6545a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                j4Var2.n();
                return;
        }
    }
}
