package bi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i71;
import org.telegram.ui.ProfileActivity;
public final class l5 implements x10 {
    public final int f3849a;
    public final t6 f3850b;

    public l5(t6 t6Var, int i7) {
        this.f3849a = i7;
        this.f3850b = t6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3849a) {
            case 0:
                t6 t6Var = this.f3850b;
                t6Var.f(true);
                i71 i71Var = t6Var.f4119n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                i71Var.e(i7, t6Var.f4117e.f(i7) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = t6Var.f4114a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                t6Var.o();
                return;
            default:
                t6 t6Var2 = this.f3850b;
                t6Var2.f4117e.b((String) obj, new l5(t6Var2, 0));
                return;
        }
    }
}
