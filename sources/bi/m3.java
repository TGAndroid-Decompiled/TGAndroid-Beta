package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import di.k8;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.kj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.wp0;
public final class m3 implements View.OnClickListener {
    public final int f3707a;
    public final boolean f3708b;
    public final FrameLayout f3709c;
    public final Object d;
    public final Object f3710e;
    public final Object f3711f;

    public m3(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.f3707a = i7;
        this.f3709c = frameLayout;
        this.f3708b = z10;
        this.d = obj;
        this.f3710e = obj2;
        this.f3711f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f3707a;
        Object obj = this.f3711f;
        Object obj2 = this.f3710e;
        Object obj3 = this.d;
        boolean z10 = this.f3708b;
        FrameLayout frameLayout = this.f3709c;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                m60 m60Var = (m60) obj;
                wp0 wp0Var = ((c4) frameLayout).f3409a;
                if (!z10) {
                    k8 k8Var = wp0Var.f3610e;
                    int i10 = tL_starGiftCollection.collection_id;
                    k8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k8Var.a(i10, arrayList);
                    cc.a0(wp0Var.f3607a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    wp0Var.f3610e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    cc.a0(wp0Var.f3607a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750037, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                m60Var.u();
                wp0Var.o();
                return;
            default:
                da0 da0Var = (da0) frameLayout;
                Context context = (Context) obj3;
                ia0 ia0Var = (ia0) obj2;
                ia0 ia0Var2 = (ia0) obj;
                ja0 ja0Var = da0Var.f33900d0;
                kj kjVar = ja0Var.d;
                if (!z10) {
                    new cc(ja0Var, ja0Var.G).Q(2131624217, 36, org.telegram.messenger.g0.U2(hd.M0(2131750583, null), new t90(da0Var, context, 0))).j();
                    return;
                }
                boolean z11 = kjVar.f24711k;
                kjVar.f24711k = !z11;
                ja0Var.f35958y = false;
                if (z11) {
                    kjVar.f24712l = false;
                    if (ia0Var != null) {
                        ia0Var.a(false, true);
                    }
                }
                ia0Var2.a(kjVar.f24711k, true);
                da0Var.i();
                da0Var.l(true);
                return;
        }
    }
}
