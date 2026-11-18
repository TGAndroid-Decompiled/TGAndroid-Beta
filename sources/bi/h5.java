package bi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f71;
import org.telegram.ui.ProfileActivity;
public final class h5 implements x10 {
    public final int f3676a;
    public final p6 f3677b;

    public h5(p6 p6Var, int i7) {
        this.f3676a = i7;
        this.f3677b = p6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3676a) {
            case 0:
                p6 p6Var = this.f3677b;
                p6Var.f(true);
                f71 f71Var = p6Var.f3946n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                f71Var.e(i7, p6Var.f3944e.f(i7) + 1);
                org.telegram.ui.ActionBar.h2 h2Var = p6Var.f3941a;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).X4(true);
                }
                p6Var.o();
                return;
            default:
                p6 p6Var2 = this.f3677b;
                p6Var2.f3944e.b((String) obj, new h5(p6Var2, 0));
                return;
        }
    }
}
