package ai;

import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m61;
import org.telegram.ui.ProfileActivity;
public final class l3 implements u10 {
    public final int f783a;
    public final u4 f784b;

    public l3(u4 u4Var, int i3) {
        this.f783a = i3;
        this.f784b = u4Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f783a) {
            case 0:
                u4 u4Var = this.f784b;
                u4Var.f(true);
                m61 m61Var = u4Var.f1015n;
                int i3 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                m61Var.d(i3, u4Var.f1013e.f(i3) + 1);
                org.telegram.ui.ActionBar.d2 d2Var = u4Var.f1010a;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).U4(true);
                }
                u4Var.o();
                return;
            default:
                u4 u4Var2 = this.f784b;
                u4Var2.f1013e.b((String) obj, new l3(u4Var2, 0));
                return;
        }
    }
}
