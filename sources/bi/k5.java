package bi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i71;
import org.telegram.ui.ProfileActivity;
public final class k5 implements y10 {
    public final int f3802a;
    public final s6 f3803b;

    public k5(s6 s6Var, int i7) {
        this.f3802a = i7;
        this.f3803b = s6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3802a) {
            case 0:
                s6 s6Var = this.f3803b;
                s6Var.f(true);
                i71 i71Var = s6Var.f4096n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                i71Var.e(i7, s6Var.f4094e.f(i7) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = s6Var.f4091a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                s6Var.o();
                return;
            default:
                s6 s6Var2 = this.f3803b;
                s6Var2.f4094e.b((String) obj, new k5(s6Var2, 0));
                return;
        }
    }
}
