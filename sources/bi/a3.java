package bi;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v61;
import org.telegram.ui.ProfileActivity;
public final class a3 implements z10 {
    public final int f3372a;
    public final i4 f3373b;

    public a3(i4 i4Var, int i7) {
        this.f3372a = i7;
        this.f3373b = i4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3372a) {
            case 0:
                i4 i4Var = this.f3373b;
                i4Var.f(true);
                v61 v61Var = i4Var.f3612n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                v61Var.d(i7, i4Var.f3610e.f(i7) + 1);
                org.telegram.ui.ActionBar.e2 e2Var = i4Var.f3607a;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W4(true);
                }
                i4Var.o();
                return;
            default:
                i4 i4Var2 = this.f3373b;
                i4Var2.f3610e.b((String) obj, new a3(i4Var2, 0));
                return;
        }
    }
}
