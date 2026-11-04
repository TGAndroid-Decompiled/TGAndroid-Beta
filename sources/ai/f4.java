package ai;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vp0;
public final class f4 implements s10, t10 {
    public final o4 f647a;

    public f4(o4 o4Var) {
        this.f647a = o4Var;
    }

    @Override
    public java.lang.Boolean a(org.telegram.ui.Components.r31 r29, android.view.View r30, java.lang.Integer r31, java.lang.Float r32, java.lang.Float r33) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f4.a(org.telegram.ui.Components.r31, android.view.View, java.lang.Integer, java.lang.Float, java.lang.Float):java.lang.Boolean");
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r31 r31Var = (r31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        o4 o4Var = this.f647a;
        vp0 vp0Var = o4Var.f856a;
        int i3 = o4Var.f857b;
        if (o4Var.f859e != null) {
            Object obj3 = r31Var.G;
            if (obj3 instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                if (o4Var.h) {
                    if (!o4Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                        boolean z10 = savedStarGift.pinned_to_top;
                        boolean z11 = !z10;
                        if (!z10 && savedStarGift.unsaved) {
                            savedStarGift.unsaved = false;
                            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                            savestargift.stargift = o4Var.f859e.h(savedStarGift);
                            savestargift.unsave = savedStarGift.unsaved;
                            ConnectionsManager.getInstance(i3).sendRequest(savestargift, null, 64);
                        }
                        if (o4Var.f859e.o(savedStarGift, z11, true)) {
                            fc.a0(vp0Var.f1010a).Q(2131623981, 36, bd.H(',', "GiftsPinLimit", hp.s1(i3).K6)).j();
                        }
                        if (!z10) {
                            o4Var.f860f.v0(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ci.l6 l6Var = new ci.l6(o4Var.getContext(), o4Var.f857b, vp0Var.f1012c, o4Var.f858c, null);
                l6Var.f5452d3 = new a4(o4Var, 2);
                l6Var.K2 = new n(2, o4Var, savedStarGift);
                l6Var.j2(savedStarGift, o4Var.f859e);
                l6Var.show();
            }
        }
    }
}
