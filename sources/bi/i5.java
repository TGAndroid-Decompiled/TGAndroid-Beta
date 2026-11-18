package bi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f71;
import org.telegram.ui.ProfileActivity;
public final class i5 implements x10 {
    public final int f3730a;
    public final q6 f3731b;

    public i5(q6 q6Var, int i7) {
        this.f3730a = i7;
        this.f3731b = q6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3730a) {
            case 0:
                q6 q6Var = this.f3731b;
                q6Var.f(true);
                f71 f71Var = q6Var.f4008n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                f71Var.e(i7, q6Var.f4006e.f(i7) + 1);
                org.telegram.ui.ActionBar.h2 h2Var = q6Var.f4003a;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).X4(true);
                }
                q6Var.o();
                return;
            default:
                q6 q6Var2 = this.f3731b;
                q6Var2.f4006e.b((String) obj, new i5(q6Var2, 0));
                return;
        }
    }
}
