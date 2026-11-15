package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import di.j8;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.kj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.wp0;
public final class m3 implements View.OnClickListener {
    public final int f3710a;
    public final boolean f3711b;
    public final FrameLayout f3712c;
    public final Object d;
    public final Object f3713e;
    public final Object f3714f;

    public m3(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.f3710a = i7;
        this.f3712c = frameLayout;
        this.f3711b = z10;
        this.d = obj;
        this.f3713e = obj2;
        this.f3714f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f3710a;
        Object obj = this.f3714f;
        Object obj2 = this.f3713e;
        Object obj3 = this.d;
        boolean z10 = this.f3711b;
        FrameLayout frameLayout = this.f3712c;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                m60 m60Var = (m60) obj;
                wp0 wp0Var = ((c4) frameLayout).f3412a;
                if (!z10) {
                    j8 j8Var = wp0Var.f3613e;
                    int i10 = tL_starGiftCollection.collection_id;
                    j8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j8Var.a(i10, arrayList);
                    cc.a0(wp0Var.f3610a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    wp0Var.f3613e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    cc.a0(wp0Var.f3610a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750037, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                m60Var.u();
                wp0Var.o();
                return;
            default:
                ea0 ea0Var = (ea0) frameLayout;
                Context context = (Context) obj3;
                ja0 ja0Var = (ja0) obj2;
                ja0 ja0Var2 = (ja0) obj;
                ka0 ka0Var = ea0Var.f34260d0;
                kj kjVar = ka0Var.d;
                if (!z10) {
                    new cc(ka0Var, ka0Var.G).Q(2131624217, 36, org.telegram.messenger.g0.U2(hd.M0(2131750583, null), new u90(ea0Var, context, 0))).j();
                    return;
                }
                boolean z11 = kjVar.f24714k;
                kjVar.f24714k = !z11;
                ka0Var.f36345y = false;
                if (z11) {
                    kjVar.f24715l = false;
                    if (ja0Var != null) {
                        ja0Var.a(false, true);
                    }
                }
                ja0Var2.a(kjVar.f24714k, true);
                ea0Var.i();
                ea0Var.l(true);
                return;
        }
    }
}
