package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wp0;
public final class t3 implements x10, y10 {
    public final c4 f3876a;

    public t3(c4 c4Var) {
        this.f3876a = c4Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.b41 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.t3.a(org.telegram.ui.Components.b41, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b41 b41Var = (b41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        c4 c4Var = this.f3876a;
        wp0 wp0Var = c4Var.f3409a;
        int i7 = c4Var.f3410b;
        if (c4Var.f3412e != null) {
            Object obj3 = b41Var.G;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (c4Var.h) {
                    if (!c4Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z10 = savedStarGift.pinned_to_top;
                        boolean z11 = !z10;
                        if (!z10 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = c4Var.f3412e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                        }
                        if (c4Var.f3412e.o(savedStarGift, z11, true)) {
                            cc.a0(wp0Var.f3607a).Q(2131623982, 36, hd.H(',', "GiftsPinLimit", np.s1(i7).L6)).j();
                        }
                        if (!z10) {
                            c4Var.f3413f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                di.c6 c6Var = new di.c6(c4Var.getContext(), c4Var.f3410b, wp0Var.f3609c, c4Var.f3411c, null);
                c6Var.f8319g3 = new o3(c4Var, 2);
                c6Var.N2 = new ab.g(5, c4Var, savedStarGift);
                c6Var.k2(savedStarGift, c4Var.f3412e);
                c6Var.show();
            }
        }
    }
}
