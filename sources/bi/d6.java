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
public final class d6 implements w10, x10 {
    public final m6 f3558a;

    public d6(m6 m6Var) {
        this.f3558a = m6Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.o41 r30, android.view.View r31, java.lang.Integer r32, java.lang.Float r33, java.lang.Float r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d6.a(org.telegram.ui.Components.o41, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        m6 m6Var = this.f3558a;
        gq0 gq0Var = m6Var.f3897a;
        int i7 = m6Var.f3898b;
        if (m6Var.f3900e != null) {
            Object obj3 = o41Var.H;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (m6Var.h) {
                    if (!m6Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z10 = savedStarGift.pinned_to_top;
                        boolean z11 = !z10;
                        if (!z10 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = m6Var.f3900e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i7).sendRequest(savestargift, null, 64);
                        }
                        if (m6Var.f3900e.q(savedStarGift, z11, true)) {
                            lc.b0(gq0Var.f4091a).Q(2131623982, 36, hd.H(',', "GiftsPinLimit", np.u1(i7).N6)).j();
                        }
                        if (!z10) {
                            m6Var.f3901f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                di.f6 f6Var = new di.f6(m6Var.getContext(), m6Var.f3898b, gq0Var.f4093c, m6Var.f3899c, null);
                f6Var.j3 = new y5(m6Var, 2);
                f6Var.N2 = new ab.g(4, m6Var, savedStarGift);
                f6Var.w2(savedStarGift, m6Var.f3900e);
                f6Var.show();
            }
        }
    }
}
