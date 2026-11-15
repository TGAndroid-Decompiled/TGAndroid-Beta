package bi;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v61;
import org.telegram.ui.ProfileActivity;
public final class a3 implements z10 {
    public final int f3375a;
    public final i4 f3376b;

    public a3(i4 i4Var, int i7) {
        this.f3375a = i7;
        this.f3376b = i4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3375a) {
            case 0:
                i4 i4Var = this.f3376b;
                i4Var.f(true);
                v61 v61Var = i4Var.f3615n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                v61Var.d(i7, i4Var.f3613e.f(i7) + 1);
                org.telegram.ui.ActionBar.e2 e2Var = i4Var.f3610a;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W4(true);
                }
                i4Var.o();
                return;
            default:
                i4 i4Var2 = this.f3376b;
                i4Var2.f3613e.b((String) obj, new a3(i4Var2, 0));
                return;
        }
    }
}
