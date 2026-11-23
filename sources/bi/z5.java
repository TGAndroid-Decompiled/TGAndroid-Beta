package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.jj;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.x60;
public final class z5 implements View.OnClickListener {
    public final int f4300a;
    public final boolean f4301b;
    public final FrameLayout f4302c;
    public final Object d;
    public final Object f4303e;
    public final Object f4304f;

    public z5(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.f4300a = i7;
        this.f4302c = frameLayout;
        this.f4301b = z10;
        this.d = obj;
        this.f4303e = obj2;
        this.f4304f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f4300a;
        Object obj = this.f4304f;
        Object obj2 = this.f4303e;
        Object obj3 = this.d;
        boolean z10 = this.f4301b;
        FrameLayout frameLayout = this.f4302c;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                x60 x60Var = (x60) obj;
                fq0 fq0Var = ((p6) frameLayout).f3966a;
                if (!z10) {
                    di.n8 n8Var = fq0Var.f4151e;
                    int i10 = tL_starGiftCollection.collection_id;
                    n8Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    n8Var.a(i10, arrayList);
                    kc.b0(fq0Var.f4148a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    fq0Var.f4151e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    kc.b0(fq0Var.f4148a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750020, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                x60Var.v();
                fq0Var.o();
                return;
            default:
                na0 na0Var = (na0) frameLayout;
                Context context = (Context) obj3;
                sa0 sa0Var = (sa0) obj2;
                sa0 sa0Var2 = (sa0) obj;
                ta0 ta0Var = na0Var.f37742d0;
                jj jjVar = ta0Var.d;
                if (!z10) {
                    new kc(ta0Var, ta0Var.G).Q(2131624217, 36, org.telegram.messenger.g0.T2(gd.N0(2131750566, null), new da0(na0Var, context, 0))).j();
                    return;
                }
                boolean z11 = jjVar.f24982k;
                jjVar.f24982k = !z11;
                ta0Var.f39891y = false;
                if (z11) {
                    jjVar.f24983l = false;
                    if (sa0Var != null) {
                        sa0Var.a(false, true);
                    }
                }
                sa0Var2.a(jjVar.f24982k, true);
                na0Var.i();
                na0Var.l(true);
                return;
        }
    }
}
