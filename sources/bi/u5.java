package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.y60;
public final class u5 implements View.OnClickListener {
    public final int f4113a;
    public final boolean f4114b;
    public final FrameLayout f4115c;
    public final Object d;
    public final Object f4116e;
    public final Object f4117f;

    public u5(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.f4113a = i7;
        this.f4115c = frameLayout;
        this.f4114b = z10;
        this.d = obj;
        this.f4116e = obj2;
        this.f4117f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f4113a;
        Object obj = this.f4117f;
        Object obj2 = this.f4116e;
        Object obj3 = this.d;
        boolean z10 = this.f4114b;
        FrameLayout frameLayout = this.f4115c;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                y60 y60Var = (y60) obj;
                eq0 eq0Var = ((k6) frameLayout).f3813a;
                if (!z10) {
                    di.m8 m8Var = eq0Var.f4006e;
                    int i10 = tL_starGiftCollection.collection_id;
                    m8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    m8Var.a(i10, arrayList);
                    lc.b0(eq0Var.f4003a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750377, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    eq0Var.f4006e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    lc.b0(eq0Var.f4003a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750021, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                y60Var.v();
                eq0Var.o();
                return;
            default:
                oa0 oa0Var = (oa0) frameLayout;
                Context context = (Context) obj3;
                ta0 ta0Var = (ta0) obj2;
                ta0 ta0Var2 = (ta0) obj;
                ua0 ua0Var = oa0Var.f38045d0;
                jj jjVar = ua0Var.d;
                if (!z10) {
                    new lc(ua0Var, ua0Var.G).Q(2131624217, 36, org.telegram.messenger.g0.T2(gd.M0(2131750567, null), new ea0(oa0Var, context, 0))).j();
                    return;
                }
                boolean z11 = jjVar.f24875k;
                jjVar.f24875k = !z11;
                ua0Var.f40287y = false;
                if (z11) {
                    jjVar.f24876l = false;
                    if (ta0Var != null) {
                        ta0Var.a(false, true);
                    }
                }
                ta0Var2.a(jjVar.f24875k, true);
                oa0Var.i();
                oa0Var.l(true);
                return;
        }
    }
}
