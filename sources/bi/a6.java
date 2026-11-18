package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
public final class a6 implements v10, w10 {
    public final j6 f3415a;

    public a6(j6 j6Var) {
        this.f3415a = j6Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.l41 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a6.a(org.telegram.ui.Components.l41, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        j6 j6Var = this.f3415a;
        eq0 eq0Var = j6Var.f3756a;
        int i7 = j6Var.f3757b;
        if (j6Var.f3759e != null) {
            Object obj3 = l41Var.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (j6Var.h) {
                    if (!j6Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z10 = savedStarGift.pinned_to_top;
                        boolean z11 = !z10;
                        if (!z10 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = j6Var.f3759e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                        }
                        if (j6Var.f3759e.q(savedStarGift, z11, true)) {
                            lc.b0(eq0Var.f3941a).Q(2131623982, 36, gd.H(',', "GiftsPinLimit", mp.u1(i7).N6)).j();
                        }
                        if (!z10) {
                            j6Var.f3760f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                di.f6 f6Var = new di.f6(j6Var.getContext(), j6Var.f3757b, eq0Var.f3943c, j6Var.f3758c, null);
                f6Var.j3 = new v5(j6Var, 2);
                f6Var.N2 = new ab.g(4, j6Var, savedStarGift);
                f6Var.w2(savedStarGift, j6Var.f3759e);
                f6Var.show();
            }
        }
    }
}
