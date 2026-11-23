package bi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i71;
import org.telegram.ui.ProfileActivity;
public final class n5 implements y10 {
    public final int f3885a;
    public final v6 f3886b;

    public n5(v6 v6Var, int i7) {
        this.f3885a = i7;
        this.f3886b = v6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3885a) {
            case 0:
                v6 v6Var = this.f3886b;
                v6Var.f(true);
                i71 i71Var = v6Var.f4153n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                i71Var.e(i7, v6Var.f4151e.f(i7) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = v6Var.f4148a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                v6Var.o();
                return;
            default:
                v6 v6Var2 = this.f3886b;
                v6Var2.f4151e.b((String) obj, new n5(v6Var2, 0));
                return;
        }
    }
}
