package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.w10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
public final class g6 implements w10, x10 {
    public final p6 f3619a;

    public g6(p6 p6Var) {
        this.f3619a = p6Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.o41 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.g6.a(org.telegram.ui.Components.o41, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        p6 p6Var = this.f3619a;
        gq0 gq0Var = p6Var.f3966a;
        int i7 = p6Var.f3967b;
        if (p6Var.f3969e != null) {
            Object obj3 = o41Var.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (p6Var.h) {
                    if (!p6Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z10 = savedStarGift.pinned_to_top;
                        boolean z11 = !z10;
                        if (!z10 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = p6Var.f3969e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                        }
                        if (p6Var.f3969e.q(savedStarGift, z11, true)) {
                            lc.b0(gq0Var.f4148a).Q(2131623982, 36, hd.H(',', "GiftsPinLimit", np.u1(i7).N6)).j();
                        }
                        if (!z10) {
                            p6Var.f3970f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                di.f6 f6Var = new di.f6(p6Var.getContext(), p6Var.f3967b, gq0Var.f4150c, p6Var.f3968c, null);
                f6Var.j3 = new b6(p6Var, 2);
                f6Var.N2 = new ab.g(4, p6Var, savedStarGift);
                f6Var.w2(savedStarGift, p6Var.f3969e);
                f6Var.show();
            }
        }
    }
}
