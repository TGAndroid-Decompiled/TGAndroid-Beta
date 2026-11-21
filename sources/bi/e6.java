package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
public final class e6 implements v10, w10 {
    public final n6 f3592a;

    public e6(n6 n6Var) {
        this.f3592a = n6Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.o41 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e6.a(org.telegram.ui.Components.o41, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        n6 n6Var = this.f3592a;
        gq0 gq0Var = n6Var.f3944a;
        int i7 = n6Var.f3945b;
        if (n6Var.f3947e != null) {
            Object obj3 = o41Var.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (n6Var.h) {
                    if (!n6Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z10 = savedStarGift.pinned_to_top;
                        boolean z11 = !z10;
                        if (!z10 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = n6Var.f3947e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                        }
                        if (n6Var.f3947e.q(savedStarGift, z11, true)) {
                            lc.b0(gq0Var.f4114a).Q(2131623982, 36, gd.H(',', "GiftsPinLimit", mp.u1(i7).N6)).j();
                        }
                        if (!z10) {
                            n6Var.f3948f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                di.f6 f6Var = new di.f6(n6Var.getContext(), n6Var.f3945b, gq0Var.f4116c, n6Var.f3946c, null);
                f6Var.j3 = new z5(n6Var, 2);
                f6Var.N2 = new ab.g(4, n6Var, savedStarGift);
                f6Var.w2(savedStarGift, n6Var.f3947e);
                f6Var.show();
            }
        }
    }
}
